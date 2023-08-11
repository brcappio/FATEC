/* Bruno Rosa Cappio
 * 3) Declarar uma variável do tipo String com seu valor inicial igual a branco ('') e a seguir atribuir as letras minúsculas
do alfabeto (abcde...z), uma-a-uma, as primeiras vinte e seis posições da variável String. Imprimir o resultado.
 * 
 * 
 */


public class Ex3 {
	
	public static void main (String[] args) {
		String i = "";
		for (int letra = 97; letra <= 122; letra++) {
			i += (char)letra;			
		}
		System.out.print(i + " ");
	}
}

