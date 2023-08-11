/* Bruno Rosa Cappio
 * 17) Escreva um programa que leia duas frases e a seguir informe se as frases fornecidas são iguais. Observação: realizar esta verificação caractere por caractere.
 * 
 * 
 */


import java.util.Scanner;

public class Ex17 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase1 = leia.nextLine();
		
		System.out.print("Digite outra frase: ");
		String frase2 = leia.nextLine();
		
		boolean frasesIguais = false;
		int count = 0;
				
		for (int i = 0; i < frase1.length(); i++) {
			for (int j = 0; j < frase2.length(); j++) {
				if (frase1.charAt(i) == frase2.charAt(j)) {
					count++;
				}
				if (count == frase1.length() && count == frase2.length()) {
					frasesIguais = true;
				}
			}			
		}
		
		System.out.println(frasesIguais? "As frases sao iguais": "As frases nao sao iguais");

	}
}

