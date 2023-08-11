/*
 * 12) Escreva um programa que conta e exibe a quantidade de vezes que cada vogal ocorre em
uma frase fornecida pelo usuário.
 */
package ex12;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = leia.nextLine().toUpperCase();
        
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        
        for (int i = 0; i < frase.length(); i++){
            char testeChar = frase.charAt(i);  
            
            switch(testeChar) {
                case 'A':
                    countA++;
                    break;
                case 'E':
                    countE++;
                    break;
                case 'I':
                    countI++;
                    break;
                case 'O':
                    countO++;
                    break;
                case 'U':
                    countU++;
                    break;
            }
            
            
        }
        
        System.out.println("--Quantidade de Vogais--" + "\n A - " + countA + "\n E - " + countE + "\n I - " + countI + "\n O - " + countO + "\n U - " + countU);
        
        
    }
    
}
