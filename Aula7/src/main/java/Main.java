import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---BANCO CENTRAL---");

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Criando o cliente e a conta
        String nome;
        System.out.print("Insira seu nome: ");
        nome = sc.nextLine();
        Cliente cliente = new Cliente(nome);
        Conta conta = new Conta(cliente);

        //Menu
        int op;
        int continuar = 1;
        do{
            System.out.println("[1] Depositar valor ");
            System.out.println("[2] Sacar valor ");
            System.out.println("[3] Ver extrato ");
            System.out.print("Opcao: ");
            op = sc.nextInt();

            if(op == 1) {
                System.out.print("Valor: R$");
                double valor = sc.nextDouble();
                conta.deposita(valor);
            } else if (op == 2) {
                System.out.print("Valor: R$");
                double valor = sc.nextDouble();
                conta.saca(valor);
            }else if (op == 3) conta.extrato();

            System.out.print("Deseja fazer outra operacao? [1] sim [0] nao: ");
            continuar = sc.nextInt();
            System.out.println(" ");
        }while(continuar != 0);
        System.out.println("Obrigado pela preferencia!!!");
    }
}
