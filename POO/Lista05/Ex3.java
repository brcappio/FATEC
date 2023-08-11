/*
 * 3) Elabore um programa em java que contenha um método booleano que teste se um ano é ou não bissexto.
 * Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que sejam também divisíveis por 400.
 * 
 * 
 */

import java.util.Scanner;

public class Ex3 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Ano meuAno = new Ano();
		int opcao = 5;
		do {
			System.out.println("\n===MENU===");
			System.out.println("1) Entrar com um ano");
			System.out.println("2) Ver ano inserido");
			System.out.println("3) Testar ano");			
			System.out.println();
			System.out.println("0) SAIR");
			System.out.println("============");
			System.out.print("Opção: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("\nInsira o ano: ");
					int ano = leia.nextInt();
					meuAno.setAno(ano);
					break;
				case 2:
					System.out.print("\n\t\tAno inserido: " + meuAno.getAno());
					break;
				case 3:
					if (meuAno.ehBissexto()) {
						System.out.print("\n\t\tO ano é bissexto");
					} else {
						System.out.print("\n\t\tO ano NÃO é bissexto");
					}
					break;
				case 0:
					System.out.println("\n\t\tFim do programa..");
					break;
				default:
					System.out.println("\n\t\tOpção inválida!!");
					break;
			}
		} while(opcao != 0);
	}
}

