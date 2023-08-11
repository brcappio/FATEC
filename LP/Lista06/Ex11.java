/* Bruno Rosa Cappio
 * 11
) Escreva um programa em Java para ler o número de alunos existentes em uma turma e, após isto, ler as
notas destes alunos, calcular e escrever a média aritmética dessas notas lidas.
 * 
 * 
 */


import java.util.Scanner;

public class Ex11 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos na turma: ");
		int qtdAlunos = leia.nextInt();
		int nota = 0;
		int total = 0;
		for (int i = 1; i <= qtdAlunos; i++){
			System.out.print("Digite a nota do " + i + "° aluno: ");
			nota = leia.nextInt();
			total += nota;
		}
		System.out.println("\nMedia aritmetica: " + (total/qtdAlunos));
	}
}
