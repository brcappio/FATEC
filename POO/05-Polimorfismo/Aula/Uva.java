/*
 * Uva.java
 */


public class Uva extends Fruta {
	
	private int quantidade;
	
	public Uva() {
		super();
		
		this.quantidade = 15;
	}
	
	public Uva(String cor, int quantidade) {
		super(cor);
		
		setQuantidade(quantidade);
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public String toString() {
		return "Uva[cor: " + getCor() + ", quantidade: " + getQuantidade() + "]";
	}
}

