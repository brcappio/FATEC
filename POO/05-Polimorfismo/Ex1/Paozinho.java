/* Bruno Rosa Cappio
 * Paozinho.java
 */


public class Paozinho extends Produto {
	
	public Paozinho(double preco, int quantidade) {
		super(preco, quantidade);
	}
	
	@Override
    public String getNome() {
        return "Pãozinho";
    }
}

