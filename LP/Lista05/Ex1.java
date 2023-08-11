/* Bruno Rosa Cappio
 * 1) Escreva um programa em Java para ler um valor e escrever a mensagem “É MAIOR QUE
10!” se o valor lido for maior que 10, caso contrário escrever “NÃO É MAIOR QUE 10!”.

 */

import java.util.Scanner;

public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num = leia.nextInt();
        System.out.println(num > 10 ? "EH MAIOR QUE 10!" : "NAO EH MAIOR QUE 10!");
    }
    
}
