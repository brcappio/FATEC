/* Bruno Rosa Cappio
 * 3) Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz
 * 
 * 
 */

import java.util.Scanner;

public class Ex3 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaString = new Scanner(System.in);
		Lampada3Estados minhaLampada = new Lampada3Estados(3);
		String escolha;
		
		do {
			System.out.println("Estado atual da lampada: " + minhaLampada.getEstado());
			System.out.print("\nDeseja alterar o estado da lampada? (S/N): ");
			escolha = leiaString.nextLine();
			
			if (escolha.equalsIgnoreCase("S")) {
				System.out.println("\n--MENU--");
				System.out.println("1 - Ligada");
				System.out.println("2 - Meia-Luz");
				System.out.println("3 - Desligada");
				System.out.print("Digite o estado desejado: ");
				int estado = leia.nextInt();
				minhaLampada.setEstado(estado);
								
			} else {
				System.out.println("Fim do programa.");
			}		
		} while (escolha.equalsIgnoreCase("S"));
	}
}

