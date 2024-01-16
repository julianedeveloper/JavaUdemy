package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		//Implícita
		double a = 1;
		System.out.println(a);
		//Explícita
		float b= (float) 1.123456789999;
		System.out.println(b);
		
		int c = 340;
		//Aqui o valor de byte por comportar somente até 100 bytes, não vai exibir
		//o exato número desejado, mas sim um cálculo de números negativos em uma 
		//contagem regressiva.
		byte d = (byte) c; // Explícita
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; // Explícita
		System.out.println(f);
	}

}
