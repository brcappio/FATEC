/* Bruno Rosa Cappio
 * 15) Escreva um programa que informe se em uma frase fornecida pelo usuário existem caracteres numéricos.
 * 
 * 
 */


import java.util.Scanner;

public class Ex15 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine().toLowerCase();
		boolean temNumerico = false;
		int countNumerico = 0;
				
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 48; j <= 57; j++){
				if (frase.charAt(i) == j) {
					temNumerico = true;
					countNumerico++;
				}
			}		
		}
		
		System.out.println(temNumerico? "Existem " + countNumerico + " numericos nessa frase" : "Nao existem numericos nessa frase");

	}
}

