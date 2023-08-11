public class Conta{
	private double valor;
	private int pessoas;
	private boolean garcom;
	
	public Conta (double valor, int pessoas) {
		this.valor = valor;
		this.pessoas = pessoas;
	}
	
	public void setGarcom( boolean garcom ) {
		this.garcom = garcom;
	}
	
	public double calcula() {
		return garcom? (valor * 1.1) / pessoas : valor / pessoas;
	}
	
}
