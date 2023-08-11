/* Bruno Rosa Cappio
61) Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a soma dos termos.
* 
2/1 + 4/3 + 6/5 + 8/7 + 10/9 + 12/11 + ...
* 
*/

import java.util.Scanner;


public class Ex61 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a quantidade de termos desejada: ");
		int qtdTermos = leia.nextInt();
		
		double soma = 0.0;
		int denominador = 1;
		
		for(int i = 1; i <= qtdTermos; i++) {
			int numerador = i * 2;
			soma += (double) numerador / denominador;
			System.out.print(numerador + "/" + denominador);
			if(i < qtdTermos) {
				System.out.print(" + ");
			}
			denominador += 2;
		}
		
		System.out.println();
		System.out.println("Soma dos termos: " + soma);
	}
}

