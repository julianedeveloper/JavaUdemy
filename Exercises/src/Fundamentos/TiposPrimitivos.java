package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_897_098L;
		
		//Tipos numéricos reais
		float salario = 11_445.79F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = true;
		
		//Tipo character ou char
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365 + " trabalhados.");
		
		//Número de viagens
		System.out.println(numerosDeVoos / 2 + " voos.");
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas + " pontos por real.");
		System.out.println(id + " recebe: " + salario + " reais.");
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
