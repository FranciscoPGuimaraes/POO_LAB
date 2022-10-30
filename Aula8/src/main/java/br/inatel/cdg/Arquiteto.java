package br.inatel.cdg;

public class Arquiteto extends Funcionario implements GerenciarProjetos{

    private String especialidade;

    @Override
    public void mostraInfos(){
        System.out.println("Informacoes do arquiteto");
        super.mostraInfos();
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println();
    }

    @Override
    public void executaAcao(){
        System.out.println(this.getNome() + " está trabalhando");
    }

    @Override
    public double salarioBonus(){
        return this.getSalario()+700;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void gerenciar() {
        System.out.println(getNome() + "está gerenciado um projeto!");
    }
}
