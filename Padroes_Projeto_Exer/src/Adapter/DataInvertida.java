package Adapter;

public class DataInvertida {

	public void dataInvertida(int dia, int mes, int ano) {

		if (mes >= 1 && mes <= 12) {
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia <= 31) {
					mes = (int) mes;
				} else {
					System.out.println("Erro na data escolhida! Dia " + dia + " é inválido.");
				}
				break;
			case 04:
			case 6:
			case 9:
			case 11:
				if (dia <= 30) {
					mes = (int) mes;
				} else {
					System.out.println("Erro na data escolhida! Dia " + dia + " é inválido.");
				}
				break;
			case 02:
				if (ano % 4 == 0 && ano % 100 != 0 && dia <= 29) {
					mes = (int) mes;
				} else if (ano % 4 != 0 && dia <= 28) {
					mes = (int) mes;
				} else {
					System.out.println("Erro na data escolhida! Dia " + dia + " é inválido.");
				}
			}

		}

		System.out.println(ano + "/" + mes + "/" + dia);

	}

}
