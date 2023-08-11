/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idades;

/**
 *
 * @author ALUNO
 */
public class Idades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 10;
        
        switch (idade) {
            case 0:
            case 1:
            case 2:
                System.out.println("<=2");
            case 3:
            case 4:
            case 5:
                System.out.println("<=5");
                break;
        }
        // TODO code application logic here
    }
    
}
