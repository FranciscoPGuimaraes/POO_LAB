import br.inatel.C207.*;

public class Main {
    public static void main(String[] args) {
        //Criando a terra media
        TerraMedia terraMedia = new TerraMedia();

        //Criando armas
        Arma machado = new Arma("machado", false);
        Arma varinha = new Arma("varinha", true);
        Arma cajado = new Arma("cajado", true);

        //Adicionando habitantes
        Anao anao = new Anao("Lucio", 23, 40, 100, "Topo da montanha", machado);
        Elfo elfo = new Elfo("George", 400, 50, "Eden", varinha);
        Mago mago = new Mago("Galdaf", 210, 80, "Roxo", cajado);
        terraMedia.addHabitante(anao);
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(mago);

        terraMedia.listarHabitantes();
    }
}
