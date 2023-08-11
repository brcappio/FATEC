/* Bruno Rosa Cappio
 * 25) Escreva um programa em Java que imprima sequência 1:
	1,  1 2 3 4 5 6 7 8 9 10
	2,  1 2 3 4 5 6 7 8 9 10
	3,  1 2 3 4 5 6 7 8 9 10
	4,  1 2 3 4 5 6 7 8 9 10
	5,  1 2 3 4 5 6 7 8 9 10
	6,  1 2 3 4 5 6 7 8 9 10
	7,  1 2 3 4 5 6 7 8 9 10
	8,  1 2 3 4 5 6 7 8 9 10
	9,  1 2 3 4 5 6 7 8 9 10
	10, 1 2 3 4 5 6 7 8 9 10
 * 
 */


public class Ex25 {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 10; i++){
			System.out.print(i + ",\t");
			for (int k = 1; k <= 10; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}

