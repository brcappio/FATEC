/* Bruno Rosa Cappio
 * 14) [POO-027] Crie um programa que solicite ao usuário um número inteiro. Através de um método que
receba esse número inteiro como parâmetro de entrada, inverta dígito-a-dígito e retorne um valor inteiro
com o número invertido.
Entrada: 										Saída:
Entre com um número: 12 						>> 21
Entre com um número: 430 						>> 34
Entre com um número: -27 						>> -72
Entre com um número: 0 							>> 0
 * 
 * 
 */

import java.util.Scanner;

public class POO027 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Entre com um numero: ");
		int num = leia.nextInt();
		
		System.out.println("Numero invertido: " + inverteNum(num));
	}
	
	public static int inverteNum(int num) {
        String numStr = Integer.toString(num);
        String inversoStr = "";
        
        for (int i = numStr.length() - 1; i >= 0; i--) {
            inversoStr += numStr.charAt(i);
        }
        
        if (num < 0) {
            inversoStr = "-" + inversoStr.substring(0, inversoStr.length() - 1);
        }
        
        return Integer.parseInt(inversoStr);
    }
}

