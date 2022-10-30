package br.inatel.cdg;

public class Professor extends Funcionario implements Lecionar{
    private String materia;

    public void corrigirProvas(){
        System.out.println(this.getNome() + " está corrigindo a prova de " + this.materia);
    }

    @Override
    public void mostraInfos(){
        System.out.println("Informacoes do arquiteto");
        super.mostraInfos();
        System.out.println("Materia: " + this.materia);
        System.out.println();
    }

    @Override
    public void executaAcao(){
        System.out.println(this.getNome() + " está dando aula de " + this.materia);
    }

    @Override
    public double salarioBonus(){
        return this.getSalario();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void lecionar() {
        System.out.println(getNome() + " está lecionando " + getMateria());
    }
}
