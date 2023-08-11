// Bruno Rosa Cappio

package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);
        String escolha = "S";
        
        do {
            int numGerado = (int)(Math.random() * 10);
            int palpite = 0;
            for (int i = 1; i <= 3; i++) {
                System.out.print("Adivinhe o numero secreto: ");
                palpite = leia.nextInt();
                if (palpite == numGerado) {
                    System.out.println("\nParabens! Voce acertou na " + i + "a tentativa!");
                    break;
                } else if (palpite != numGerado && i == 3){
                    System.out.println("\nAcabaram as tentativas! Voce perdeu!");
                } else {
                    System.out.println("Erro, tentativa " + i + " de 3");
                }            
            }
            System.out.println("O numero era: " + numGerado);
            System.out.print("\nJogar novamente [S/N]?: ");
            System.out.println();
            escolha = leiaStr.nextLine();
        } while (escolha.equalsIgnoreCase("S"));
        
        
        
    }
    
}
