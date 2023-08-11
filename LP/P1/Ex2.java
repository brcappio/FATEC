// Bruno Rosa Cappio

package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quantidade = 1;

        do {
            System.out.print("\nEntre com a quantidade de termos da sequencia: ");
            quantidade = leia.nextInt();

            if (quantidade == 0) {
                System.out.println("Fim do programa!");
                break;
            } else if (quantidade < 0) {
                System.out.println("Quantidade inválida!");
            } else {
                System.out.println("Os " + quantidade + " últimos números primos da sequência de Fibonacci são:");
                exibirUltimosPrimosFibonacci(quantidade);
            }
        } while (quantidade != 0);

        leia.close();
    }

    private static void exibirUltimosPrimosFibonacci(int quantidade) {
        int contador = 0;
        int termoAtual = 1;
        int termoAnterior = 0;
        int[] ultimosPrimos = new int[quantidade];
        
        while (contador < quantidade) {
            if (isPrimo(termoAtual) && isFibonacci(termoAtual)) {
                ultimosPrimos[contador] = termoAtual;
                contador++;
            }
            int proximoTermo = termoAtual + termoAnterior;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }

        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.print(ultimosPrimos[i] + " ");
        }

        System.out.println();
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (b < numero) {
            int proximoTermo = a + b;
            a = b;
            b = proximoTermo;
        }

        return b == numero;
    }
}