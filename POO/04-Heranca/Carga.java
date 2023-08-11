/*
 * Carga.java
 * 
 * 
 */


public class Carga extends Veiculo {
	
	private int capacidade;
	
	public Carga() {
		super();
		this.capacidade = 15;
	
	}
	
	public void setCapacidade (int capacidade) {
		this.capacidade = capacidade;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	//Fazendo os 10%
	@Override
	public double calculaValorLocacao() {
		return (getKmFinal() - getKmInicial()) * getValorKmRodado() * 1.1;
	}
	
	/*Outra maneira
	@Override
	public double calculaValorLocacao() {
		return super.calculaValorLocacao() * 1.1;
	}
	*/
}

