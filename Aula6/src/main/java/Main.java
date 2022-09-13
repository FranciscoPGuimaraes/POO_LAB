public class Main {
    public static void main(String[] args) {
        //Criando os produtos
        Notebook notebook = new Notebook(2000, "Acer Notebook", 256, "Nvidia GTX 1080ti", "AMD Ryzen 5 4600g");
        Camisetas camiseta = new Camisetas(120, "Polo T-shirt","Rosa", "G");

        //Chamando o metodo de etiqueta
        notebook.etiquetaPreco();
        camiseta.etiquetaPreco();
    }
}
