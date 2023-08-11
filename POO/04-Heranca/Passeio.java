/*
 * Passeio.java
 * 
 * 
 * 
 * 
 */


public class Passeio extends Veiculo {
	
	private boolean arCondicionado;
	private int portas;
	
	public Passeio() {
		
		super();
		
		this.arCondicionado = false;
		this.portas = 2;
	}
	
	public void setArCondicionado (boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
	public void setPortas (int portas) {
		this.portas = portas;
	}
	
	public boolean hasArCondicionado() {
		return arCondicionado;
	}
	
	public int getPortas() {
		return portas;
	}
}
