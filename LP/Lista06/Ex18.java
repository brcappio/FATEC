/* Bruno Rosa Cappio
 * 18) Uma loja está levantando o valor total de todas as mercadorias em
 * estoque. Escreva um programa em Java que permita a entrada das
 * seguintes informações: a) o número total de mercadorias no estoque;
 * b) o valor de cada mercadoria. Ao final imprimir o valor total em
 * estoque e a média de valor das mercadorias.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex18{
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		int qtdMercadoria;
		
		while(true){
			
			System.out.print("Insira a quantidade de produtos em estoque: ");
			
			try{
				
				qtdMercadoria = sc.nextInt();
				
				if(qtdMercadoria > 0){
					
					System.out.println();
					break;
				}else{
					
					System.out.println("Ops...Insira uma valor maior que zero!");
				}
			}catch(InputMismatchException e){
				
				System.out.println("Ops...Insira um valor tipo inteiro!");
				sc.nextLine();
			}
		}
		
		double[] precos = new double[qtdMercadoria];
		double valorEstoque = 0,
			valorMedio;
		
		for(int i = 0; i < precos.length; i++){
			
			while(true){
				
				System.out.print("Insira o valor do " + (i+1) + " item: ");
				
				try{
					
					precos[i] = sc.nextDouble();
					
					if(precos[i] > 0){
						
						System.out.println();
						break;
					}else{
						
						System.out.println("Ops...Insira uma valor maior que zero!");
					}
				}catch(InputMismatchException e){
					
					System.out.println("Ops...Insira um valor numerico!");
					sc.nextLine();
				}
			}
			
			valorEstoque += precos[i];
		}
		
		valorMedio = valorEstoque/precos.length;
		
		System.out.printf("        Valor total do estoque: %.2f", valorEstoque);
		System.out.printf("\nMedia de valor das mercadorias: %.2f", valorMedio);
	}
}
