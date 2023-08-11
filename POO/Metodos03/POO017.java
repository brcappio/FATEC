/* Bruno Rosa Cappio
 * 4) [POO-017] Um professor, muito legal, fez 3 provas durante um semestre, mas só vai levar em conta as
duas notas mais altas para calcular a média. Crie um programa que solicite ao usuário
*  o valor double das 3 notas, mostre como seria a média com essas 3 provas, a média com as 2 notas mais altas, bem como a nota
mais alta e a nota mais baixa. Tente criar apenas um método para retornar essas médias. Este método
deverá receber as 3 notas como parâmetros de entrada e retornar os valores solicitados. As notas devem
ser de zero a dez e qualquer valor diferente deverá ser desconsiderado, assumindo zero.
* 
Entrada: 												Saída: 						Cálculo:
Entre com a nota 1: 6 									Média maiores: 7 			[ (6 + 8) / 2 ]
Entre com a nota 2: 8 									Média aritmética: 6 		[ (6 + 8 + 4) / 3 ]
Entre com a nota 3: 4 									Maior nota: 8 				[ 6, 8, 4 ]
														Menor nota: 4 				[ 6, 8, 4 ]

Entre com a nota 1: 6 									Média maiores: 7 			[ (6 + 8) / 2 ]
Entre com a nota 2: 8 									Média aritmética: 4,7 		[ (6 + 8 + 0 ) / 3 ]
Entre com a nota 3: 14 									Maior nota: 8 				[ 6, 8, 0 ]
														Menor nota: 0 				[ 6, 8, 0 ]
 * 
 */

import java.util.Scanner;

public class POO017 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com a nota 1: ");
		double nota1 = leia.nextDouble();
		if (nota1 > 10 || nota1 < 0) {
			nota1 = 0;
		}
		
		System.out.print("Entre com a nota 2: ");
		double nota2 = leia.nextDouble();
		if (nota2 > 10 || nota2 < 0) {
			nota2 = 0;
		}
		
		System.out.print("Entre com a nota 3: ");
		double nota3 = leia.nextDouble();
		if (nota3 > 10 || nota3 < 0) {
			nota3 = 0;
		}
		
		double resultados[] = calculaMedia(nota1,nota2,nota3);
		
		System.out.println();
		System.out.printf("Media maiores: %.1f\n", resultados[0]);
		System.out.printf("Media aritmetica: %.1f\n", resultados[1]);
		System.out.printf("Maior nota: %.1f\n", resultados[2]);
		System.out.printf("Menor nota: %.1f\n", resultados[3]);
	}
	
	static double[] calculaMedia(double nota1, double nota2, double nota3){
		double media = ((nota1+nota2+nota3)/3);
		double maior = Math.max(nota1,Math.max(nota2,nota3));
		double menor = Math.min(nota1,Math.min(nota2,nota3));
		double meio = (((nota1+nota2+nota3) - maior) - menor);
		double mediaMaior = (maior + meio) / 2;

		double[] resultados = {mediaMaior, media, maior, menor};
		return resultados;
	}
}

