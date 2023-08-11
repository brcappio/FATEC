/*
 * 1 - Crie um arquivo chamado AprovadoReprovadoRandom.java. Gere um número aleatório com
valores entre 0 e 10 (inclusos) e atribua a variável nota. O programa deve exibir a mensagem
REPROVADO quando a nota do aluno for menor do que 6
ou APROVADO caso contrário
 */


public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		int nota = (int)(Math.random() * 10);
		System.out.println(nota);
		System.out.println(nota < 6 ? "REPROVADO" : "APROVADO");
	}
}

