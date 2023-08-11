/* Bruno Rosa Cappio
 * 28) Escreva um programa em Java que imprima sequência 4:
1, 2 3 4 5 6 7 8 9 10
2, 3 4 5 6 7 8 9 10
3, 4 5 6 7 8 9 10
4, 5 6 7 8 9 10
5, 6 7 8 9 10
6, 7 8 9 10
7, 8 9 10
8, 9 10
9, 10
10
*/
package ex28;

/**
 *
 * @author Aluno
 */
public class Ex28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ",\t");
            for (int j = i+1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
