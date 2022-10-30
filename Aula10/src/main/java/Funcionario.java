public class Funcionario {
    //Atributos
    private String nome;
    private String cpf;
    private int idade;

    //Metodos
    public Funcionario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
}
