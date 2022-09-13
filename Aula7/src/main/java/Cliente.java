public class Cliente {
    private String nome;
    private int id;
    private static int cont = 1;

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public static int getCont() {
        return cont;
    }

    public Cliente(String nome) {
        this.nome = nome;
        this.id = cont;
        cont++;
    }


}
