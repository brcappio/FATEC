/* Bruno Rosa Cappio
 * 23) Escreva um programa para ler um vetor AD de dimensão definida e com elementos fornecidos pelo usuário e colocar, somente, os elementos PARES em ordem crescente. Ao final imprimir o vetor AD ordenado.
 * 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;

public class Ex23 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor AD: ");
        int N = leia.nextInt();

        int AD[] = new int[N];
        int pares[] = new int[N];
        int countPar = 0;

        for (int i = 0; i < AD.length; i++) {
            System.out.print("Digite o elemento na posicao " + i + ": ");
            AD[i] = leia.nextInt();
            if (AD[i] % 2 == 0) {
                pares[countPar] = AD[i];
                countPar++;
            }
        }

        Arrays.sort(pares, 0, countPar);

        System.out.println("\n\nVetor AD: ");
        for (int i = 0; i < countPar; i++) {
            System.out.print(pares[i] + " ");
        }

        for (int i = 0; i < AD.length; i++) {
            if (AD[i] % 2 != 0) {
                System.out.print(AD[i] + " ");
            }
        }
    }
}



