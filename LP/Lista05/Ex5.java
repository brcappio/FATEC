/* Bruno Rosa Cappio
 * 5) Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu).
 */

import java.util.Scanner;

public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
        int atual = leia.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int nascimento = leia.nextInt();
        int idade = atual - nascimento;
        System.out.println(idade);
        System.out.println(idade >= 18 ? "Pode votar esse ano" : "Nao pode votar esse ano");
    }
    
}
