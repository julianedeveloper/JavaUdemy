package Fundamentos;

public class relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a==b);
		
		System.out.println(3 > 4); //bigger
		System.out.println(3 >= 3); //bigger or equal
		System.out.println(3 < 7); //smaller
		System.out.println(30 <= 7); //smaller or equal
		System.out.println(30 != 7); //different of
		
		double nota = 5;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}

}
