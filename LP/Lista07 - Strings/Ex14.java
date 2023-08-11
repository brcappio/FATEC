/* Bruno Rosa Cappio
 * 14) Escreva um programa para ler uma frase e um caractere. Sempre que o caractere lidoaparecer na frase ele deve ser substituído por asterisco. Por exemplo, se os valores fornecidosfossem para a frase: o dia esta nublado, e para o caractere: a, o programa deverá fornecer oseguinte resultado: o di* est* nubl*do.
 * 
 * 
 */


import java.util.Scanner;

public class Ex14 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine().toLowerCase();
		
		System.out.print("Digite um caracter: ");
		char caracter = leia.nextLine().toLowerCase().charAt(0);
		
		String saida = "";
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == caracter) {
				saida += "*";
			} else {
				saida += frase.charAt(i);
			}
		}
		System.out.println(saida);

	}
}

