/* Bruno Rosa Cappio
10 - Considere um sistema de gerenciamento de mercadorias de uma loja. Implemente um programa
que declare variáveis para representar os seguintes dados: número do pedido, código do produto,
quantidade e valor total da compra. Inicialize essas variáveis com valores apropriados. Por fim,
exiba os valores armazenados.*/
package gerenciamentodemercadorias;

/**
 *
 * @author ALUNO
 */
public class GerenciamentoDeMercadorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroDoPedido = 25154;
        int codigoDoProduto = 13;
        byte quantidade = 3;
        float valorDaCompra = 65.00f;
        
        System.out.println("O numero do pedido é : " + numeroDoPedido + 
                "\nO codigo do produto é: " + codigoDoProduto +
                "\nA quantidade comprada foi: " + quantidade +
                "\nO valor da compra foi: " + valorDaCompra);
    }
    
}
