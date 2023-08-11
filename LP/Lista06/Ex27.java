/* Bruno Rosa Cappio
 * 27) Escreva um programa em Java que imprima sequência 3:
	1,  1 2 3 4 5 6 7 8 9 10
	2,  1 2 3 4 5 6 7 8 9
	3,  1 2 3 4 5 6 7 8
	4,  1 2 3 4 5 6 7
	5,  1 2 3 4 5 6
	6,  1 2 3 4 5
	7,  1 2 3 4
	8,  1 2 3
	9,  1 2
	10, 1
 * 
 * 
 */


public class Ex27 {
	
	public static void main (String[] args) {
		int aux = 10;
		for (int i = 1; i <= 10; i++){
			System.out.print(i + ",\t");			
			for (int k = 1; k <= aux; k++) {
				System.out.print(k + " ");
				
			}
			aux--;
			System.out.println();
		}
	}
}

