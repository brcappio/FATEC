/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex22;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class Ex22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int maior = 0;
        int soma = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o codigo do " + i + "° produto: ");
            int codigo = leia.nextInt();
            
            System.out.print("Digite o preco do " + i + "° produto: ");
            int preco = leia.nextInt();
            soma += preco;
            if (preco > maior) {
                maior = preco;
            }
        }
        int media = soma / 15;
        System.out.println("O maior preco eh: " + maior);
        System.out.println("A media dos produtos eh: " + media);
    }
    
}
