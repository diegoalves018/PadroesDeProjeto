package Adapter;

public class Adapter extends Data {

	private DataInvertida dataInvertida;

	@Override
	public int getAno() {
		// TODO Auto-generated method stub
		return super.getAno();
	}

	@Override
	public int getMes() {
		// TODO Auto-generated method stub
		return super.getMes();
	}

	@Override
	public int getDia() {
		// TODO Auto-generated method stub
		return super.getDia();
	}

	public Adapter (DataInvertida dataInvertida) {
		this.dataInvertida = dataInvertida;
	}

	public void criarDataInvertida() {

		dataInvertida.dataInvertida(getDia(), getMes(), getAno());
	}

}
