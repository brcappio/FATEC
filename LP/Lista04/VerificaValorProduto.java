/*
 * 4 - Crie um arquivo chamado VerificaValorProduto.java. Solicite ao usuário que digite os valores para as variáveis precoProduto1 e precoProduto2.
 *  O programa deve testar o valor digitado pelo usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos),
 *  exibir a mensagem VALOR INVALIDO e finalizer o programa. Caso os valores digitados sejam válidos, exibir a mensagem O produto 1 é o mais barato quando
 *  o preço do primeiro produto for menor. Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser exibida.
 */

import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor do Produto 1 (valor deve ser entre 1 a 1000): ");
		int precoProduto1 = leia.nextInt();
		
		System.out.print("Digite o valor do Produto 2 (valor deve ser entre 1 a 1000): ");
		int precoProduto2 = leia.nextInt();
		
		System.out.println(precoProduto1 != precoProduto2 ? precoProduto1 > precoProduto2 ? "O segundo produto eh mais barato" : "O primeiro produto eh mais barato" : "O preco dos dois produtos sao iguais");
	}
}

