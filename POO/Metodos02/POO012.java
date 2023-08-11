/* Bruno Rosa Cappio
 * 7) [POO-012] Crie um programa que pergunte ao usuário se ele deseja lançar/jogar um dado. Por meio de
um método chamado dado(), retorne, através de sorteio aleatório, um número de 1 até 6. O programa
deve ser executado enquanto o usuário quiser continuar jogando o dado.
 * 
 * 
 */

import java.util.Scanner;

public class POO012 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String escolha;
		
		do{
			System.out.print("Deseja digitar jogar o dado [s/n]: ");
			escolha = leiaStr.nextLine();
			if (escolha.equals("s")) {
				int numeroDado = dado();
				System.out.println("O dado caiu no " + numeroDado);
				System.out.println();
			}			
		} while (escolha.equals("s"));
	}
	static int dado() {
		int numeroDado = (int)(Math.random(1) * 7);
		return numeroDado;
	}
}

