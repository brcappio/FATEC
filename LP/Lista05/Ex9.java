/* Bruno Rosa Cappio
 * 9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
de 50%.
Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o
salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 */

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o numero de horas trabalhadas no mes: ");
        double horasTrabalhadas = leia.nextDouble();
        System.out.print("Digite o salario por hora: ");
        double salarioHora = leia.nextDouble();        
        double salarioFinal = horasTrabalhadas * salarioHora;
        if (horasTrabalhadas > 40) {
            double horasExtra = salarioHora * 0.5;
            salarioFinal += horasExtra;
        }
        
        System.out.println("O salario final eh: " + salarioFinal);
    }
    
}
