/* Bruno Rosa Cappio
 * 10) [POO-023] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
array. Através de um método que receba esse array de números inteiros como parâmetro de entrada,
calcule e retorne o MMC (Mínimo Múltiplo Comum) desse conjunto de dados. Valide as entradas para
aceitar apenas números positivos (pode ser um método). Utilize decomposição simultânea ou fatoração
simultânea.
 * 
 * 
 */

import java.util.Scanner;

public class POO023 {
	
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
        
        int mmc = calculaMMC(numeros);
        System.out.printf("MMC: %d\n", mmc);
    }
    
    static int calculaMMC(int[] numeros) {
        int mmc = 1;
        int fator = 2;
        boolean divisao;
        int cont;
        do {
            divisao = false;
            cont = 0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == 1) {
                    cont++;
                }
                if (numeros[i] % fator == 0) {
                    divisao = true;
                    numeros[i] = numeros[i] / fator;
                }
            }
            if (divisao) {
                mmc *= fator;
            } else {
                fator++;
            }
        } while (cont < numeros.length);
        return mmc;
    }
}

