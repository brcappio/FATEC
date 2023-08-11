/* Bruno Rosa Cappio
 * 3) [POO-008] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que
receba esses 2 números como parâmetros de entrada, verifique e retorne o maior dos dois valores.
* Restrição: USAR o pacote Math, em específico, o método max().

Entrada:										 Saída:
Entre com um número inteiro:     8 				 O maior é: 8
Entre com outro número inteiro:  2

Entre com um número inteiro:   -48 				 O maior é: 48
Entre com outro número inteiro: 48

Entre com um número inteiro:    17 				 O maior é: 17
Entre com outro número inteiro: 17
 * 
 * 
 */

import java.util.Scanner;

public class POO008 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int n1 = leia.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = leia.nextInt();
		
		int maior = verificaMaior(n1,n2);
		System.out.println("O maior numero eh: " + maior);
	}
	
	static int verificaMaior(int n1, int n2) {
		return Math.max(n1,n2);
	}
}

