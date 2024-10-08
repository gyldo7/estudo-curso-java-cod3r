package fundamentos.operadores;

import java.util.Locale;

public class Relacionais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// informação interessante
		int a = 97;
		int b = 'a';
		System.out.println(a == b);
		
		//
		System.out.println(3 > 4);
		System.out.println(3 >= 4);
		System.out.println(3 < 4);
		System.out.println(3 <= 4);
		System.out.println(3 != 4);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
