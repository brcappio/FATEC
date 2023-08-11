/* Bruno Rosa Cappio
56) Imprima os números perfeitos na faixa de 1 a 900.
*/


public class Ex56 {
	
	public static void main(String[] args) {
    for (int i = 1; i <= 900; i++) {
        if (ehPerfeito(i)) {
            System.out.print(i + " ");
        }
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

