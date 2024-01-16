package Fundamentos;

public class Temperature {
	public static void main(String[] args) {
		//(°F - 32) x 5/9 = °C
		// F e C are variables. 32 e 5/9 must to be final.
		//Usar 9.0 na divisão
		
		final double ajuste = 32;
		final double fator = 5.0/9.0;
		double fahrenheit = 86;
		double celsius = (fahrenheit - ajuste) * fator;
		
		fahrenheit = 150;
		celsius = (fahrenheit - ajuste) * fator;
		System.out.println(fahrenheit + " graus em Fanhereit equivale a " + celsius + " em graus Celsius.");

	}
}
