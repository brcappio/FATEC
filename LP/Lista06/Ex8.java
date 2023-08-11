/* Bruno Rosa Cappio
 * 8
) Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos são
NEGATIVOS.
 * 
 * 
 */


import java.util.Scanner;

public class Ex8 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int N;
		int contadorNegativo = 0;
		for (int i = 1; i <= 10; i++){
			System.out.print("Digite um numero: ");
			N = leia.nextInt();
			if (N < 0){
				contadorNegativo++;
			}			
		}
		System.out.println("Quantidade de negativos: " + contadorNegativo);
	}
}

