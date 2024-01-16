package Fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalho = true;
		boolean supertrabalho = true;
		
		boolean aulaDeEquitacao = trabalho || supertrabalho;
		boolean natacao = trabalho && !supertrabalho;
		boolean floripa = supertrabalho;
		boolean gym = trabalho ^ supertrabalho;
		
		
		System.out.println("Ride classes, will take?\"" + aulaDeEquitacao);
		System.out.println("Will take swimming classes?\"" + natacao);
		System.out.println("Floripa for fun?\"" + floripa);
		System.out.println("Gym to Fer. Yes or no? \"" + gym);
		
		
	}

}
