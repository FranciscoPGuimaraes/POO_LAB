package br.inatel.C207;

public class Anao extends Habitante implements Mineracao{
    private final float altura;
    private final String reino;

    public Anao(String nome, int idade, float energia, float altura, String reino, Arma arma) {
        super(nome, idade, energia, arma);
        this.altura = altura;
        this.reino = reino;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Altura: " + this.altura + "cm");
        System.out.println("Reino: " + this.reino);

    }

    @Override
    public void minerar() {
        System.out.println("O anao " + this.nome + " esta minarando!");
    }
}
