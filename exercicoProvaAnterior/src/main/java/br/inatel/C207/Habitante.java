package br.inatel.C207;

public abstract class Habitante {
    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;

    protected Arma arma;

    public Habitante(String nome, int idade, float energia, Arma arma) {
        contador++;
        this.id = contador;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        this.arma = arma;
    }

    public void atacar(){
        if(arma.isMagica()){
            this.energia -= 20;
        }else {
            this.energia -= 10;
        }
        System.out.println(this.nome+" atacou com " + arma.getNomeArma()+"!");
    }

    public void mostraInfo(){
        System.out.println("----"+this.nome.toUpperCase()+"----");
        System.out.println("ID: " + this.id);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energia);
    }
}
