package Singleton;

import java.util.Calendar;

public class Relogio {

	private static volatile Relogio instancia;

	private Relogio() {

	}

	public static synchronized Relogio getInstancia() {
		if (instancia == null) {
			synchronized (Relogio.class) {
				if (instancia == null) {
					instancia = new Relogio();
				}
			}
		}
		return instancia;
	}

	public Data getData() {
		return new Data(Calendar.getInstance());
	}

	public Horario getHorario() {
		return new Horario(Calendar.getInstance());
	}

}
