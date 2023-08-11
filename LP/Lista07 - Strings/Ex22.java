/* Bruno Rosa Cappio
 * 22) Dados uma frase e uma palavra, escreva um programa que verifique o número de vezes que a palavra ocorre na frase. Exemplo: Na frase ANA E MARIANA GOSTAM DE BANANA, apalavra ANA ocorre 4 vezes.
 * 
 * 
 */


import java.util.Scanner;

public class Ex22 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
		
		System.out.print("Digite uma palavra: ");
		String palavra = leia.nextLine();
		
		String testaPalavra = "";
		
		String[] fraseSplitada = frase.split(" ");
		
		int ocorrencias = 0;
		
		for (int i = 0; i <= frase.length() - palavra.length(); i++) {
            if (frase.substring(i, i + palavra.length()).equalsIgnoreCase(palavra)) {
                ocorrencias++;
            }
        }
        
        System.out.println("A palavra '" + palavra + "' ocorre " + ocorrencias + " vezes na frase.");

	}
}

