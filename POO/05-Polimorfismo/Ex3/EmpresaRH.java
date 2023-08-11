//Bruno Rosa Cappio

import java.util.Scanner;

public class EmpresaRH {
    private Candidato[] candidatos;
    private Vaga[] vagas;
    private int numCandidatos;
    private int numVagas;
    private CandidatoVaga[] candidatosPorVaga;
    private int numCandidatosPorVaga;

    public EmpresaRH(int maxCandidatos, int maxVagas) {
        candidatos = new Candidato[maxCandidatos];
        vagas = new Vaga[maxVagas];
        numCandidatos = 0;
        numVagas = 0;
        candidatosPorVaga = new CandidatoVaga[maxCandidatos * maxVagas];
        numCandidatosPorVaga = 0;
    }

    public void cadastrarCandidato() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do candidato: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do candidato: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tipo de candidato:");
        System.out.println("1 - Desempregado");
        System.out.println("2 - Empregado");
        int tipoCandidato = scanner.nextInt();
        scanner.nextLine();

        if (tipoCandidato == 1) {
            System.out.print("Meses desempregado: ");
            int mesesDesempregado = scanner.nextInt();
            scanner.nextLine();

            Desempregado desempregado = new Desempregado(nome, idade, mesesDesempregado);
            candidatos[numCandidatos] = desempregado;
            numCandidatos++;
        } else if (tipoCandidato == 2) {
            System.out.print("Nome da empresa atual: ");
            String nomeEmpresa = scanner.nextLine();

            Empregado empregado = new Empregado(nome, idade, nomeEmpresa);
            candidatos[numCandidatos] = empregado;
            numCandidatos++;
        } else {
            System.out.println("Tipo de candidato inválido.");
        }
    }

    public void cadastrarVaga() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Descrição da vaga: ");
        String descricao = scanner.nextLine();

        System.out.print("Salário oferecido: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Tipo de vaga:");
        System.out.println("1 - Estágio");
        System.out.println("2 - Contrato");
        int tipoVaga = scanner.nextInt();
        scanner.nextLine();

        if (tipoVaga == 1) {
            System.out.print("Duração do estágio em meses: ");
            int mesesDuracao = scanner.nextInt();
            scanner.nextLine();

            Estagio estagio = new Estagio(descricao, salario, mesesDuracao);
            vagas[numVagas] = estagio;
            numVagas++;
        } else if (tipoVaga == 2) {
            System.out.print("A vaga é temporária? (true/false): ");
            boolean temporario = scanner.nextBoolean();
            scanner.nextLine();

            Contrato contrato = new Contrato(descricao, salario, temporario);
            vagas[numVagas] = contrato;
            numVagas++;
        } else {
            System.out.println("Tipo de vaga inválido.");
        }
    }

    public void cadastrarCandidatoVaga() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Índice do candidato: ");
        int indiceCandidato = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Índice da vaga: ");
        int indiceVaga = scanner.nextInt();
        scanner.nextLine();

        if (indiceCandidato >= 0 && indiceCandidato < numCandidatos && indiceVaga >= 0 && indiceVaga < numVagas) {
            Candidato candidato = candidatos[indiceCandidato];
            Vaga vaga = vagas[indiceVaga];

            CandidatoVaga candidatoVaga = new CandidatoVaga(candidato, vaga);
            candidatosPorVaga[numCandidatosPorVaga] = candidatoVaga;
            numCandidatosPorVaga++;
        } else {
            System.out.println("Índice de candidato ou vaga inválido.");
        }
    }

    public void listarVagasPorTipo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipo de vaga:");
        System.out.println("1 - Estágio");
        System.out.println("2 - Contrato");
        int tipoVaga = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Vagas do tipo selecionado:");
        for (int i = 0; i < numVagas; i++) {
            Vaga vaga = vagas[i];
            if ((vaga instanceof Estagio) && (tipoVaga == 1)) {
                System.out.println("Vaga " + (i + 1) + ": " + vaga.getDescricao());
            } else if ((vaga instanceof Contrato) && (tipoVaga == 2)) {
                System.out.println("Vaga " + (i + 1) + ": " + vaga.getDescricao());
            }
        }
    }

    public void mostrarQuantidadeCandidatos() {
        System.out.println("Quantidade de candidatos: " + numCandidatos);
        System.out.println("Quantidade de vagas: " + numVagas);
        System.out.println("Quantidade de candidatos por vaga: " + numCandidatosPorVaga);
    }

    public void mostrarCandidatosVaga() {
        for (int i = 0; i < numCandidatosPorVaga; i++) {
            CandidatoVaga candidatoVaga = candidatosPorVaga[i];
            Candidato candidato = candidatoVaga.getCandidato();
            Vaga vaga = candidatoVaga.getVaga();
            System.out.println("Candidato: " + candidato.getNome() + " - Vaga: " + vaga.getDescricao());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpresaRH empresaRH = new EmpresaRH(100, 100);

        boolean sair = false;

        while (!sair) {
            System.out.println("----- MENU -----");
            System.out.println("1 - Cadastrar candidato");
            System.out.println("2 - Cadastrar vaga");
            System.out.println("3 - Cadastrar candidato x vaga");
            System.out.println("4 - Listar vagas por tipo");
            System.out.println("5 - Mostrar quantidade de candidatos e vagas");
            System.out.println("6 - Mostrar candidatos x vaga");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    empresaRH.cadastrarCandidato();
                    break;
                case 2:
                    empresaRH.cadastrarVaga();
                    break;
                case 3:
                    empresaRH.cadastrarCandidatoVaga();
                    break;
                case 4:
                    empresaRH.listarVagasPorTipo();
                    break;
                case 5:
                    empresaRH.mostrarQuantidadeCandidatos();
                    break;
                case 6:
                    empresaRH.mostrarCandidatosVaga();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        }
    }
}
