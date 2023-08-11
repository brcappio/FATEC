/* Bruno Rosa Cappio
57) Solicite ao usuário a quantidade de termos da sequência de números perfeitos e imprima o resultado.
*/

import java.util.Scanner;


public class Ex57 {
	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.print("Digite a quantidade de termos da sequência de números perfeitos: ");
    int n = leia.nextInt();
    
    int i = 1;
    int count = 0;
    while (count < n) {
        if (ehPerfeito(i)) {
            System.out.print(i + " ");
            count++;
        }
        i++;
    }
}

	public static boolean ehPerfeito(int num) {
		int soma = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				soma += i;
			}
		}
		return soma == num;
	}
}

