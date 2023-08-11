/* Bruno Rosa Cappio
 * Produto.java
 * 
 */


public class Produto {
	
	private double preco;
	private int quantidade; 
	
	public Produto(double preco, int quantidade) {
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public String getNome() {
        return "Produto";
    }
	
	@Override
	public String toString() {
		return getNome() + ": \nPreco: " + preco + "\nQuantidade: " + quantidade + "\n";
	}
}

