/*
 * Animal.java
 * 
 * 
 */


public class Animal {
	
	private String nome;
	private int idade;
	private String especie;
	
	public Animal() {
		this.nome = "Maui";
		this.idade = 19;
		this.especie = "Cachorro";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;		
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public String imp() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() +"\nEspecie: " + getEspecie();
	}
}

