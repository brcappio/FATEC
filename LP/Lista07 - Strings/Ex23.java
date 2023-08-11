/* Bruno Rosa Cappio
 * 23) Elabore um programa para obter o nome completo de uma pessoa e a seguir forneça osobrenome do nome completo informado. Por exemplo, para o nome completo: Omero Francisco Bertol, o programa deverá fornecer como resultado: Bertol
 * 
 * 
 */


import java.util.Scanner;

public class Ex23 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
				
		String[] fraseSplitada = frase.split(" ");
						        
        System.out.println("Sobrenome: " + fraseSplitada[fraseSplitada.length-1]);

	}
}

