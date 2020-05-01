package Singleton;


// Testes
public class Principal {
    public static void main(String[] args) {
        byte dia = 3;
        byte mes = 2;
        short ano = 2020;
        
        byte hora = 18;
        byte minuto = 30;
        byte segundo = 50;
        
        Horario h = new Horario (hora, minuto, segundo);
        System.out.println(h);
        
        Data d = new Data (dia, mes, ano);
        System.out.println(d);
       
    }    
}