/* Bruno Rosa Cappio
 * 24) Escreva um programa
em Java que imprima a tabuada do 1 ao 10, para os números de 0 a 10
 * 
 * 
 */


public class Ex24 {
	
	public static void main (String[] args) {
		for(int i = 1; i <= 10; i++){
			for(int k = 1; k <= 10; k++) {
				System.out.println(i + " * " + k + " = " + i*k);
			}
			System.out.println();
		}
	}
}

