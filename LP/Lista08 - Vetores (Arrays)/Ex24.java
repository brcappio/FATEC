/* Bruno Rosa Cappio
 * 24) Escreva um programa para ler um vetor AE de dimensão e com elementos fornecidos pelo usuário e colocar, somente, os elementos ÍMPARES em ordem decrescente. Ao final imprimir o vetor AE ordenado.
 * 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ex24 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor AE: ");
        int N = leia.nextInt();

        int AE[] = new int[N];
        Integer impares[] = new Integer[N];
        int countImpar = 0;

        for (int i = 0; i < AE.length; i++) {
            System.out.print("Digite o elemento na posicao " + i + ": ");
            AE[i] = leia.nextInt();
            if (AE[i] % 2 != 0) {
                impares[countImpar] = AE[i];
                countImpar++;
            }
        }

        Arrays.sort(impares, 0, countImpar, Collections.reverseOrder());

        System.out.println("\n\nVetor AE: ");
        for (int i = 0; i < countImpar; i++) {
            System.out.print(impares[i] + " ");
        }

        for (int i = 0; i < AE.length; i++) {
            if (AE[i] % 2 == 0) {
                System.out.print(AE[i] + " ");
            }
        }
    }
}




