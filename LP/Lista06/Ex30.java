/*Bruno Rosa Cappio
30) Escreva um programa em Java que imprima sequência 6:
1, 1
2, 2 4
3, 1 3 5
4, 2 4 6 8
5, 1 3 5 7 9
6, 2 4 6 8 10 12
7, 1 3 5 7 9 11 13
8, 2 4 6 8 10 12 14 16
9, 1 3 5 7 9 11 13 15 17
10, 2 4 6 8 10 12 14 16 18 20
 */
package ex30;

/**
 *
 * @author Aluno
 */
public class Ex30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ",\t");
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(j * 2 + " ");
                } else {
                    System.out.print(j * 2 - 1 + " ");
                }
            }
            System.out.println();
        }
    }  
}
