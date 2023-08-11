//Bruno Rosa Capppio

import java.util.Scanner;

public class AplicativoFloresta {
    public static void main(String[] args) {
        Floresta floresta = new Floresta();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Sistema de Gerenciamento de Floresta ----");
            System.out.println("1. Adicionar Planta");
            System.out.println("2. Listar Plantas");
            System.out.println("3. Mostrar Total de Plantas");
            System.out.println("4. Mostrar Total de Árvores");
            System.out.println("5. Mostrar Total de Flores");
            System.out.println("6. Mostrar Total de Plantas Carnívoras");
            System.out.println("0. Sair");
            System.out.print("Digite sua escolha: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir o caractere de nova linha

            switch (escolha) {
                case 0:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                case 1:
                    System.out.print("Digite o nome da planta: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a espécie da planta: ");
                    String especie = scanner.nextLine();
                    System.out.print("Selecione o tipo da planta (1 - Árvore, 2 - Flor, 3 - Carnívora): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir o caractere de nova linha

                    switch (tipo) {
                        case 1:
                            System.out.print("A árvore é frutífera? (true/false): ");
                            boolean frutifera = scanner.nextBoolean();
                            Arvore arvore = new Arvore(nome, especie, frutifera);
                            floresta.adicionarPlanta(arvore);
                            System.out.println("Árvore adicionada com sucesso!");
                            break;
                        case 2:
                            System.out.print("Digite a cor da flor: ");
                            String cor = scanner.nextLine();
                            Flor flor = new Flor(nome, especie, cor);
                            floresta.adicionarPlanta(flor);
                            System.out.println("Flor adicionada com sucesso!");
                            break;
                        case 3:
                            System.out.print("A planta carnívora é venenosa? (true/false): ");
                            boolean venenosa = scanner.nextBoolean();
                            Carnivora carnivora = new Carnivora(nome, especie, venenosa);
                            floresta.adicionarPlanta(carnivora);
                            System.out.println("Planta carnívora adicionada com sucesso!");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    floresta.listarPlantas();
                    break;
                case 3:
                    System.out.println("Total de plantas na floresta: " + floresta.getTotalPlantas());
                    break;
                case 4:
                    System.out.println("Total de árvores na floresta: " + floresta.getTotalArvores());
                    break;
                case 5:
                    System.out.println("Total de flores na floresta: " + floresta.getTotalFlores());
                    break;
                case 6:
                    System.out.println("Total de plantas carnívoras na floresta: " + floresta.getTotalCarnivoras());
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
