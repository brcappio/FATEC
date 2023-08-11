/* Bruno Rosa Cappio
 * 15) O mesmo exercício anterior, mas agora, considere que o segundo valor
 * lido poderá ser maior ou menor que o primeiro valor lido, ou seja,
 * deve-se testá-los.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex15 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] valores = new int[2];
		int somaInt = 0;
		boolean validacao = false;
		
		for(int i = 0; i < valores.length; i++){
			
			while(true){
				
				System.out.print("Insira o " + (i+1) + " valor: ");
				
				try{
					
					valores[i] = sc.nextInt();
					System.out.println();
					break;
				}catch(InputMismatchException e){
					
					System.out.println("Ops...Insira um valor tipo inteiro!");
					sc.nextLine();
				}
			}
		}
		
		for(int i = 0; i < valores.length - 1; i++){
			
			int indiceMenorValor = i;
			
			for(int j = i + 1; j < valores.length; j++){
				
				if(valores[j] < valores[indiceMenorValor]){
					
					indiceMenorValor = j;
				}
			}
			
			int temp = valores[i];
			valores[i] = valores[indiceMenorValor];
			valores[indiceMenorValor] = temp;
		}
		
		for(int i = valores[0]; i <= valores[valores.length-1]; i++){
			
			somaInt += i;
		}
		
		System.out.println("A soma dos inteiros entre " + valores[0] + " e " + valores[valores.length-1] + ": " + somaInt);
	}
}

