package Fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		int a = 6 * (3 + 2);
		int b = (int)Math.pow(a, 2);
		int c = 3 * 2;
		double d = b / c;
		
		double e = (5 - 1) * (7 - 2);
		int f = (int) Math.pow(e, 2);
		int g = f / 2;
		
		double h = g - d;
		double i = Math.pow(h, 3);
		int j = (int)Math.pow(10, 3);
		double k = i / j;
		
		System.out.println(d);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

}