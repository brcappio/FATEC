/*Bruno Rosa Cappio
4) Escreva um programa em Java para ler uma matriz D de dimensão N x M,onde N e M não poderem ser menores que um.
Gerar os elementos aleatoriamente.
O usuário deve informar a dimensão (linha e coluna) e um
valor máximo para elementos aleatórios.
O programa efetuar todas as validações. Lembre-se de aproveitar os recursos da linguagem Java para facilitar as validações.
*/
package ex04;

import java.util.Scanner;
import java.util.Random;

public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de linhas da matriz: ");
        int n = leia.nextInt();
        
        System.out.println();
        
        System.out.print("Digite a quantidade de colunas da matriz: ");
        int m = leia.nextInt();
        
        if (n < 1 || m < 1) {
            System.out.println();
            System.out.println("O quantidade de linhas e colunas deve obrigatoriamente ser maior que 1!!");
            return;
        }
        
        System.out.println();
        
        System.out.print("Digite o valor máximo para os elementos que serao gerados aleatoriamente: ");
        
        System.out.println();
        
        int limite = leia.nextInt();
        
        int D[][] = new int[n][m];
        
        for (int linha = 0; linha < D.length; linha ++) {
            for (int coluna = 0; coluna < D[linha].length; coluna ++) {
                Random aleatorio = new Random();
                D[linha][coluna] = aleatorio.nextInt(limite);
            }
        }
        
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D[i].length; j++) {
                System.out.print(D[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
