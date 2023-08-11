/* Bruno Rosa Cappio
 * 1) Exibir na tela os caracteres da tabela de códigos ASCII (American Standard Code for
Information Interchange).
 * 
 * 
 */


public class Ex1 {
	
	public static void main (String[] args) {
		/*for (int i = 0; i <= 255; i++) {
			System.out.print((char)i + " ");
			
			if (i %20 == 0) {
				System.out.println();
			}
		}*/
		
		for (char i = 0; i <= 255; i++) {
			System.out.print((char)i + " ");
			
			if (i %20 == 0) {
				System.out.println();
			}
		}
	}
}

