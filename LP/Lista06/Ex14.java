/* Bruno Rosa Cappio
 * 14) Escreva um programa em Java para ler 2 valores, calcular e escrever
 * a soma dos inteiros existentes entre os 2 valores lidos (incluindo os
 * valores lidos na soma). Considere que o segundo valor lido será sempre
 * maior que o primeiro valor lido.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex14 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] valores = new int[2];
		int somaInt = 0;
		boolean validacao = false;
		
		for(int i = 0; i < valores.length; i++){
			
			do{
				
				System.out.print("Insira o " + (i+1) + " valor: ");
				
				try{
					
					valores[i] = sc.nextInt();
					
					switch(i){
						
						case 0:
							
							System.out.println();
							validacao = true;
							break;
							
						default:
							
							if(valores[i] > valores[i-1]){
								
								System.out.println();
								validacao = true;
							}else{
								
								System.out.println("Ops...O " + (i+1) + "valor deve ser maior que o " + i + "valor!");
								validacao = false;
							}
					}
					
				}catch(InputMismatchException e){
					
					System.out.println("Ops...Insira um valor tipo inteiro!");
					sc.nextLine();
					validacao = false;
				}
			}while(!validacao);
		}
		
		for(int i = valores[0]; i <= valores[1]; i++){
			
			somaInt += i;
		}
		
		System.out.println("A soma dos inteiros entre " + valores[0] + " e " + valores[1] + ": " + somaInt);
	}
}
