/* Bruno Rosa Cappio
 * 8) [POO-021] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
array. Através de um método que receba esse array de números inteiros como parâmetro de entrada,
calcule e retorne o MDC (Máximo Divisor Comum) desse conjunto de dados. Valide as entradas para aceitar
apenas números positivos (pode ser um método).
 * 
 * 
 */

import java.util.Scanner;

public class POO021 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int quantidade;
        do {
            System.out.print("Entre com a quantidade de termos: ");
            quantidade = leia.nextInt();
            if (quantidade <= 0) {
				System.out.println("Valor Invalido!");
			}
        } while (quantidade <= 0);
        
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            do {
                System.out.printf("Entre com o %dº numero: ", i + 1);
                numeros[i] = leia.nextInt();
            } while (numeros[i] <= 0);
        }
        
        int mdc = calculaMDC(numeros);
        System.out.printf("MDC: %d\n", mdc);
    }
    
    static int calculaMDC(int[] numeros) {
        int mdc = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            mdc = calculaMDC(mdc, numeros[i]);
        }
        return mdc;
    }
    
    static int calculaMDC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculaMDC(b, a % b);
        }
    }
}

