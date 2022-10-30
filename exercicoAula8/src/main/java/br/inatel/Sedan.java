package br.inatel;

public class Sedan extends Carro{
    private int portaMalas;

    public int getPortaMalas() {
        return portaMalas;
    }

    //Construtor
    public Sedan(double valor, String cor, int ano, int portaMalas) {
        this.setAno(ano);
        this.setCor(cor);
        this.setValor(valor);
        this.portaMalas = portaMalas;
    }

    //Reescrita dos metodos de Controle
    @Override
    public void taxa() {
        System.out.println("Taxa Sedan: R$120/dia");
    }

    @Override
    public void mostraInfos() {
        System.out.println("---INFOS Sedan---");
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " +getAno());
        System.out.println("Valor: " + getValor());
        System.out.println("Porta malas: " + getPortaMalas() + "cm");
    }
}
