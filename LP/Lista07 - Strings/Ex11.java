/* Bruno Rosa Cappio
 * 11) Escreva um programa que conte e exiba, separadamente, a quantidade de caracteres
alfabéticos e de dígitos numéricos existentes em uma frase fornecida pelo usuário.
 */
package ex11;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = leia.nextLine().toUpperCase();
        
        int contadorChar = 0;
        int contadorNum = 0;
        
        for (int i = 0; i < frase.length(); i++){
            char testeChar = frase.charAt(i);  
            
            if (Character.isLetter(testeChar)){
                contadorChar++;
            }
            
            if (Character.isDigit(testeChar)){
                contadorNum++;
            }
            
        }
        
        System.out.println("A quantidade de caracteres: " + contadorChar + "\nQuantidade de algarismos: " + contadorNum);
        
        
    }
    
}
