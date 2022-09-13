import java.util.SortedMap;

public class Conta {
    private double saldo;
    private static int qntClientes;

    Cliente cliente;

    public Conta(Cliente cliente) {
        this.saldo = 0;
        this.cliente = cliente;
        qntClientes = Cliente.getCont();
    }

    public void deposita(double valor){
        this.saldo += valor;
    }
    public void saca(double valor){
        this.saldo -= valor;
    }
    public void extrato(){
        System.out.println("-----------Extrato-----------");
        System.out.println("Cliente " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("-----------------------------");
    }
}
