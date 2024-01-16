package Fundamentos;

public class CircunferenceArea {
	public static void main(String[] args) {
		double raio = 3.4;
		//final não permite o valor ser alterado. Se torna uma constante.
		final double PI = 3.14159;
		double area = PI* raio * raio;
		System.out.println(area);
		
	}

}
