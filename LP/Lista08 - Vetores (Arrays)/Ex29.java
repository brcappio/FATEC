/* Bruno Rosa Cappio
 * Ex29.java
   29) Escreva um programa para criar um vetor AJ de dimensão definida pelo usuário (>=10) e gerar os elementos aleatórios e não repetidos. 
   * Ordenar crescente. 
   * O usuário deverá, em 10 tentativas, descobrir um elemento do vetor. 
   * Caso acerte, o programa deverá imprimir o vetor AJ e a posição onde o elemento do usuário estava. 
   * Uma dica importante para aumentar a “emoção” e a dificuldade é colocar um aleatório grande. 
 */

import java.util.Scanner;

public class Ex29 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int de = 0, para = 0;
		
		System.out.print("Digite a dimensao do array: ");
		int tamanhoAJ = leia.nextInt();
		while (tamanhoAJ < 10) {
			System.out.print("Valor deve ser maior que 10. Digite novamente a dimensao do array: ");
			tamanhoAJ = leia.nextInt();
		}
		
		int AJ[] = new int[tamanhoAJ];
		
		for(int i = 0; i < tamanhoAJ; i++) {
			int valorGerado;
			boolean repetido;
			do {
				valorGerado = (int)(Math.random() * 100);
				repetido = false;
				
				for(int j = 0; j < i; j++) {
					if(AJ[j] == valorGerado) {
						repetido = true;
						break;
					}
				}
			} while(repetido);
			
			AJ[i] = valorGerado;
		}
		
		//Ordena o array
		for(int i = 0; i < tamanhoAJ; i++) {
			for(int j = 0; j < tamanhoAJ; j++) {
				if(AJ[i] < AJ[j]) {
					de = AJ[i];						
					para = AJ[j];
							
					AJ[i] = para;
					AJ[j] = de;	
				}	
			}		
		}
								
		System.out.println("\n");
		System.out.println("Tente descobrir um elemento do vetor, voce tem 10 tentativas.");
		int tentativas = 10;
				
		boolean achou = false;
		
		while (tentativas > 0 && !achou) {
			System.out.print("Escolha: ");
			int escolha = leia.nextInt();
			
			for(int i = 0; i < tamanhoAJ; i++) {
				if (AJ[i] == escolha) {
					System.out.println("\nValor encontrado! Posicao: " + i);
					achou = true;
					break;
				}
			}
			
			if (!achou) {
				tentativas--;
				System.out.println("Nao encotrado.. Tente novamente\nTentativas restantes: " + tentativas);
			}
		}
		
		if (!achou) {
			System.out.println("Suas tentativas acabaram!!\nEncerrando o programa.....");
		}
		
		System.out.println("\nArray AJ em ordem crescente: ");
		for(int i = 0; i < tamanhoAJ; i++) {
			System.out.print(AJ[i] + " ");
		}
	}
}

