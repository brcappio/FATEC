/* Bruno Rosa Cappio
 * 1) Escreva um programa para ler um vetor A de 15 posições e imprimir seus elementos.
 * 
 * 
 */

import java.util.Arrays;

public class Ex1 {
	
	public static void main (String[] args) {
		int a[] = new int[15];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        
		/*for (int i = 0; i < meuArray.length; i++) {
            System.out.println(meuArray[i]);
        }*/
        
        System.out.println(Arrays.toString(a));
        
	}
}

