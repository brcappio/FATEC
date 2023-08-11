//Bruno Rosa Cappio

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colegio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantidade de salas: ");
        int quantidadeSalas = leia.nextInt();
        leia.nextLine(); // Limpar o buffer

        List<Sala> salas = new ArrayList<>();

        for (int i = 1; i <= quantidadeSalas; i++) {
            System.out.print("Nome da sala " + i + ": ");
            String nomeSala = leia.nextLine();

            Sala sala = new Sala(nomeSala);

            System.out.print("Quantidade de alunos na sala " + i + ": ");
            int quantidadeAlunos = leia.nextInt();
            leia.nextLine(); // Limpar o buffer

            for (int j = 1; j <= quantidadeAlunos; j++) {
                System.out.println("Aluno " + j + ":");
                System.out.print("Nome: ");
                String nomeAluno = leia.nextLine();

                System.out.print("Idade: ");
                int idadeAluno = leia.nextInt();
                leia.nextLine(); // Limpar o buffer

                System.out.print("Curso (1-Fundamental, 2-Médio, 3-Infantil): ");
                int opcaoCurso = leia.nextInt();
                leia.nextLine(); // Limpar o buffer

                String cursoAluno;

                switch (opcaoCurso) {
                    case 1:
                        cursoAluno = "Fundamental";
                        break;
                    case 2:
                        cursoAluno = "Médio";
                        break;
                    case 3:
                        cursoAluno = "Infantil";
                        break;
                    default:
                        cursoAluno = "Curso Inválido";
                        break;
                }

                System.out.print("Mensalidade: ");
                double mensalidadeAluno = leia.nextDouble();
                leia.nextLine(); // Limpar o buffer

                Aluno aluno = new Aluno(nomeAluno, idadeAluno, cursoAluno, mensalidadeAluno);
                sala.adicionarPessoa(aluno);
            }

            System.out.println("Professor:");
            System.out.print("Nome: ");
            String nomeProfessor = leia.nextLine();

            System.out.print("Idade: ");
            int idadeProfessor = leia.nextInt();
            leia.nextLine(); // Limpar o buffer

            System.out.print("Salário: ");
            double salarioProfessor = leia.nextDouble();
            leia.nextLine(); // Limpar o buffer
            
            System.out.print("Disciplina: ");
			String disciplina = leia.nextLine();

            Professor professor = new Professor(nomeProfessor, idadeProfessor, salarioProfessor, disciplina);
            sala.adicionarPessoa(professor);

            salas.add(sala);
        }

        System.out.println("\n--- Relatório de Salas ---");
        for (Sala sala : salas) {
            System.out.println(sala);
        }
    }
}
