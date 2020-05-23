package Strategy;

public class CalcFreteNormal implements CalcFrete {
	public double calcFrete(TipoFrete fn){
		double valor = 0;
			if(fn.fragilidade == "fragil")
				valor += 10;
			if(fn.peso > 10)
				valor +=15;
			return valor +=fn.distancia * 1.15 + fn.taxa;
	}
}
