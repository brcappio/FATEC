/*8) Escreva um programa em Java para gerar uma matriz F (N x M). Criar os
vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da matriz.
Imprimir a matriz e os vetores. Validar para caso não haja uma das
duas possibilidades (sem elementos pares ou ímpares).*/
package ex08;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        int N = leia.nextInt();
        System.out.println();

        System.out.print("Digite a quantidade de colunas da matriz: ");
        int M = leia.nextInt();
        System.out.println();

        int[][] F = new int[N][M];

        int[] PAR = {};
        int[] IMPAR = {};

        Random aleatorio = new Random();

        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F[i].length; j++) {
                int numAleatorio = aleatorio.nextInt(200);
                F[i][j] = numAleatorio;
                if (numAleatorio % 2 == 0) {
                    PAR = Arrays.copyOf(PAR, PAR.length + 1);
                    PAR[PAR.length - 1] = numAleatorio;
                } else {
                    IMPAR = Arrays.copyOf(IMPAR, IMPAR.length + 1);
                    IMPAR[IMPAR.length - 1] = numAleatorio;
                }
            }
        }

        System.out.println("Matriz F:");
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F[i].length; j++) {
                System.out.print(F[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Vetor IMPAR: " + IMPAR.length + " elemento(s)");
        System.out.println(Arrays.toString(IMPAR));
        
        System.out.println();
        
        System.out.println("Vetor PAR: " + PAR.length + " elemento(s)");
        System.out.println(Arrays.toString(PAR));
        
        System.out.println();
        
        if (PAR.length == 0 && IMPAR.length == 0) {
            System.out.println("A matriz F nao possui elementos pares nem impares");
        } else if (PAR.length == 0) {
            System.out.println("A matriz F nao possui nenhum elemento par");
        } else if (IMPAR.length == 0) {
            System.out.println("A matriz F nao possui nenhum elemento impar");
        }
    }
}