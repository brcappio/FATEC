/* Bruno Rosa Cappio
58) Solicite ao usuário os dois primeiros termos da sequência de Ricci e gere os 10 próximos termos.
*/

import java.util.Scanner;


public class Ex58 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int termoAnterior = 0;
		int termoAtual = 0;
		
		System.out.print("Informe o primeiro termo: ");
		termoAnterior = leia.nextInt();
		
		System.out.print("Informe o segundo termo: ");
		termoAtual = leia.nextInt();
		
		System.out.print(termoAnterior + " ");
		System.out.print(termoAtual + " ");
		
		for (int i = 0; i < 10; i++) {
			int termoProximo = termoAnterior + termoAtual;
			System.out.print(termoProximo + " ");
			termoAnterior = termoAtual;
			termoAtual = termoProximo;
		}
	}
}

