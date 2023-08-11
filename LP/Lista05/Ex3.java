/* Bruno Rosa Cappio
 * 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
compradas, calcule e escreva o custo total da compra.
 */

import java.util.Scanner;

public class Ex3 {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a quantidade de macas: ");
        int qtd = leia.nextInt();
        double valorTotal;
        if (qtd < 12) {
            valorTotal = qtd * 1.3;
        } else {
            valorTotal = qtd * 1.0;
        }
        
        System.out.println("Valor total da compra: R$" + valorTotal);
    }
    
}
