//Bruno Rosa Cappio

import java.util.Scanner;

public class ZooMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();

        int opcao = 0;
        while (opcao != 7) {
            exibirMenu();
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    zoo.cadastrarAnimal();
                    break;
                case 2:
                    zoo.listarAnimais();
                    break;
                case 3:
                    System.out.println("Quantidade de animais no zoológico: " + zoo.getQuantidadeAnimais());
                    break;
                case 4:
                    System.out.println("Quantidade de animais voadores: " + zoo.getQuantidadeAnimaisPorTipo("Voador"));
                    System.out.println("Quantidade de animais terrestres: " + zoo.getQuantidadeAnimaisPorTipo("Terrestre"));
                    System.out.println("Quantidade de animais aquáticos: " + zoo.getQuantidadeAnimaisPorTipo("Aquático"));
                    break;
                case 5:
                    System.out.println("Digite o tipo de habitat (Jaula, Gaiola, Aquário, Lago ou Viveiro):");
                    String habitat = scanner.nextLine();
                    System.out.println("Quantidade de animais no habitat " + habitat + ": " + zoo.getQuantidadeAnimaisPorHabitat(habitat));
                    break;
                case 6:
                    System.out.println("Área total ocupada pelos animais: " + zoo.getAreaTotal() + " metros quadrados");
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Cadastrar animais");
        System.out.println("2. Listar animais");
        System.out.println("3. Quantidade de animais no Zoo");
        System.out.println("4. Quantidade de animais por tipo (Voador, Terrestre e Aquático)");
        System.out.println("5. Quantidade de animais por tipo de habitat");
        System.out.println("6. Área total que os animais ocupam");
        System.out.println("7. Sair");
        System.out.println("Digite a opção desejada:");
    }
}
