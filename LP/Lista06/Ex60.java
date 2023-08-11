/* Bruno Rosa Cappio
60) Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois solicite um número e verifique se o número informado pertence à sequência de Ricci ou não.
*/

import java.util.Scanner;


public class Ex60 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int termo1, termo2, num;
		
		System.out.print("Digite o primeiro termo da sequência de Ricci: ");
		termo1 = leia.nextInt();
		
		System.out.print("Digite o segundo termo da sequência de Ricci: ");
		termo2 = leia.nextInt();
		
		System.out.print("Digite um número para verificar se pertence à sequência de Ricci: ");
		num = leia.nextInt();
		
		if(num == termo1 || num == termo2) {
			System.out.println(num + " pertence à sequência de Ricci.");
			leia.close();
			return;
		}
		
		int proximo = termo1 + termo2;
		while(proximo <= num) {
			if(num == proximo) {
				System.out.println(num + " pertence à sequência de Ricci.");
				leia.close();
				return;
			}
			termo1 = termo2;
			termo2 = proximo;
			proximo = termo1 + termo2;
		}
		
		System.out.println(num + " não pertence à sequência de Ricci.");
		}
}

