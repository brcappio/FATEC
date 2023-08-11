/* Bruno Rosa Cappio
 * Doces.java
 */


public class Doces extends Produto {
	
	public Doces(double preco, int quantidade) {
		super(preco, quantidade);
	}
	
	@Override
    public String getNome() {
        return "Doces";
    }
}

