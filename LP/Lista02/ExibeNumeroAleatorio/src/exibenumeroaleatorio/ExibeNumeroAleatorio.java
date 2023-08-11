/* Bruno Rosa Cappio
2 - Crie um arquivo chamado ExibeNumeroAleatorio.java. Implemente um programa em Java que gere um número real
aleatório entre 0 e 100.
Esse número deve ser armazenado em uma variável do tipo double chamada numeroAleatorio.
Por fim, exiba o valor dessa variável na saída padrão.*/

package exibenumeroaleatorio;


import java.lang.Math;
/**
 *
 * @author ALUNO
 */
public class ExibeNumeroAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numeroAleatorio = Math.random();
        System.out.println(numeroAleatorio * 100);
    }
    
}
