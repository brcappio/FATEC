/* Bruno Rosa Cappio
 * 7) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrevê-los em ordem crescente.

 */


import java.util.Scanner;

public class Ex7 {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int primeiro = leia.nextInt();
        System.out.print("Digite o segundo valor: ");
        int segundo = leia.nextInt();
        int maior;
        int menor;
        if (primeiro > segundo) {
            maior = primeiro;
            menor = segundo;
        } else {
            maior = segundo;
            menor = primeiro;
        }
        System.out.println("Em ordem crescente: " + menor + ", " + maior);
    }
    
}
