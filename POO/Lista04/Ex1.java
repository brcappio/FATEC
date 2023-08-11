/* Bruno Rosa Cappio
 * 1) Criar uma classe para representar uma lâmpada vendida em um supermercado.
Além de marca, modelo e tipo, esta deve conter um atributo que indique um dos dois possíveis estados da lâmpada (acesa ou
apagada)
 * 
 * 
 */


public class Ex1 {
	public static void main (String[] args) {
		Lampada lampada1 = new Lampada("Cappio", "A60", "LED");
		lampada1.acender();
		System.out.println("Marca: " + lampada1.getMarca() + "\nModelo: " + lampada1.getModelo() + "\nTipo: " + lampada1.getTipo());
		System.out.println("A lampada esta acesa? " + lampada1.estaAcesa());
		System.out.println("\nApagando a lampada...\n");
		lampada1.apagar();
		System.out.println("A lampada esta acesa? " + lampada1.estaAcesa());
	}
	
}



