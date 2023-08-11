/*
 * 4)Elabore um programa em java que contenha um método
 *  que aceite um valor inteiro e retorne o número comos dígitos invertidos.
 *  O valor deve ser solicitado ao usuário.
 * 
 * 
 */


import java.util.Scanner;

public class Ex4 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Numero numero = new Numero();
		int valor = 5;
		System.out.println("Digite 0 para sair do programa\n");
		do {
			System.out.print("Entre com um numero: ");
			valor = leia.nextInt();
			
			if (valor > 0) {
				numero.setNumero(valor);
				
				System.out.println("O inverso do numero é: " + numero.inverter() + "\n");
			} else {
				System.out.print("\nSaindo...");
			}
						
		} while(valor != 0);
		
		System.out.print("\n\tFim do programa!");
	}
}

