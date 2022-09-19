package br.inatel.C207;

public class Elfo extends Habitante implements Cura{

    private final String tribo;

    public Elfo(String nome, int idade, float energia, String tribo, Arma arma) {
        super(nome, idade, energia, arma);
        this.tribo = tribo;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo: " + this.tribo);

    }

    public void viajar(){
        System.out.println(this.nome + " esta viajando!");
    }

    @Override
    public void curar() {
        this.energia += 15;
        System.out.println(this.nome + " foi curado com +20 de energia!");
    }
}
