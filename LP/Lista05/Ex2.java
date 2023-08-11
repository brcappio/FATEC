/* Bruno Rosa Cappio
 * 2) Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
(considere o valor zero como positivo).
 */

import java.util.Scanner;

public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num = leia.nextInt();
        System.out.println(num >= 0 ? "NUMERO EH POSITIVO" : "NUMERO EH NEGATIVO");
    }
    
}
