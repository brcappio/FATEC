/* Bruno Rosa Cappio
 * 16) Escreva um programa que informe se todos os caracteres alfabéticos de uma frase fornecida pelo usuário são maiúsculos.
 * 
 * 
 */


import java.util.Scanner;

public class Ex16 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
		
		int countMaiusculos = 0;
		boolean todosMaiusculos = false;
				
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 65; j <= 90; j++){
				if (frase.charAt(i) == j) {	
					countMaiusculos++;		
				}
				if (countMaiusculos == frase.length()) {
					todosMaiusculos = true;
				}
			}		
		}
		
		System.out.println(todosMaiusculos? "Todos os caracteres dessa frase sao maiusculos": "Nem todos os caracteres dessa frase sao maiusculos");

	}
}

