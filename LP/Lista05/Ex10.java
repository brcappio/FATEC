/* Bruno Rosa Cappio
 * 10) Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
 * Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
salário total.
 * 
 * 
 */
 
import java.util.Scanner;


public class Ex10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o valor do salario fixo: ");
		double salario = leia.nextDouble();
		System.out.print("Digite o valor da venda: ");
		double valorVenda = leia.nextDouble();
		double salarioTotal, comissao;
		
		if (valorVenda < 1500.00) {
			comissao = valorVenda * 0.03;
		} else {
			comissao = valorVenda * 0.05;
		}
		
		salarioTotal = salario + comissao;
		System.out.println("O salario total eh de: " + salarioTotal);
	}
}

