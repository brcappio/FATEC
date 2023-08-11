/*
 * 20) Escreva um programa em Java que leia 100 valores e no final, escreva o maior
e o menor valor lido.
 */
package ex20;

/**
 *
 * @author Aluno
 */
public class Ex20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maior = 1;
        int menor = 99;
        for (int i = 0; i <= 100; i++) {
           int aleatorio = (int)(Math.random()*100);
           System.out.println(aleatorio);
           if (aleatorio > maior) {
               maior = aleatorio;
           } else if (aleatorio < menor) {
               menor = aleatorio;
           }
        }
        System.out.println("O maior numero eh: " + maior);
        System.out.println("O menor numero eh: " + menor);
    }
    
}
