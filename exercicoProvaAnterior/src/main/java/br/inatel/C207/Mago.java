package br.inatel.C207;

public class Mago extends Habitante implements Feitico{
    private final String cor;

    public Mago(String nome, int idade, float energia, String cor, Arma arma) {
        super(nome, idade, energia, arma);
        this.cor = cor;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: " + this.cor);

    }

    @Override
    public void lancaFeitico() {
        energia -= 20;
        System.out.println("O mago " + this.nome + " lancou um feitico!");
    }
}
