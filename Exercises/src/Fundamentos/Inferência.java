package Fundamentos;

public class Inferência {
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		var b = "Texto";
		//b = 12; aqui dára erro, pois a inferência diz que o tipo primitivo dessa variável e String, não número.
		
		//Inferência veio a partir do JDK 9. O Java reconhecer o tipo da variável sem declará-lo explicitamente.
	}

}
