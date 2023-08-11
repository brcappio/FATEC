import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    private List<Midia> midiasAlugadas;

    public Aluguel() {
        midiasAlugadas = new ArrayList<>();
    }

    public void alugarMidia(Midia midia) {
        midiasAlugadas.add(midia);
    }

    public void devolverMidia(Midia midia) {
        midiasAlugadas.remove(midia);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Midia midia : midiasAlugadas) {
            valorTotal += midia.getValor();
        }
        return valorTotal;
    }

    public List<Midia> getMidiasAlugadas() {
        return midiasAlugadas;
    }
}
