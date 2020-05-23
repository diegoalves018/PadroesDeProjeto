package Strategy;

public class Frete {
	TipoFrete tipo;
	CalcFrete calcFrete;
	
	Frete(TipoFrete tipo){
		this.tipo = tipo;
	}
	public double calcFrete(){
		double valor = 0;
		if(tipo instanceof FreteNormal){
			System.out.println("Frete Normal");
			calcFrete = new CalcFreteNormal();
			valor = calcFrete.calcFrete(tipo);
		} else if(tipo instanceof FreteSedex){
			System.out.println("Frete Sedex");
			calcFrete = new CalcFreteSedex();
			valor = calcFrete.calcFrete(tipo);
		}
		System.out.println(valor);
		return valor;
	}
}
