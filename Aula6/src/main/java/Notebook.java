public class Notebook extends Produto{
    //Atributos
    private double armazenamento;
    private String gpu;
    private String processador;

    //Construtor
    public Notebook(double preco, String nome, double armazenamento, String gpu, String processador) {
        super(preco, nome);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }

    //Sobrescrevendo o metodo para mostrar a etiqueta do produto
    @Override
    public void etiquetaPreco(){
        super.etiquetaPreco();
        System.out.println("Armazenamento: " + this.armazenamento);
        System.out.println("GPU: " + this.gpu);
        System.out.println("Processador: " + this.processador);
        System.out.println("");
    }

}
