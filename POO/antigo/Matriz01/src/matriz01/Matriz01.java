/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz01;

/**
 *
 * @author ALUNO
 */
public class Matriz01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vetor[] = new int[4];
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");
        
        
        int matriz[][] = new int[5][4];
        
        
        //2 laços para percorrer a matriz, pensar em linhas e colunas, o primeiro percorre as linhas e o segundo as colunas.
        
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna]+ " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        int matriz2[][] = new int[5][];
        
        matriz2[0] = new int[4];
        matriz2[1] = new int[2];
        matriz2[2] = new int[3];
        matriz2[3] = new int[1];
        matriz2[4] = new int[6];
        
        for(int linha = 0; linha < matriz2.length; linha++) {
            for(int coluna = 0; coluna < matriz2[linha].length; coluna++) {
                System.out.print(matriz2[linha][coluna]+ " ");
            }
            System.out.println();
        }
    }
    
}
