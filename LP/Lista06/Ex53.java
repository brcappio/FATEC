/* Bruno Rosa Cappio
53) Imprima os números da sequência de Fibonacci que estão presentes na faixa de 1 até 250.
*/


public class Ex53 {
	
	public static void main (String[] args) {
	int a = 0;
	int b = 1;
	int c;
	while (b <= 250) {
		if (b == 1) {
			System.out.print(b + ", ");
		} else {
			System.out.print(b + ", " );
		}
		c = a + b;
		a = b;
		b = c;
	}
	}
}

