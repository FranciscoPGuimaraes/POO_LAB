public class Produto {
    //Atributos
    private double preco;
    private String nome;

    //Construtor
    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    //Metodos
    public void etiquetaPreco(){ // Metodo para mostrar a etiqueta dos produtos
        System.out.println("Produto: " + this.nome);
        System.out.println("Preco: " + this.preco);
    }

}
