package Adapter;

public class Main {

	public static void main(String[] args) {

		DataInvertida dt = new DataInvertida();
		
		Adapter adpt = new Adapter(dt);
		
		adpt.criarDataInvertida();

	}

}
