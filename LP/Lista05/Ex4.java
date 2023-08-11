/* Bruno Rosa Cappio
 * 4) Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
também a média calculada.
 */

import java.util.Scanner;

public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor da primeira nota: ");
        int nota1 = leia.nextInt();
        System.out.print("Digite o valor da segunda nota: ");
        int nota2 = leia.nextInt();
        int media = (nota1 + nota2) / 2;
        System.out.println(media);
        System.out.println(media >= 6 ? "APROVADO" : "REPROVADO");
    }
    
}
