/* Bruno Rosa Cappio
 * 6) [POO-019] Crie um programa que solicite ao usuário dois números inteiros. Estes, devem ser passados
como parâmetros de entrada para um método que irá gerar todos os números primos existentes no
intervalo fechado desses dois valores e retornar uma array com a resposta.
O programa principal ficará com a responsabilidade de imprimir o array de primos retornado pelo método.
O método deve aceitar e entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1.
* 
Entrada: 									Saída:
Entre com um valor: 10 						>> 11 13 17 19 23 29 31 37 41 43 47
Entre com outro valor: 50
* 
Entre com um valor: 231 					>> 211 223 227 229
Entre com outro valor: 205
* 
Entre com um valor: 19 						>> 19
Entre com outro valor: 19
 * 
 * 
 */

import java.util.Scanner;

public class POO019 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com um valor: ");
        int inicio = leia.nextInt();

        System.out.print("Entre com outro valor: ");
        int fim = leia.nextInt();

        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        int[] primos = gerarPrimosNoIntervalo(inicio, fim);

        System.out.print("Números primos no intervalo [" + inicio + ", " + fim + "]: ");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }
    }

    public static int[] gerarPrimosNoIntervalo(int inicio, int fim) {
        int[] primos = new int[fim - inicio + 1];
        int count = 0;

        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                primos[count] = i;
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = primos[i];
        }

        return result;
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


