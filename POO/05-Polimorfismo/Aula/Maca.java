/*
 * Maca.java 
 */


public class Maca extends Fruta {
	
	private String tipo;
	
	public Maca() {
		super();
		
		this.tipo = "fuji";
	}
	
	public Maca (String cor, String tipo) {
		super(cor);
		
		setTipo(tipo);
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	@Override
	public String toString() {
		return "Maca[cor: " + getCor() + ", tipo: " + tipo +" ] ";
	}
}

