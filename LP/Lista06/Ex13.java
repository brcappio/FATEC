/* Bruno Rosa Cappio
 * 13
) Escreva um programa em Java para ler 10 números. Todos os números lidos com valor inferior a 40
devem ser somados. Escreva o valor final da soma efet
uada
 * 
 * 
 */


import java.util.Scanner;

public class Ex13 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0;
		int soma = 0;
		for (int i = 1; i <= 10; i++){
			System.out.print("Digite o " + i + "° numero: ");
			n = leia.nextInt();
			if (n < 40){
				soma += n;
			}			
		}
		System.out.println("\nSoma total: " + soma);
	}
}

