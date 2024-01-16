package Fundamentos;

public class Atribuição {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c =+ b; // (Atribuição aditiva)c = c + b;
		c -= a; // (Atribuição subtrativa) c = c - a;
		c *= b; // (Atribuição multiplicativa) c = c * b;
		c /= a; // (Atribuição divisiva) c = c / b;
		
		System.out.println(c);
		
		a %= 2; // (Atribuição modular) c = c % 2;
		System.out.println(c);
	}

}
