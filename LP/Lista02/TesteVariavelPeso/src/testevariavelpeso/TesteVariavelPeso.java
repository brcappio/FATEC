/*Bruno Rosa Cappio
8 - Crie um arquivo chamado TestaVariavelPeso.java. Implemente um programa em Java que
declare uma variável do tipo double chamada peso. Essa variável deve ser inicializada com o valor
do seu peso. No final, exiba o valor dessa variável na saída padrão usando o println() e o printf()
*/

package testevariavelpeso;

/**
 *
 * @author ALUNO
 */
public class TesteVariavelPeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso = 60.00;
        System.out.println(peso);
        System.out.printf("Utilizando o printf: %f" + "\n", peso);
    }
    
}
