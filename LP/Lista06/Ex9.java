/* Bruno Rosa Cappio
 * 9
) Escreva u
m programa em Java para ler 10 valores e escrever quantos desses valores lidos estão no
intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.
 * 
 * 
 */

import java.util.Scanner;

public class Ex9 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int N;
		int contadorDentro = 0;
		int contadorFora = 0;
		for (int i = 1; i <= 10; i++){
			System.out.print("Digite um numero: ");
			N = leia.nextInt();
			if (N >= 10 && N <= 20){
				contadorDentro++;
			} else {
				contadorFora++;
			}						
		}
		System.out.println("\nQuantidade de numeros FORA do intervalo [10,20]: " + contadorFora);
		System.out.println("\nQuantidade de numeros DENTRO do intervalo [10,20]: " + contadorDentro);
	}
}
