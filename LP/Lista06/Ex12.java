/* Bruno Rosa Cappio
 * 12
) Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10
números lidos
 * 
 * 
 */


import java.util.Scanner;

public class Ex12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0;
		int soma = 0;
		for (int i = 1; i <= 10; i++){
			System.out.print("Digite o " + i + "° numero: ");
			n = leia.nextInt();
			soma += n;
		}
		System.out.println("\nSoma total: " + soma);
	}
}

