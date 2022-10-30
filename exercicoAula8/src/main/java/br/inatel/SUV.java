package br.inatel;

public class SUV extends Carro{
    private String  tracao;

    public String getTracao() {
        return tracao;
    }

    //Construtor
    public SUV(double valor, String cor, int ano, String tracao) {
        this.setAno(ano);
        this.setCor(cor);
        this.setValor(valor);
        this.tracao = tracao;
    }

    //Reescrita dos metodos de Controle
    @Override
    public void taxa() {
        System.out.println("Taxa SUV: R$120/dia");
    }

    @Override
    public void mostraInfos() {
        System.out.println("---INFOS SUV---");
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " +getAno());
        System.out.println("Valor: " + getValor());
        System.out.println("Tracao: " + getTracao());
    }
}
