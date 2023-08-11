/* Bruno Rosa Cappio
 * 5
) Modi
fique o exercício anterior para
aceitar somente valores maiores que 0 para N
. Caso o valor
informado (para N) não seja maior que 0, deverá ser lido um novo valor para N
 * 
 */

import java.util.Scanner;

public class Ex5 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int N;
		do {
			System.out.print("Digite um valor: ");	
			N = leia.nextInt();
			
			if (N <= 0){
				System.out.println("\nDigite um valor maior que zero!");
			}
			for (int i = 1; i <= N; i++){
				System.out.println(i);				
			}
		} while (N > 0);
	}
}

