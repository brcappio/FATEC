/* Bruno Rosa Cappio
 * 6) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrever o maior deles.

 */

import java.util.Scanner;


public class Ex6 {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int primeiro = leia.nextInt();
        System.out.print("Digite o segundo valor: ");
        int segundo = leia.nextInt();
        int maior;
        if (primeiro > segundo) {
            maior = primeiro;
        } else {
            maior = segundo;
        }
        System.out.println("O maior numero eh: " + maior);
    }
    
}
