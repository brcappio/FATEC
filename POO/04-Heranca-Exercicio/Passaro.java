/*
 * Passaro.java
 */


public class Passaro extends Animal {
	
	private String corPena;
	
	public Passaro() {
		super();
		
		this.corPena = "Verde";
	}
	
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	public String getCorPena() {
		return corPena;
	}
	
	@Override
	public String imp() {
		return super.imp() + "\nCor da Pena: " + getCorPena;
	}
}

