/* Bruno Rosa Cappio
4 - Crie um arquivo chamado Triangulo.java. Implemente um programa que exiba na saída padrão
um triângulo de asteriscos semelhante ao mostrado a seguir. Não utilize sequências de escape para
desenvolver esse programa.
*
**
***
****
******/
package triangulo;

public class Triangulo {

    static String ast = "*";
    
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(ast);
            ast += "*";
        }
    }
    
}
