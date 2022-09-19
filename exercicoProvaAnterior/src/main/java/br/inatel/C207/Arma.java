package br.inatel.C207;

public class Arma {
    private final String nomeArma;
    private final boolean magica;

    public Arma(String nomeArma, boolean magica) {
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public boolean isMagica() {
        return magica;
    }
}
