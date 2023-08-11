// Bruno Rosa Cappio

package ex3;

import java.util.Scanner;

public class Ex3 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a quantidade de termos desejada: ");
		int qtdTermos = leia.nextInt();
		
		double soma = 0.0;
		int denominador = 1;
		int sinal = 1;
		
		for(int i = 1; i <= qtdTermos; i++) {
			int numerador = i * 2;
			soma += (double) sinal * numerador / denominador;
			System.out.print(numerador + "/" + denominador);
			if(i < qtdTermos) {
				System.out.print(" " + (sinal > 0 ? "-" : "+") + " ");
			}
			denominador += 2;
			sinal *= -1;
		}
		
		System.out.println();
		System.out.println("Soma dos termos: " + soma);
	}
}