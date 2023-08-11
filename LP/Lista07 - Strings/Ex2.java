/* Bruno Rosa Cappio
 * 2) Declarar uma variável do tipo String com seu valor inicial igual a branco ('') e a seguir atribuir as letras maiúsculas
do alfabeto (ABCDE...Z), uma-a-uma, as primeiras vinte e seis posições da variável String. Imprimir o resultado.
 * 
 * 
 */


public class Ex2 {
	
	public static void main (String[] args) {
		String i = "";
		for (int letra = 65; letra <= 90; letra++) {
			i += (char)letra;			
		}
		System.out.print(i + " ");
	}
}

