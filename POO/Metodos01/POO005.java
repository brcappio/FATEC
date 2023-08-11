/*
 * 5)[POO-005] Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do segundo grau: ax² + bx + c = 0.
 *Para ela existir, o coeficiente 'a' deve ser diferente de zero.
 * Caso o delta seja maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas e da forma, assim retorne zero.
 * 
 */

import java.util.Scanner;

public class POO005 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor do coeficiente a: ");
		double a = leia.nextDouble();
		System.out.print("Digite o valor do coeficiente b: ");
		double b = leia.nextDouble();
		System.out.print("Digite o valor do coeficiente c: ");
		double c = leia.nextDouble();
		
		System.out.printf("Equacao: %.2f² + %.2fx + %.2f = 0",a,b,c);
		
		if (verificaPositivo (a)) {
			double delta = calculaDelta(a,b,c);
			System.out.println("\nO valor de delta eh " + delta);
			if (verificaPositivo(delta)) {
				double raizPositiva = calculaRaizPositiva(a, b, delta);
				double raizNegativa = calculaRaizNegativa(a, b, delta);
				System.out.println("O valor das raizes sao: " + raizPositiva + " e " +  raizNegativa);
			}  else {
				System.out.println("Retorno: 0");
			}
			
		} else {
			System.out.println("O valor de 'a' deve ser maior que zero!");
		}
	}
	
	static boolean verificaPositivo (double valor) {
		return valor > 0;
	}
	
	
	static double calculaDelta (double a, double b, double c) {
		double delta = Math.pow(b, 2) - (4 * a * c);
		return delta;
	}
	
	
	static double calculaRaizPositiva (double a, double b, double delta) {
		double raizPositiva = (b * -1 + Math.sqrt(delta)) / 2 * a;
		return raizPositiva;
	}
	
	static double calculaRaizNegativa (double a, double b, double delta) {
		double raizNegativa = (b * -1 - Math.sqrt(delta)) / 2 * a;
		return raizNegativa;
	}
}

