/*
 * Fruta.java 
 */


public class Fruta {
	
	private String cor;
	
	
	public Fruta() {
		this.cor = "verde";
	}
	
	public Fruta(String cor) {
		setCor(cor);
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	
}

