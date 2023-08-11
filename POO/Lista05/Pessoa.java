/*
 * Bruno Rosa Cappio
 * Criar uma classe para representar uma Pessoa.
 * A pessoa tem como características
 * o nome, em formato String, 
 * a idade, em números inteiros e a 
 * altura, que pode ter casas decimais.
 * Além dos métodos assessores de cada característica, temos um método que recebe como parâmetro de entrada um valor lógico, 
 * que quando verdadeiro, incrementa em um a idade da pessoa e esse método deve ser chamado por fazAniversario, 
 * não havendo retorno.
 * Siga o diagrama abaixo para implementar a classe Pessoa. 
 * Após crie uma classe para testar. 
 * Observe os sinais de mais e de menos antes dos nomes dos atributos e métodos. Respeite-os!
 */


public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa() {
		
	}
	
	public void setNome(String nome) {
		if (!nome.isEmpty()) {
			this.nome = nome;
		}
	}
	
	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		}
	}
	
	public void setAltura(double altura) {
		if (altura > 0 && altura <= 3.5) {
			this.altura = altura;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void fazAniversario (boolean faz) {
		if (faz) {
			idade++;
		}
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
	}
	
	/*public String info() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
	}*/
}

