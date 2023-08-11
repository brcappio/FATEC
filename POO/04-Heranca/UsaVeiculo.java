public class UsaVeiculo {
	
	public static void main (String[] args) {
		Veiculo veiculo = new Veiculo();
		
		System.out.println("Placa: " + veiculo.getPlaca());
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Km inicial: " + veiculo.getKmInicial());
		System.out.println("Km final: " + veiculo.getKmFinal());
		
		System.out.println("Valor Km: " + veiculo.getValorKmRodado());
		
		System.out.println("Valor do aluguel: " + veiculo.calculaValorLocacao());
	}
}

