/* Bruno Rosa Cappio
 * 2) [POO-007] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que
receba esses 2 números como parâmetros de entrada, verifique e retorne o menor dos dois valores.
* Restrição: NÃO usar o pacote Math.

Entrada:										 Saída:
Entre com um número inteiro:     8 				 O menor é: 2
Entre com outro número inteiro:  2

Entre com um número inteiro:   -48 				 O menor é: -48
Entre com outro número inteiro: 48

Entre com um número inteiro:    17 				 O menor é: 17
Entre com outro número inteiro: 17
 * 
 * 
 */

import java.util.Scanner;

public class POO007 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int n1 = leia.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = leia.nextInt();
		
		int menor = verificaMaiorMenor(n1,n2);
		System.out.println("O menor numero eh: " + menor);
	}
	
	static int verificaMaiorMenor(int n1, int n2) {
		if (n1 < n2) {
			return n1;
		} else {
			return n2;
		}
	}
}

