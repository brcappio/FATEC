/*
 * 5 - Crie um arquivo chamado ADivisivelPorBRandom.java. Implemente um programa em Java que guarde dois valores
 *  numéricos inteiros: a e b, gerados aleatoriamente, sendo a de 0 até 1000 (inclusos) e b de 0 a 20 (inclusos).
 *  Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso
contrário
 * 
 */


public class ADivisivelPorBRandom {
	
	public static void main (String[] args) 	
		System.out.print("Digite o valor de A (valor deve ser de 0 a 1000): ");
		int precoProduto1 = (int)(Math.random() * 1000);
				
		System.out.print("Digite o valor de B (valor deve ser de 0 a 20): ");
		int precoProduto2 = (int)(Math.random() * 1000);
		
		System.out.println(a %b == 0 ? "Eh divisivel" : "Nao eh divisivel");
	}
}

