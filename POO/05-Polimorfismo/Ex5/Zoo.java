//Bruno Rosa Cappio

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    private List<Animal> animais;

    public Zoo() {
        animais = new ArrayList<>();
    }

    public void cadastrarAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do animal:");
        String nome = scanner.nextLine();
        System.out.println("Digite a espécie do animal:");
        String especie = scanner.nextLine();
        System.out.println("Digite o tipo do animal (Voador, Terrestre ou Aquático):");
        String tipo = scanner.nextLine();
        String caracteristica = "";
        if (tipo.equalsIgnoreCase("Voador")) {
            System.out.println("Digite a cor das penas do animal:");
            caracteristica = scanner.nextLine();
        } else if (tipo.equalsIgnoreCase("Terrestre")) {
            System.out.println("Digite a quantidade de patas do animal:");
            caracteristica = scanner.nextLine();
        } else if (tipo.equalsIgnoreCase("Aquático")) {
            System.out.println("O animal respira fora da água? (Sim ou Não):");
            caracteristica = scanner.nextLine();
        } else {
            System.out.println("Tipo de animal inválido.");
            return;
        }
        System.out.println("Digite o habitat do animal (Jaula, Gaiola, Aquário, Lago ou Viveiro):");
        String habitat = scanner.nextLine();
        System.out.println("Digite a área do habitat:");
        String area = scanner.nextLine();
        Animal animal = new Animal(nome, especie, tipo, caracteristica, habitat + " - Área: " + area);
        animais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Não há animais cadastrados.");
        } else {
            System.out.println("Animais cadastrados no zoológico:");
            for (Animal animal : animais) {
                System.out.println("Nome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                System.out.println("Tipo: " + animal.getTipo());
                System.out.println("Característica: " + animal.getCaracteristica());
                System.out.println("Habitat: " + animal.getHabitat());
                System.out.println();
            }
        }
    }

    public int getQuantidadeAnimais() {
        return animais.size();
    }

    public int getQuantidadeAnimaisPorTipo(String tipo) {
        int quantidade = 0;
        for (Animal animal : animais) {
            if (animal.getTipo().equalsIgnoreCase(tipo)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int getQuantidadeAnimaisPorHabitat(String habitat) {
        int quantidade = 0;
        for (Animal animal : animais) {
            if (animal.getHabitat().toLowerCase().contains(habitat.toLowerCase())) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public String getAreaTotal() {
        double areaTotal = 0;
        for (Animal animal : animais) {
            String areaString = animal.getHabitat().split("Área: ")[1];
            double area = Double.parseDouble(areaString);
            areaTotal += area;
        }
        return String.format("%.2f", areaTotal);
    }
}
