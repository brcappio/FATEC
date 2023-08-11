/* Bruno Rosa Cappio
 * Pedido.java
 */

import java.util.Scanner;

public class Pedido {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Produto produtos[] = new Produto[100];
		
		int totalDeProdutos = 0;
		
		int opcao = 0, quantidade;
		double preco;
		
		do {
			System.out.println("QUITANDA");
			System.out.println("1) Add Frios");
			System.out.println("2) Add Paozinho");
			System.out.println("3) Add Doces");
			System.out.println("4) Ver pedido");
			System.out.println("5) Calcular total");
			System.out.println("0) Sair");
			System.out.println("--------------");
			System.out.print("Opcao: ");
			opcao = leia.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Digite o preco: ");
					preco = leia.nextDouble();
					
					System.out.println("Digite a quantidade: ");
					quantidade = leia.nextInt();
					
					
					produtos[totalDeProdutos] = new Frios(preco, quantidade);
					totalDeProdutos++; //Chamada anonima, nao tive que nomear um objeto pra instanciar ele
					
					break;
					
				case 2:
					System.out.println("Digite o preco: ");
					preco = leia.nextDouble();
					
					System.out.println("Digite a quantidade: ");
					quantidade = leia.nextInt();
					
					
					produtos[totalDeProdutos] = new Paozinho(preco, quantidade);
					totalDeProdutos++; //Chamada anonima, nao tive que nomear um objeto pra instanciar ele
					
					break;
					
				case 3:
					System.out.println("Digite o preco: ");
					preco = leia.nextDouble();
					
					System.out.println("Digite a quantidade: ");
					quantidade = leia.nextInt();
					
					
					produtos[totalDeProdutos] = new Doces(preco, quantidade);
					totalDeProdutos++; //Chamada anonima, nao tive que nomear um objeto pra instanciar ele
					
					break;
					
				case 4:
					System.out.println("\nPedido: ");
					for (int i = 0; i < totalDeProdutos; i++) {
						System.out.println(produtos[i]);
					}
					
					break;
					
				case 5:
					System.out.println("\nCalculo do total: ");
					double valorTotal = 0;
					for (int i = 0; i < totalDeProdutos; i++) {
						valorTotal += produtos[i].getPreco() * produtos[i].getQuantidade();
					}
					System.out.println("Valor total do pedido: " + valorTotal);
					
					break;
					
				case 0:
					System.out.println("Fim do programa...");
					break;
					
				default:
					System.out.println("Opcao invalida!");
			}
		} while(opcao != 0);
	}
}

