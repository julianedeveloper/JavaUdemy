package Fundamentos;

public class Unários {
	public static void main(String[] args) {
		 int a = 1; 
		 int b = 2;
		 //pós fixado
		 a++; // a = a + 1
		 a--; // a = a - 1
		 //pré fixado
		 ++b; // b = b + 1
		 --b; // b = b - 1
		 
		 System.out.println(a);
		 System.out.println(b);
		 
		 System.out.println("Mini Desafio:");
		 System.out.println(++a == b--);
		 System.out.println(a == b);
		 System.out.println(a);
		 System.out.println(b);
	}

}
