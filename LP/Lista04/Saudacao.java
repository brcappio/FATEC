/*
 * 7 - Crie um arquivo chamado Saudacao.java. Implemente um programa em Java que declare uma
variável chamada hora. Essa variável deve armazenara hora do dia.
Esse programa deve exibir a mensagem Zzzzz se a hora estiver no intervalo [0, 6], 
Bom dia se a hora estiver no intervalo [7, 11],
Boa tarde se a hora estiver no intervalo [12, 17] ou 
Boa noite se a hora estiver no intervalo [18, 23].

Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre
fazendo todas as validações necessárias.
*/

import java.util.Scanner;
import java.util.Random;

public class Saudacao {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Você deseja informar a hora manualmente ou aleatoriamente?");
        System.out.print("\nDigite 1 para manualmente\n2 para aleatoriamente: ");
        int escolha = leia.nextInt();
        int hora;
        
        switch(escolha) {
            case 1: 
                System.out.print("Por favor informe que horas sao (de 0 a 23): ");
                hora = leia.nextInt();
                System.out.println(hora >= 0 && hora <= 23 ? hora >= 7 && hora <= 11? "Bom dia" : hora >=12 && hora <=17 ? "Boa tarde" : hora >= 18 && hora <= 23 ? "Boa noite" : "Zzzzz" : "Valor invalido!");
                break;
            case 2: 
                Random aleatorio = new Random();
                hora = aleatorio.nextInt(23);
                System.out.println("Hora gerada: " + hora);
                System.out.println(hora >= 0 && hora <= 23 ? hora >= 7 && hora <= 11? "Bom dia" : hora >=12 && hora <=17 ? "Boa tarde" : hora >= 18 && hora <= 23 ? "Boa noite" : "Zzzzz" : "Valor invalido!");
                break;
        }
        
        System.out.println();
        
    }
    
}
