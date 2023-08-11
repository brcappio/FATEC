/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex21;

import java.util.Scanner;

public class Ex21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite uma quantidade de numeros: ");
        int qtd = leia.nextInt();
        int maior = 0;
        int soma = 0;
        
        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite o " + i + "° numero: ");
            int num = leia.nextInt();
            soma += num;
            if (num > maior) {
                maior = num;
            }
        }
        int media = soma / qtd;
        System.out.println("O maior numero eh: " + maior);
        System.out.println("A media dos numeros eh: " + media);
    }
    
}
