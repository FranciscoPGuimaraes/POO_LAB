package br.inatel;

public class Match extends Carro{
    private int portas;

    //Construtor
    public Match(double valor, String cor, int ano, int portas) {
        this.setAno(ano);
        this.setCor(cor);
        this.setValor(valor);
        this.portas = portas;
    }

    //Reescrita dos metodos de Controle
    @Override
    public void taxa() {
        System.out.println("Taxa Match: R$120/dia");
    }

    @Override
    public void mostraInfos() {
        System.out.println("---INFOS Matc---");
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " +getAno());
        System.out.println("Valor: " + getValor());
        System.out.println();
    }
}
