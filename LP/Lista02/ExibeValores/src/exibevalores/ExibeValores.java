/* Bruno Rosa Cappio
4 - Crie um arquivo chamado ExibeValores.java. Implemente um programa em Java que armazene
em variáveis os valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793, true e 'K'.
Utilize sempre o tipo primitivo adequado que ocupe o menor
espaço possível. Defina os nomes que achar mais apropriado para essas variáveis.
Por fim, exiba os valores dessas variáveis na saída
padrão*/

//Perguntas 1- Pq tem que colocar o L e o F no long e no float
//2 - Static serve pra que?
//3 - Pra que servem os argumentos e como faço pra rodar no console os programas feitos no netbeans

package exibevalores;

/**
 *
 * @author ALUNO
 */
public class ExibeValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte exemploByte = 19;
        short exemploShort = 1571;
        int exemploInt = 100000;
        long exemploLong = 2147483648l;
        float exemploFloat = 3.14f;
        double exemploDouble = 3.141592653589793;
        boolean exemploBoolean = true;
        String exemploString = "K";
        
        System.out.println("Esse é um exemplo de um byte, eles vão de -128 até 127: " + exemploByte);
        System.out.println("Esse é um exemplo de um short, eles vão de -32,768 até 32,767: " + exemploByte);
        System.out.println("Esse é um exemplo de um int, eles vão de -2,147,483,648 até 2,147,483,647: " + exemploInt);
        System.out.println("Esse é um exemplo de um long, eles vão de -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807: " + exemploLong);
        System.out.println("Esse é um exemplo de um float, ele suporta até 7 casas decimais: " + exemploFloat);
        System.out.println("Esse é um exemplo de um double, ele suporta até 15 casas decimais: " + exemploDouble);
        System.out.println("Esse é um exemplo de um Boolean, eles podem ser ou True ou False: " + exemploBoolean);
        System.out.println("Esse é um exemplo de uma String, elas suportam caracteres e simbolos ASCII: " + exemploString);
        
    }
    
}
