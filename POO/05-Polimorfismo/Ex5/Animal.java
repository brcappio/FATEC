//Bruno Rosa Cappio

public class Animal {
    private String nome;
    private String especie;
    private String tipo;
    private String caracteristica;
    private String habitat;

    public Animal(String nome, String especie, String tipo, String caracteristica, String habitat) {
        this.nome = nome;
        this.especie = especie;
        this.tipo = tipo;
        this.caracteristica = caracteristica;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public String getHabitat() {
        return habitat;
    }
}
