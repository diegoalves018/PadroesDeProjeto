package Singleton;

import java.util.Calendar;

public class Horario {

	private byte hora;
	private byte minuto;
	private byte segundo;

	public Horario(Calendar calendario) {
		hora = (byte) calendario.get(Calendar.HOUR_OF_DAY);
		minuto = (byte) calendario.get(Calendar.MINUTE);
		segundo = (byte) calendario.get(Calendar.SECOND);
	}

	public byte getHora() {
		return hora;
	}

	
	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = (byte) hora;
		} else {
			throw new RuntimeException("*******Hora invalida******");
		}
	}


	public byte getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = (byte) minuto;
		} else {
			throw new RuntimeException("*******Minuto invalido******");
		}
	}

	public byte getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = (byte) segundo;
		} else {
			throw new RuntimeException("*******Segundo invalido******");
		}
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}

}