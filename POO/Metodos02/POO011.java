/* Bruno Rosa Cappio
 * 6) [POO-011] Crie um programa que solicite ao usuário números inteiros. A cada número inserido,
perguntar ao usuário se ele deseja informar outro número. Através de um método, verifique e retorne o
menor dos valores.
* Entrada:										 Saída:
Entre com um número inteiro:     8 				 O menor é: 2
* Inserir outro [s/n]: s
Entre com outro número inteiro:  2
* Inserir outro [s/n]: n

Entre com um número inteiro:   -48 				 O menor é: -48
* Inserir outro [s/n]: s
Entre com outro número inteiro: 48
* Inserir outro [s/n]: n

Entre com um número inteiro:    17 				 O menor é: 17
* Inserir outro [s/n]: s
Entre com outro número inteiro: 17
* Inserir outro [s/n]: s
* Entre com outro número inteiro: 34
  Inserir outro [s/n]: n
 * 
 * 
 */

import java.util.Scanner;

public class POO011 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int n1 = leia.nextInt();		
		int menor,n2;
		String escolha = "s";
		
		System.out.print("Deseja digitar outro numero [s/n]: ");
		escolha = leiaStr.nextLine();
		if (escolha.equals("s")) {			
			System.out.print("Digite outro numero: ");
			n2 = leia.nextInt();
			
			menor = verificaMenor(n1,n2);
			System.out.println("\nO menor numero eh: " + menor);
		} else {
			System.out.println("\nNumero: " + n1);
		}					
	}
	
	static int verificaMenor(int n1, int n2){
		return Math.min(n1,n2);
	}
}

