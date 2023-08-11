/* Bruno Rosa Cappio
 * 10
) Escreva um programa em Java para ler 10 valores, calcular
e escrever a média aritmética desses valores
lidos.
 * 
 * 
 */


import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int N;
		int contadorDentro = 0;
		int contadorFora = 0;
		int total = 0;
		for (int i = 1; i <= 10; i++){
			System.out.print("Digite o " + i + "° numero: ");
			N = leia.nextInt();
			total += N;
		}
		System.out.println("\nMedia aritmetica: " + (total/10));
	}
}

