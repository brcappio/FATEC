/* Bruno Rosa Cappio
 * 25) Escreva um programa para ler um vetor AF de dimensão definida e com elementos fornecidos pelo usuário e ordenar crescente de forma crescente os elementos ÍMPARES e decrescente os elementos PARES. Ao final imprimir o vetor AF ordenado
 * 
 * 
 */


import java.util.Scanner;

public class Ex25 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor AF: ");
        int N = leia.nextInt();
        
        int AF[] = new int[N];
        
        //Montar o array
        for (int i = 0; i < AF.length; i++) {
			System.out.print("Digite o elemento da posicao " + i + ": ");
			AF[i] = leia.nextInt();
		}
		
		//Ordenar o array
		for (int i = 0; i < AF.length - 1; i++) {
            for (int j = 0; j < AF.length - 1 - i; j++) {
                if (AF[j] % 2 == 0 && AF[j+1] % 2 == 0) {
                    // Ordenar elementos pares em ordem decrescente
                    if (AF[j] < AF[j+1]) {
                        int temp = AF[j];
                        AF[j] = AF[j+1];
                        AF[j+1] = temp;
                    }
                } else if (AF[j] % 2 != 0 && AF[j+1] % 2 != 0) {
                    // Ordenar elementos ímpares em ordem crescente
                    if (AF[j] > AF[j+1]) {
                        int temp = AF[j];
                        AF[j] = AF[j+1];
                        AF[j+1] = temp;
                    }
                } else if (AF[j] % 2 == 0 && AF[j+1] % 2 != 0) {
                    // Mover elementos pares para o final do vetor
                    int temp = AF[j];
                    AF[j] = AF[j+1];
                    AF[j+1] = temp;
                }
            }
        }

        
		//Exibir o array
		System.out.println("\nVetor AF: ");
		for (int i = 0; i < AF.length; i++) {
			System.out.print(AF[i] + " ");
		}
    }
}




