/* Bruno Rosa Cappio
 * 26) Escreva um programa em Java que imprima sequência 2:
	1,  1
	2,  1 2
	3,  1 2 3
	4,  1 2 3 4
	5,  1 2 3 4 5
	6,  1 2 3 4 5 6
	7,  1 2 3 4 5 6 7
	8,  1 2 3 4 5 6 7 8
	9,  1 2 3 4 5 6 7 8 9
	10, 1 2 3 4 5 6 7 8 9 10
 * 
 * 
 */


public class Ex26 {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 10; i++){
			System.out.print(i + ",\t");
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
				
			}
			System.out.println();
		}
	}
}

