package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		
		// Minha solucão
		
		double primeiraExpressao = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		double segundaExpressao = Math.pow((((1 - 5) * (2 - 7)) / 2), 2);
		
		
		
		double valorExpressaoTotal = Math.pow(primeiraExpressao - segundaExpressao, 3) / Math.pow(10, 3); 
		
		System.out.println(primeiraExpressao);
		System.out.println(segundaExpressao);
		System.out.println(valorExpressaoTotal);
		
		// Solução professor
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);

		double resultado = superior / inferior;
		 System.out.println("O resultado é " + resultado);
	}

}
