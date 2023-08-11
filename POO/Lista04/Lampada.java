public class Lampada {
	
		
	private String marca;
	private String modelo;
	private String tipo;
	private boolean acesa;
	
	public Lampada(String marca, String modelo, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.acesa = false;
	}
	
	public void acender() {
		this.acesa = true;
	}
	
	public void apagar() {
		this.acesa = false;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String estaAcesa(){		
		return this.acesa? "Sim" : "Nao";
	}
}

