/* Bruno Rosa Cappio
 * Herança
 * 
 * 
 */


public class Veiculo {
	
	private String placa;
	private String marca;
	private double modelo;
	private int ano;
	private double valorKmRodado;
	private int kmInicial;
	private int kmFinal;
	
	
	public Veiculo() {
		this.placa = "abc1234";
		this.marca = "vw";
		this.modelo = 1.0;
		this.ano = 2021;
		this.valorKmRodado = 10.0;
		this.kmInicial = 1000;
		this.kmFinal = 1100;
	}
	
	public void setPlaca (String placa) {
		this.placa = placa;
	}
	
	public void setMarca (String placa) {
		this.marca = marca;
	}
	
	public void setModelo (double modelo) {
		this.modelo = modelo;
	}
	
	public void setAno (int ano) {
		this.ano = ano;
	}
	
	public void setValorKmRodado (double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	
	public void setKmInicial (int kmInicial) {
		this.kmInicial = kmInicial;
	}
	
	public void setKmFinal (int kmFinal) {
		this.kmFinal = kmFinal;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getModelo() {
		return modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	
	public int getKmInicial() {
		return kmInicial;
	}
	
	public int getKmFinal() {
		return kmFinal;
	}
	
	public double calculaValorLocacao () {
		return (kmFinal - kmInicial) * valorKmRodado;
	}
}

