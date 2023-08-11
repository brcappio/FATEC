/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencias;

import java.util.Arrays;

public class Sequencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vet1[]; //os dois funcionam
        int[] vet2, codigos;
        
        codigos = new int[7];
        //codigos <- [0,0,0,0,0,0,0]
        
        System.out.println(Arrays.toString(codigos));
        
        vet1 = new int[5];
        // vet1 <0 [0,0,0,0,0];
        
        for (int x = 0; x < 5; x++) {
            System.out.print(vet1[x] + " ");
        }
        
        vet2 = new int[10];
        //vet2 <- [0,0,0,0,0,0,0,0,0,0]
        
        for (int elemento : vet2) {
            System.out.print( elemento + " ");
        } //imprime o vetor em sequencia, é chamado de for each,
        //só é interessante quando vai passar por todos os elementos do vetor
        
        /*
        for (int x = 1; x < 10; x++) {
            System.out.print("for");
        }
        
        do {
            System.out.print("#");
        } while (true);
        
        while (true) {
            System.out.print(".");
        }*/
        
        
        // TODO code application logic here
    }
    
}
