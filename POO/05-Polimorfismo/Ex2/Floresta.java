//Bruno Rosa Capppio

import java.util.ArrayList;
import java.util.List;

public class Floresta {
    private List<Planta> plantas;

    public Floresta() {
        plantas = new ArrayList<>();
    }

    public void adicionarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void listarPlantas() {
        System.out.println("Plantas na floresta:");
        for (Planta planta : plantas) {
            System.out.println("Nome: " + planta.getNome() + ", Espécie: " + planta.getEspecie());
        }
    }

    public int getTotalPlantas() {
        return plantas.size();
    }

    public int getTotalArvores() {
        int count = 0;
        for (Planta planta : plantas) {
            if (planta instanceof Arvore) {
                count++;
            }
        }
        return count;
    }

    public int getTotalFlores() {
        int count = 0;
        for (Planta planta : plantas) {
            if (planta instanceof Flor) {
                count++;
            }
        }
        return count;
    }

    public int getTotalCarnivoras() {
        int count = 0;
        for (Planta planta : plantas) {
            if (planta instanceof Carnivora) {
                count++;
            }
        }
        return count;
    }
}
