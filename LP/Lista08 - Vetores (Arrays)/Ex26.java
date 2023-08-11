/* Bruno Rosa Cappio
 * 26) Escreva um programa para ler um vetor AG de dimensão e com elementos fornecidos pelo usuário e colocar, somente, os elementos PRIMOS em ordem crescente. Ao final imprimir o vetor AG ordenado.
 * 
 * 
 */


import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int de = 0, para = 0;

        System.out.print("Digite o tamanho do vetor AG: ");
        int N = leia.nextInt();

        int AG[] = new int[N];
        
        for (int i = 0; i < N; i++) {
			System.out.print("Digite o elemento [" + i + "]: ");
			AG[i] = leia.nextInt();
		}
		
		System.out.println("\nVetor AG: ");
		for (int i = 0; i < N; i++) {
			System.out.print(AG[i] + " ");
		}
		
		//Ordenar os numeros primos do array
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (isPrimo(AG[i]) && isPrimo(AG[j])){
					if (AG[i] < AG[j]) {
						de = AG[i];
						para = AG[j];
						
						AG[i] = para;
						AG[j] = de;
					}
				}
			}
		}
		
		System.out.println("\nVetor AG Ordenado: ");
		for (int i = 0; i < N; i++) {
			System.out.print(AG[i] + " ");
		}
	}
	
	public static boolean isPrimo(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

