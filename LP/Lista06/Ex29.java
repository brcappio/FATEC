/* Bruno Rosa Cappio
 * 29) Escreva um programa em Java que imprima sequência 5:
1, 1 3 5 7 9
2, 2 4 6 8 10
3, 1 3 5 7 9
4, 2 4 6 8 10
5, 1 3 5 7 9
6, 2 4 6 8 10
7, 1 3 5 7 9
8, 2 4 6 8 10
9, 1 3 5 7 9
10, 2 4 6 8 10
 */
package ex29;

/**
 *
 * @author Aluno
 */
public class Ex29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ",\t");
            for (int j = 1; j <= 5; j++) {
                if (i % 2 == 1) {
                    System.out.print((j * 2 - 1) + " ");
                } else {
                    System.out.print(j * 2 + " ");
                }
            }
            System.out.println();
        }
    }
}
