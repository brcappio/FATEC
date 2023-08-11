/*
 * Mamifero.java 
 */


public class Mamifero extends Animal {
	
	private String habitat;
	private boolean bico;
	
	public Mamifero() {
		super();
		
		this.habitat = "Agua";
		this.bico = true;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void setBico(boolean bico) {
		this.bico = bico;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public boolean hasBico() {
		return bico;
	}
	
	@Override
	public String imp() {
		return super.imp() + "\nHabitat: " + getHabitat() + "\nTem bico?: " + hasBico();
	}
	
}

