/* Bruno Rosa Cappio
 * 7
) Esc
reva um programa em Java para ler um valor inteiro
(aceitar somente valores entre 1 e 10)
e escrever
a tabuada de 1 a 10 do valor lido.
 * 
 * 
 */


import java.util.Scanner;

public class Ex7 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int N;
		do {
			System.out.print("Digite um valor de 1 a 10: ");	
			N = leia.nextInt();
			
			if (N <= 0){
				System.out.println("\nDigite um valor de 1 a 10!!!");
			} else {
				for (int i = 1; i <= 10; i++){
					System.out.println(N*i);				
				}
			}
			
		} while (N > 0);
	}
}


