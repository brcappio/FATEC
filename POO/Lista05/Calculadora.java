/* Bruno Rosa Cappio
 * 2) Crie uma classe para representar uma calculadora com as quatro operações básicas da aritméticaconforme o diagrama abaixoe após uma classe que teste essa implementação.
 * 
 */


public class Calculadora {
	private int numero1;
	private int numero2;
	
	/* Nao preciso do construtor nesse caso pq o usuario que vai digitar os numeros, entao vou utilizar o setNumero.
	 * Nao preciso fazer o
	 *  Calculadora calculadora = new Calculadora(5,3);
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	*/
	
	public void setNumero1 (int numero1) {
		this.numero1 = numero1;
	}
	
	public void setNumero2 (int numero2) {
		this.numero2 = numero2;
	}
	
	public int getNumero1() {
		return numero1;
	}
	
	public int getNumero2() {
		return numero2;
	}
	
	public int somar() {
		return numero1 + numero2;
	}
	
	public int subtrair() {
		return numero1 - numero2;
	}
	
	public int multiplicar() {
		return numero1 * numero2;
	}
	
	public double dividir() {
		return (double)numero1 / (double)numero2;
	}
}

