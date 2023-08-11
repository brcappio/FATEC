/*
 * CestaDeFrutas.java 
 */

import java.util.Scanner;

public class CestaDeFrutas {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		
		Fruta cesta[] = new Fruta[100];
		
		int totalDeFrutas = 0;
		
		int opcao = 0, quantidade;
		String cor, tipo;
		
		do {
			System.out.println("QUITANDA");
			System.out.println("1) Add Maca");
			System.out.println("2) Add Uva");
			System.out.println("3) Ver cesta");
			System.out.println("4) Sair");
			System.out.println("--------------");
			System.out.print("Opcao: ");
			opcao = leia.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Qual a cor da maca: ");
					cor = leiaStr.nextLine();
					
					System.out.println("Qual o tipo da maca: ");
					tipo = leiaStr.nextLine();
					
					cesta[totalDeFrutas] = new Maca(cor, tipo);
					totalDeFrutas++; //Chamada anonima, nao tive que nomear um objeto pra estanciar ele
					
					break;
					
				case 2:
					System.out.println("Qual a cor da uva: ");
					cor = leiaStr.nextLine();
					
					System.out.println("Qual a quantidade de uvas: ");
					quantidade = leia.nextInt();
					
					Uva uva = new Uva(cor, quantidade);
					
					cesta[totalDeFrutas] = uva;
					totalDeFrutas++;
					
					break;
					
				case 3:
					System.out.println("\nCesta: ");
					for (int i = 0; i < totalDeFrutas; i++) {
						System.out.println(cesta[i]);
					}
					
					break;
					
				case 4:
					System.out.println("Fim do programa...");
					break;
					
				default:
					System.out.println("Opcao invalida!");
			}
		} while(opcao != 4);
	}
}

