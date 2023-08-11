/*
 * UsaPasseio.java
 * 
 */


public class UsaPasseio {
	
	public static void main (String[] args) {
		Passeio passeio = new Passeio();
		
		System.out.println("Placa: " + passeio.getPlaca());
		System.out.println("Marca: " + passeio.getMarca());
		System.out.println("Portas: " + passeio.getPortas());
		System.out.println("Ar condicionado: " + passeio.hasArCondicionado());
		System.out.println("Km inicial: " + passeio.getKmInicial());
		System.out.println("Km final: " + passeio.getKmFinal());
		
		System.out.println("Valor Km: " + passeio.getValorKmRodado());
		
		System.out.println("Valor do aluguel: " + passeio.calculaValorLocacao());
	}
}

