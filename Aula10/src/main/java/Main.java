import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //Criando classes
        Arquivo arquivo = new Arquivo();
        Funcionario funcionario = new Funcionario("Francisco", "1594876", 18);
        Funcionario funcionario2 = new Funcionario("Cleiton", "9874984", 14);

        //chamando metodo escrever
        arquivo.escrever(funcionario);
        arquivo.escrever(funcionario2);

        //Criando ArryList para ler funcionarios
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios = arquivo.ler();

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("CPF: " + f.getCpf());
            System.out.println("Idade: " + f.getIdade());
        }
        */

        //Instanciando os objetos
        Arquivo arquivo = new Arquivo();
        Funcionario funcionario;
        Scanner sc = new Scanner(System.in);

        //flag de controle
        boolean flag = true;

        while (flag){
            System.out.println("\n-------------------------------");
            System.out.println("BEM VINDO AO MENU");
            System.out.println("1- Cadastrar funcionarios");
            System.out.println("2- Listar funcionarios");
            System.out.println("3- Sair");
            System.out.print("Opcao: ");
            int op = sc.nextInt();
            sc.nextLine();
            if (op == 1){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("CPF: ");
                String cpf = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                funcionario = new Funcionario(nome, cpf, idade);

                arquivo.escrever(funcionario);
            }else if(op == 2){
                ArrayList<Funcionario> funcionariosAL = new ArrayList<>();
                funcionariosAL = arquivo.ler();

                for (Funcionario f : funcionariosAL) {
                    System.out.println("\n-- Funcionario --");
                    System.out.println("Nome: " + f.getNome());
                    System.out.println("CPF: " + f.getCpf());
                    System.out.println("Idade: " + f.getIdade());
                }
            } else if (op == 3) {
                flag = false;
            }
        }
    }
}
