/*
 * 4)Elabore um programa em java que contenha um método
 *  que aceite um valor inteiro e retorne o número comos dígitos invertidos.
 *  O valor deve ser solicitado ao usuário.
 * 
 * 
 */


public class Numero {
	
	private int numero;
	
	public Numero() {
		
	}
	
	public void setNumero(int numero) {
		if (numero >= 0) {
			this.numero = numero;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int inverter() {
		String numeroStr = "" + numero;
		
		String numeroInvertido = "";
		
		for (int i = 0; i < numeroStr.length(); i++) {
			numeroInvertido = numeroStr.charAt(i) + numeroInvertido;
		}
		
		return Integer.parseInt(numeroInvertido);
	}
}

