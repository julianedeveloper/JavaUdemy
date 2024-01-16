package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Boa tarde".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Ung";
		var sobrenome = "Ju";
		var idade = 34;
		var salario = 17700.77;
		
		System.out.println("Nome: " + nome + "\nSobrenome:" + sobrenome + "\nIdade: " + idade
				+ "\nSalario: " + salario + "\n\n");
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade 
				+ " anos." + "\nTem o salario de: " + salario;
		System.out.println(maisUmaFrase);
		
//Printf interpola as variáveis à frase.
		System.out.printf("A senhora %s %s tem %d anos e ganha %.2f reais.", nome, sobrenome,
				idade, salario);
		
//.format também interpola as variáveis à frase.
		String frase = String.format(" A senhora %s %s, com apenas %d anos, ganha US$ %2f libras .", nome, sobrenome,
				idade, salario);
		System.out.println(frase);
	}

}
