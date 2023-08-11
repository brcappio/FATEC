/*
 * 13) [POO-026] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
array. Através de um método que receba esse array de números inteiros como parâmetro de entrada. Este
método deverá retornar, apenas, os números perfeitos existentes no conjunto recebido.
Entrada: 															Saída:
Entre com a quantidade de termos: 4 								>> 496 28
Entre com 1º número: 31
Entre com 2º número: 72
Entre com 3º número: 496
Entre com 4º número: 28
* 
Entre com a quantidade de termos: 3 								>> 6
Entre com 1º número: 5
Entre com 2º número: 6
Entre com 3º número: 7
* 
Entre com a quantidade de termos: -5 								Erro! Valor inválido.
Entre com a quantidade de termos: 0 								Erro! Valor inválido.
 * 
 * 
 */

import java.util.Scanner;

public class POO026 {
	
	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Entre com a quantidade de termos: ");
        int n = leia.nextInt();

        if (n <= 0) {
            System.out.println("Erro! Valor inválido.");
        } else {
            int[] numeros = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Entre com " + (i + 1) + "º número: ");
                numeros[i] = leia.nextInt();
            }

            int[] perfeitos = encontrarNumerosPerfeitos(numeros, n);
            System.out.print(">> ");
            for (int i = 0; i < perfeitos.length; i++) {
                System.out.print(perfeitos[i] + " ");
            }
        }
    }

    public static int[] encontrarNumerosPerfeitos(int[] numeros, int n) {
        int[] perfeitos = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = numeros[i];
            int soma = 0;
            for (int j = 1; j <= num / 2; j++) {
                if (num % j == 0) {
                    soma += j;
                }
            }
            if (soma == num) {
                perfeitos[count] = num;
                count++;
            }
        }

        int[] resultado = new int[count];
        for (int i = 0; i < count; i++) {
            resultado[i] = perfeitos[i];
        }

        return resultado;
    }
}

