package modelo;

public abstract class Arma {
    private int dano;
    public String nome;

    public Arma (String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }


}

