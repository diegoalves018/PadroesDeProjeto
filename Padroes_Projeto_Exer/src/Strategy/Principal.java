package Strategy;
public class Principal {
	public static void main(String[] args) {
		TipoFrete fr1 = new FreteNormal();
		fr1.peso = 15;
		fr1.fragilidade = "fragil";
		fr1.distancia = 150;
		Frete frete = new Frete(fr1);
		
		TipoFrete fr2 = new FreteSedex();
		fr2.peso = 15;
		fr2.fragilidade = "fragil";
		fr2.distancia = 150;
		Frete frete2 = new Frete(fr2);
		
		frete2.calcFrete();
		frete.calcFrete();
	}
}
