/* Bruno Rosa Cappio
 * 2) Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que dividir a conta para cada pessoa.
 *  Outra coisa importante, os 10% do garçom é opcional. Criar uma classe para solucionar o problema proposto,
 *  - onde tem o valor da conta a ser paga (sem os 10% do garçom),
 *  - a quantidade de pessoas que dividirão essa conta
 *  - e se vai ser pago os 10% do garçom, sim ou não.
 *  Valide os dados inseridos não permitindo absurdos.
 * 
 * 
 */

import java.util.Scanner;

public class Ex2 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaString = new Scanner(System.in);
						
		System.out.print("Valor da conta: " );
		double valor = leia.nextDouble();
		
		System.out.print("Pessoas para dividir: " );
		int pessoas = leia.nextInt();
					
		Conta conta1 = new Conta (valor, pessoas);
		
		System.out.print("Deseja pagar a porcentagem do garcom (10%)? (S/N): ");
		String resposta = leiaString.nextLine();
		conta1.setGarcom(resposta.equalsIgnoreCase("S"));
		System.out.printf("Total a ser pago: %.2f", conta1.calcula() );
		
	}
}

