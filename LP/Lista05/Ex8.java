/* Bruno Rosa Cappio
 * 8) Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
iniciar em um dia e terminar no dia seguinte.
 */


import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a hora do inicio: ");
        int inicio = leia.nextInt();
        System.out.print("Digite a hora do fim do jogo: ");
        int fim = leia.nextInt();
        int duracao = fim - inicio;
        System.out.println(duracao <= 24 ? "Duracao do jogo: " + duracao + " horas" : "Duracao maxima: 24hrs");
    }
    
}
