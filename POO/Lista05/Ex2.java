/* Bruno Rosa Cappio
 * 2) Crie uma classe para representar uma calculadora com as quatro operações básicas da aritmética conforme o diagrama abaixo e após uma classe que teste essa implementação.
 * 
 */

import java.util.Scanner;

public class Ex2 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		int opcao = 8;
		
		do {
			System.out.println("\n===MENU===");
			System.out.println("1) Entrar com o primeiro numero");
			System.out.println("2) Entrar com o segundo numero");
			System.out.println("3) Ver os numeros inseridos");
			System.out.println("4) Somar");
			System.out.println("5) Subtrair");
			System.out.println("6) Multiplicar");
			System.out.println("7) Dividir");
			System.out.println();
			System.out.println("0) SAIR");
			System.out.println("============");
			System.out.print("Opção: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("\nDigite o primeiro numero: ");
					int numero1 = leia.nextInt();
					calculadora.setNumero1(numero1);
					break;
				case 2:
					System.out.print("\nDigite o segundo numero: ");
					int numero2 = leia.nextInt();
					calculadora.setNumero2(numero2);
					break;
				case 3:
					System.out.println("\n\t\tOs numeros inserios são: " + calculadora.getNumero1() + " e " + calculadora.getNumero2());
					break;
				case 4:
					System.out.println("\n\t\tSoma: " + calculadora.somar());
					break;
				case 5:
					System.out.println("\n\t\tSubtração: " + calculadora.subtrair());
					break;
				case 6:
					System.out.println("\n\t\tMultiplicação: " + calculadora.multiplicar());
					break;
				case 7:
					System.out.println("\n\t\tDivisão: " + calculadora.dividir());
					break;
				case 0:
					System.out.println("\n\t\tFim do programa..");
					break;
				default:
					System.out.println("\n\t\tOpção inválida!!");
					break;
			}
		} while(opcao != 0);
		
		/*
		System.out.print("Digite o primeiro numero: ");
		int numero1 = leia.nextInt();
		calculadora.setNumero1(numero1);
		
		System.out.print("Digite o segundo numero: ");
		int numero2 = leia.nextInt();
		calculadora.setNumero1(numero1);
		
		System.out.println("Soma: " + calculadora.somar());
		System.out.println("Subtração: " + calculadora.subtrair());
		System.out.println("Multiplicação: " + calculadora.multiplicar());
		System.out.println("Divisão: " + calculadora.dividir());
		* */
	}
}

