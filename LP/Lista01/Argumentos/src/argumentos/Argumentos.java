/* Bruno Rosa Cappio
 * 2 - Crie um programa utilizando a linguagem de programação Java. Esse programa deve exibir os
dois primeiros argumentos de linha de comando. O código fonte desse programa deve ser
armazenado em um arquivo chamado
Argumentos.java
*/
package argumentos;

/**
 *
 * @author Aluno
 */
public class Argumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(args.length);
       System.out.println(args[0]);
       System.out.println(args[1]);
    }
    
}
