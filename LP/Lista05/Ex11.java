/* Bruno Rosa Cappio
 * 11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’ e ‘/’.
 * Calcule e mostre a operação efetuada e o seu resultado.
 * 
 * 
 */

import java.util.Scanner;

public class Ex11 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		double n1 = leia.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double n2 = leia.nextDouble();
		
		System.out.println("\nEscolha a operacao desejada\nDigite '+' para adicao\nDigite '-' para subtracao\nDigite '*' para multiplicacao\nDigite '/' para divisao\n");
		System.out.print("Digite a operacao desejada: ");	
		String operacao = leiaStr.nextLine();
		
		double resultado;
		
		switch(operacao) {
			case "+":
				resultado = n1 + n2;
				System.out.println("O resultado da operacao eh: " + resultado);
				break;
			case "-":
				resultado = n1 - n2;
				System.out.println("O resultado da operacao eh: " + resultado);
				break;
			case "*":
				resultado = n1 * n2;
				System.out.println("O resultado da operacao eh: " + resultado);
				break;
			case "/":
				resultado = n1 / n2;
				System.out.println("O resultado da operacao eh: " + resultado);
				break;
		}
	}
}

