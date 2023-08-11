/* Bruno Rosa Cappio
 * 16) Escreva um programa em Java que calcule e escreva a média aritmética
 * dos números inteiros entre 15 (inclusive) e 100 (inclusive).
 */

public class Ex16{
	
	public static void main (String[] args){
		
		int min = 15,
			max = 100,
			qtd = max-min+1,
			soma = 0;
		double media;
		
		for(int i = min; i <= max; i++){
			
			soma += i;
		}
		
		media = (double)soma/qtd;
		
		System.out.println(qtd);
		System.out.println(media);
	}
}
