public class Estudante {
    public String nome;
    public int idade;
    public InfosContato infos;

    public void estudar(){
        System.out.println(nome + " esta estudando!");
    }
    public void mostraInfo(){
        System.out.println(nome + " - " + idade + " anos.");
        System.out.println("Email: " + infos.email);
        System.out.println("Telefone: " + infos.numTelefone);
        System.out.println("Endereco: " + infos.enderecoCasa + "\n");
    }
}
