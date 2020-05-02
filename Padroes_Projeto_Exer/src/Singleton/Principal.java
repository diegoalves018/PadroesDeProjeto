package Singleton;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Data: "+Relogio.getInstancia().getData());
		System.out.println("Hora: "+Relogio.getInstancia().getHorario());

	}

}
