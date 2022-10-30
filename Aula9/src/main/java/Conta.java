public class Conta implements Comparable<Conta>{
    private String nome;
    private float saldo;

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public Conta(String nome, float saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Conta c) {
        return this.nome.compareTo(c.getNome());
    }
}
