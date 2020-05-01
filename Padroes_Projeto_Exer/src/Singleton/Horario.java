package Singleton;

public class Horario {
    private byte hora;
    private byte minuto;
    private byte segundo;
  
public Horario(int hora,int minuto,int segundo) {
     setHora(hora);
     setMinuto(minuto);
     setSegundo(segundo);
	  
  }

public void setHora(int hora) {
	if (hora>=1 && hora<=23)
		this.hora=(byte)hora;
		else {
			throw new RuntimeException("Hora "+hora+" é  inválida");
			}		
}
public void setMinuto(int minuto) {
	if (hora>=0 && minuto<60)
		this.minuto=(byte)minuto;
		else {
			throw new RuntimeException("Minuto "+minuto+" é  inválido");
			}	
}
	public void setSegundo(int segundo) {
		if (segundo>=0 && segundo<60)
			this.segundo=(byte)segundo;
			else {
				throw new RuntimeException("Segundo "+segundo+" é  inválido");
				}	
		
		
	}

	@Override
	public String toString() {
		return this.hora + ":" + this.minuto +":"+ this.segundo;
	}
	
}