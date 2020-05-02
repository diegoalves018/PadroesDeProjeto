package Singleton;

import java.util.Calendar;

public class Data {

	private byte dia;
	private byte mes;
	private short ano;

	public Data(Calendar calendario) {
		dia = (byte) calendario.get(Calendar.DAY_OF_MONTH);
		mes = (byte) (calendario.get(Calendar.MONTH)+1);
		ano = (short) calendario.get(Calendar.YEAR);
	}

	public byte getDia() {
		return dia;
	}

	public byte getMes() {
		return mes;
	}

	public short getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}
}
