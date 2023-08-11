/* Bruno Rosa Cappio
 * 12) Desenvolva um programa em Java que receba o preço de um produto e seu código de
origem e mostre o preço do produto junto de sua procedência, o valor calculado do frete e o
valor final a ser pago pelo produto, conforme tabela a seguir:
 * 
 * Código de Origem				Região de procedência			Frete
		1 							Norte 						10%
		2, 5, 9 					Sul 						3%
		3, 10 até 15			    Leste						1,2%
	    7 ou 20						Oeste 						7,3%
		Qualquer outro 				Importado 					22,2%
 * 
 */


import java.util.Scanner;

public class Ex12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("1\t\t\tNorte\t\t10%");
		System.out.println("2, 5, 9\t\t\tSul\t\t3%");
		System.out.println("3, 10 ate 15\t\tLeste\t\t1.2%");
		System.out.println("7 ou 20\t\t\tOeste\t\t7.3%");
		System.out.println("Qualquer Outro\t\tImportado\t22.2%");
		
		System.out.print("\nDigite o codigo de origem: ");
		int origem = leia.nextInt();
		
		double frete, precoProduto, valorFinal;
		System.out.print("Digite o preco do produto: ");
		precoProduto = leia.nextDouble();

		switch (origem) {
			case 1:
				frete = 0.1 * precoProduto;
				valorFinal = precoProduto + frete;
				System.out.println("Valor final: " + valorFinal);
				break;
			case 2, 5, 9:
				frete = 0.03 * precoProduto;
				valorFinal = precoProduto + frete;
				System.out.println("Valor final: " + valorFinal);
				break;
			case 3, 10, 11, 12, 13, 14, 15:
				frete = 0.012 * precoProduto;
				valorFinal = precoProduto + frete;
				System.out.println("Valor final: " + valorFinal);
				break;
			default:
				frete = 0.222 * precoProduto;
				valorFinal = precoProduto + frete;
				System.out.println("Valor final: " + valorFinal);
				break;
		}
	}
}
