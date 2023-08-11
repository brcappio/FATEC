/*6 – Crie um arquivo chamado ValorNull.java.
Implemente um programa em Java que declare uma
variável do tipo Double chamada numero. Essa variável deve ser inicializada com o valor 3.14.
Exiba o valor dessa variável na saída padrão. Depois, armazene o valor
null na variável numero. Por fim, exiba novamente o valor dessa variável na saída padrão*/
package valornull;

/**
 *
 * @author ALUNO
 */
public class ValorNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double numero = 3.14;
        System.out.println("O valor da variável numero é: " + numero);
        
        numero = null;
        System.out.println("O novo valor da variável numero é: " + numero);
    }
    
}
