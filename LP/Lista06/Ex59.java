/* Bruno Rosa Cappio
59) Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois solicite a quantidade de termos que ele deseja gerar. Imprimir o resultado.
*/

import java.util.Scanner;

public class Ex59 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);

		int termo1, termo2, qtdeTermos;
		int[] sequenciaRicci;

		System.out.print("Digite o primeiro termo: ");
		termo1 = leia.nextInt();

		System.out.print("Digite o segundo termo: ");
		termo2 = leia.nextInt();

		System.out.print("Digite a quantidade de termos: ");
		qtdeTermos = leia.nextInt();

		sequenciaRicci = new int[qtdeTermos];
		sequenciaRicci[0] = termo1;
		sequenciaRicci[1] = termo2;

		for (int i = 2; i < qtdeTermos; i++) {
			sequenciaRicci[i] = sequenciaRicci[i - 1] + sequenciaRicci[i - 2];
		}

		System.out.print("Sequência de Ricci: ");
		for (int i = 0; i < qtdeTermos; i++) {
			System.out.print(sequenciaRicci[i] + " ");
		}

	}
}

