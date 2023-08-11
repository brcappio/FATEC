/* Bruno Rosa Cappio
 * 65) Solicite ao usuário a quantidade de termos que ele deseja e imprima
 * a sequência abaixo e a soma dos termos.
 * -1/2 + 1/3 - 2/5 + 6/7 - 24/11 + 120/13 - …
 * em cima sequência de Fatoriais e embaixo sequência de Primos.
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.ArrayList;

public class Exercicio65{
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int nTermos;
		
		int[] fatoriais;
		
		ArrayList<Integer> primos = new ArrayList<Integer>();
		
		while(true){
			
			System.out.print("Insira o numero de termos desejados: ");
			
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
		
		fatoriais = new int[nTermos];
		
		fatoriais[0] = 1;
		
		for(int i = 1; i < nTermos; i++){
			
			fatoriais[i] = fatoriais[i-1] * i;
		}
		
		//System.out.println(Arrays.toString(fatoriais));
		
		for(int provavelPrimo = 2; primos.size() < nTermos; provavelPrimo++){
			
			boolean primo = true;
			
			for(int provavelDivisor = 2; provavelDivisor < provavelPrimo; provavelDivisor++){
				
				if(provavelPrimo%provavelDivisor == 0){
					
					primo = false;
					break;
				}
			}
			
			if(primo){
				
				primos.add(provavelPrimo);
			}
		}
		
		//System.out.println(Arrays.toString(primos.toArray()));
		
		boolean menos = true;
		double soma = 0;
		
		for(int i = 0; i < nTermos; i++){
			
			if(menos){
				
				soma -= (double)fatoriais[i]/primos.get(i);
			}else{
				
				soma += (double)fatoriais[i]/primos.get(i);
			}
			
			System.out.print((menos) ? " - " : " + ");
			
			menos = !menos;
			
			System.out.print(fatoriais[i] + "/" + primos.get(i) + ((i == nTermos-1) ? "\n" : ""));
		}
		
		System.out.printf("Soma dos termos: %.2f", soma);
	}
}
