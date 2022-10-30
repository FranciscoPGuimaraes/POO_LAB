package br.inatel;

public abstract class Carro implements Controle{

    //Atributos
    private double valor;
    private String cor;
    private int ano;


    //Get e Set
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
