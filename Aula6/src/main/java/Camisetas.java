public class Camisetas  extends  Produto{
    //Atributos
    private String cor;
    private String tamanho;

    //Construtor
    public Camisetas(double preco, String nome, String cor, String tamanho) {
        super(preco, nome);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    //Sobrescrevendo o metodo para mostrar a etiqueta do produto
    @Override
    public void etiquetaPreco(){
        super.etiquetaPreco();
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println(" ");
    }
}
