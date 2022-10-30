package br.inatel.cdg;

public class Engenheiro extends Funcionario implements GerenciarProjetos{

    private String ramo;

    @Override
    public void mostraInfos(){
        System.out.println("Informacoes do arquiteto");
        super.mostraInfos();
        System.out.println("Ramo: " + this.ramo);
        System.out.println();
    }

    @Override
    public void executaAcao(){
        System.out.println(this.getNome() + " está programando");
    }

    @Override
    public double salarioBonus(){
        return this.getSalario()+700;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void gerenciar() {
        System.out.println(getNome() + "está gerenciado um projeto!");
    }
}
