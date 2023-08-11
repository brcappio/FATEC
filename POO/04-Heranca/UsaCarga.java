/*
 * UsaCarga.java
 * 
 * 
 * 
 */


public class UsaCarga {
	
	public static void main (String[] args) {
		Carga carga = new Carga();
		
		System.out.println("Placa: " + carga.getPlaca());
		System.out.println("Marca: " + carga.getMarca());


		System.out.println("Km inicial: " + carga.getKmInicial());
		System.out.println("Km final: " + carga.getKmFinal());
		
		System.out.println("Valor Km: " + carga.getValorKmRodado());
		
		System.out.println("Valor do aluguel: " + carga.calculaValorLocacao());
	}
}

