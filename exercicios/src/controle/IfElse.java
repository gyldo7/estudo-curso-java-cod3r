package controle;

import java.util.Locale;
import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String valor = JOptionPane.showInputDialog("Informe o número:");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		}
		
		if(numero % 2 == 1) {
			System.out.println("Número ímpar!");
		}
		
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar!");
		}
		
		
		
		
		
	}

}
