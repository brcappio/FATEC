/* Bruno Rosa Cappio
 * Frios.java
 */


public class Frios extends Produto {
	
	public Frios(double preco, int quantidade) {
		super(preco, quantidade);
	}
	
	@Override
    public String getNome() {
        return "Frios";
    }
}

