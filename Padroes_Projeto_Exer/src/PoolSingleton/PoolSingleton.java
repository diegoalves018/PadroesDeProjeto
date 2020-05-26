package PoolSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PoolSingleton {

	private static int limitInstancia = 5;
	private static int atual = 0;
	private static PoolSingleton[] instancias;
	private Connection connection;
	protected static String urlBD = "urlBD";

	public PoolSingleton() {
	}

	public static void criarInstancia() {
		instancias = new PoolSingleton[limitInstancia];

		for (int i = 0; i < limitInstancia; i++) {
			instancias[i] = new PoolSingleton();
		}
	}

	public void conectar() throws SQLException {
		if (this.connection == null || this.connection.isClosed()) {
			this.connection = DriverManager.getConnection(urlBD);
		}
	}

	public static PoolSingleton getInstancia() throws SQLException {
		if (instancias == null) {
			criarInstancia();
		}

		atual = (atual + 1) % limitInstancia;
		PoolSingleton instancia = instancias[atual];
		instancia.conectar();

		return instancia;
	}

}
