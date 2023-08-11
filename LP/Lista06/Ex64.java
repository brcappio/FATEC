/* Bruno Rosa Cappio
 * 64) Solicite ao usuário a quantidade de termos que ele deseja e imprima
 * a sequência abaixo e a soma dos termos.
 * 1/2 - 1/3 + 2/5 - 3/7 + 5/11 - 8/13 + ...
 * em cima sequência de Fibonacci e embaixo sequência de Primos.
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.ArrayList;

public class Exercicio64{
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		int nTermos;
		int[] fibonacci;
		ArrayList<Integer> primos = new ArrayList<Integer>(); 
		
		while(true){
			
			System.out.print("Insira a quantidade de termos desejada: ");
			
			try{
				
				nTermos = sc.nextInt();
				
				if(nTermos > 0){
					
					System.out.println();
					break;
				}else{
					
					System.out.println("Ops...Insira um valor maior que zero!");
				}
			}catch(InputMismatchException e){
				
				System.out.println("Ops...Insira um valor do tipo inteiro!");
				sc.nextLine();
			}
		}
		
		fibonacci = new int[nTermos];
		
		for(int i = 0; i < nTermos; i++){
			
			if(i < 2){
				
				fibonacci[i] = 1;
				/* array só está recebendo 1 ans duas posiçoẽs por conta 
				 * do enunciado que da um exemplo onde não há o 0 na
				 * primeira posição apesar de ser o correto.
				 */
			}else{
				
				fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			}
		}
		
		for(int provavelPrimo = 2 ;primos.size() <= nTermos; provavelPrimo++){
			
			boolean primo = true;
			
			for(int provavelDivisor = 2; (provavelDivisor < provavelPrimo) && (primo == true); provavelDivisor++){
				
				if(provavelPrimo%provavelDivisor == 0){
					
					primo = false;
				}
			}
			
			if(primo){
				
				primos.add(provavelPrimo);
			}
		}
		
		double soma = 0;
		boolean mais = true;
		
		for(int i = 0; i < nTermos; i++){
			
			System.out.print(fibonacci[i] + "/" + primos.get(i));
			
			mais = !mais;
			
			if(mais){
				
				soma -= (double)fibonacci[i] / primos.get(i);
				System.out.print((i == nTermos-1) ? "\n" : " + " );
			}else{
				
				soma += (double)fibonacci[i] / primos.get(i);
				System.out.print((i == nTermos-1) ? "\n" : " - " );
			}
		}
		
		System.out.printf("Soma dos termos: %.2f", soma);
	}
}

