/* Bruno Rosa Cappio
 * 4)[POO-004]Escreva um programa que solicite 3 (três) valores double e calcule a Equação do Segundo Grau.
 * O primeiro valor será o ‘a’, o segundo o ‘b’ e o último o ‘c’.
 * Crie um método que receba três valores, 'a', 'b' e 'c', que são os coeficientes da equação do segundo grau e retorne o valor do delta, que é dado por 'b²-4ac'.
 */


import java.util.Scanner;

public class POO004 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor do coeficiente a: ");
		double a = leia.nextDouble();
		System.out.print("Digite o valor do coeficiente b: ");
		double b = leia.nextDouble();
		System.out.print("Digite o valor do coeficiente c: ");
		double c = leia.nextDouble();
		
		double delta = calculaDelta(a,b,c);
		
		System.out.println("O valor de delta eh: " + delta);
	}
	static double calculaDelta (double a, double b, double c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		return delta;
	}
}

