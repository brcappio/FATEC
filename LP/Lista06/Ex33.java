/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex33;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int termos;
        
        do {
            System.out.print("Digite a quantidade de termos (zero para sair): ");
            termos = leia.nextInt();
            
            if (termos < 0) {
                System.out.println("Valor inválido. Digite um valor positivo ou zero.");
            } else if (termos > 0) {
                int num = 1;
                System.out.print(num);
                for (int i = 2; i <= termos; i++) {
                    num += 2;
                    System.out.print(", " + num);
                }
                System.out.println();
            }
        } while (termos != 0);
    }
}