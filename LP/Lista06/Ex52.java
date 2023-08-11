/* Bruno Rosa Cappio
52) Solicite um número inteiro ao usuário e informe se ele pertence a sequência de Fibonacci ou não.
*/

import java.util.Scanner;


public class Ex52 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite um número inteiro: ");
	int num = leia.nextInt();
	
	boolean pertenceFibonacci = false;
	int a = 0;
	int b = 1;
	int c;
	while (b <= num) {
		if (num == b) {
			pertenceFibonacci = true;
			break;
		}
		c = a + b;
		a = b;
		b = c;
	}
	
	if (pertenceFibonacci) {
		System.out.println(num + " pertence à sequência de Fibonacci.");
	} else {
		System.out.println(num + " não pertence à sequência de Fibonacci.");
	}
	}
}

