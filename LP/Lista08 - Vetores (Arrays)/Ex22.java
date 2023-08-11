/* Bruno Rosa Cappio
 * 22) Escreva um programa para ler um vetor AC de N posições, onde N é menor ou igual a 20 e imprimir seus elementos.
 * O usuário deve informar o número de posições e um número máximo para o tamanho dos elementos. 
 * O programa deve validar a entrada dos dados e imprimir o vetor ao final.
 * 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;

public class Ex22 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Digite o tamanho do vetor AC (deve ser menor ou igual a 20 e maior que 0): ");
		int N = leia.nextInt();
		while (N < 0 || N > 20) {
			System.out.print("O valor deve ser menor ou igual a 20 e maior que 0, digite novamente: ");
			N = leia.nextInt();
		}
		
		int AC[] = new int[N];
		
		System.out.print("Digite o numero maximo para o tamanho dos elementos: ");
		int limite = leia.nextInt();
		
		for (int i = 0; i < AC.length; i++){
			AC[i] = (int) (Math.random() * limite + 1);
		}		
		
		System.out.println("\n\nVetor AC: ");
		for (int i = 0; i < AC.length; i++) {
			System.out.print(AC[i] + " ");
		}
		
		
		//Extra
		Arrays.sort(AC);
		System.out.println("\n\nVetor AC em ordem crescente: ");
		for (int i = 0; i < AC.length; i++) {
			System.out.print(AC[i] + " ");
		}
	}
	
}



