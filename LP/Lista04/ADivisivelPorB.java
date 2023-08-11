/*
 * 6 - Crie um arquivo chamado ADivisivelPorB.java. Implemente um programa em Java que guardedois valores numéricos inteiros: a e b, informados
pelo usuário, sendo a de 0 até 1000 (inclusos) e b de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos.
Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário.
*  Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário.
 */


import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de A (valor deve ser de 0 a 1000): ");
		int a = leia.nextInt();
		
		System.out.print("Digite o valor de B (valor deve ser de 0 a 20): ");
		int b = leia.nextInt();
		
		System.out.println(a <= 1000 && a >= 0 || b <= 20 && b >= 0 ? a %b == 0 ? "Eh divisivel" : "Nao eh divisivel" : "Informe valores validos!");
	}
}

