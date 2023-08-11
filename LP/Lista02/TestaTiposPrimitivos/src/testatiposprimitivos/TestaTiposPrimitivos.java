/* Bruno Rosa Cappio
9 - Crie um arquivo chamado TestaTiposPrimitivos.java. Implemente um programa em Java que
declare uma variável de cada um dos tipos primitivos da linguagem Java. Essas variáveis devem ser
inicializadas com valores adequados. Por fim, exiba os valores dessas variáveis na saída padrão.
*/
package testatiposprimitivos;

/**
 *
 * @author ALUNO
 */
public class TestaTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte exemploByte = 2;
        short exemploShort = 128;
        int exemploInt = 2147483647;
        long exemploLong = -9223372036854775808l;
        float exemploFloat = 2.5412356f;
        double exemploDouble = 3.141592653589793;
        boolean exemploBoolean = false;
        String exemploString = "oi cris";
        
        System.out.println("Byte, eles vão de -128 até 127: " + exemploByte);
        System.out.println("Short, eles vão de -32,768 até 32,767: " + exemploByte);
        System.out.println("Int, eles vão de -2,147,483,648 até 2,147,483,647: " + exemploInt);
        System.out.println("Long, eles vão de -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807: " + exemploLong);
        System.out.println("Float, ele suporta até 7 casas decimais: " + exemploFloat);
        System.out.println("Double, ele suporta até 15 casas decimais: " + exemploDouble);
        System.out.println("Boolean, eles podem ser ou True ou False: " + exemploBoolean);
        System.out.println("String, elas suportam caracteres e simbolos ASCII: " + exemploString);
    }
    
}
