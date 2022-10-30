package br.inatel.cdg;

public abstract class Funcionario {
    //Atributos
    private String nome;
    private int idade;
    private double salario;

    //metodos

    public void mostraInfos(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario: R$ " + this.salario);
    }

    //Metodos abstratos não tem logica e obrigam a todas as classes filhas e rescreverem essa classe
    public abstract void executaAcao();

    public double salarioBonus(){
        return this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
