/*
 * 23) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em
Java para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
a) Média de salário da população;
b) Média do número de filhos;
c) Maior salário dos habitantes;
d) Percentual de pessoas com salário menor que R$ 150,00
 */
package ex23;

import java.util.Scanner;

public class Ex23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int salario = 1;
        int maiorSalario = 0;
        int filhos = 0;
        int somaSalario = 0;
        int contador = 0;
        int contadorMenor150 = 0;
        int somaFilhos = 0;
        do {
            System.out.print("Digite o salario: ");
            salario = leia.nextInt();
            
            if (salario < 0) {
                break;
            }
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario < 150) {
                contadorMenor150++;
            }
            somaSalario += salario;
            
            System.out.print("Digite o numero de filhos: ");
            filhos = leia.nextInt();
            somaFilhos += filhos;
            
            contador++;
        } while (salario > 0);
        
        int mediaSalario = somaSalario / contador;
        int mediaFilhos =  somaFilhos / contador;
        double percentual = ((double)contadorMenor150 / (double)contador) / 100;
        System.out.println("\na) Média de salário da população: " + mediaSalario);
        System.out.println("b) Média do número de filhos: " + mediaFilhos);
        System.out.println("c) Maior salário dos habitantes: " + maiorSalario);
        System.out.println("d) Percentual de pessoas com salário menor que R$ 150,00: " + percentual);
        
    }
    
}
