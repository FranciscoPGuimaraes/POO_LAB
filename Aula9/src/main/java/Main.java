import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Declaração de uma ArrayList
        ArrayList lista = new ArrayList();
        ArrayList <Integer> listaInteiros = new ArrayList<>(); //Lista de inteiros
        ArrayList <Conta> contas = new ArrayList<>();

        //Criando uma conta
        Conta conta = new Conta("Bolsonaro", 22);
        Conta conta1 = new Conta("Nikolas", 2222);
        Conta conta2 = new Conta("Bruno", 22222);

        //Colocando itens no arrayList
        lista.add(200); //INTEIRO
        lista.add("Cleiton"); //STRING
        lista.add(conta); //CONTA

        //Mostrando Itens
        for (int i = 0; i < lista.size(); i++) {
           //System.out.println(lista.get(i));
        }

        //Removendo itens
        lista.remove(conta); // Removendo o iten CONTA
        lista.remove(1); //Removendo o iten na pos 1

        //Add itens no array de inteiros
        listaInteiros.add(25);
        listaInteiros.add(54);
        listaInteiros.add(45);

        for (int i = 0; i < listaInteiros.size(); i++) {
            //System.out.println(listaInteiros.get(i));
        }

        //Ordenar a lista
        Collections.sort(listaInteiros);

        for (int i = 0; i < listaInteiros.size(); i++) {
            //System.out.println(listaInteiros.get(i));
        }

        //Ordenar a lista
        Collections.reverse(listaInteiros);

        for (int i = 0; i < listaInteiros.size(); i++) {
            //System.out.println(listaInteiros.get(i));
        }

        //Colocando itens no Array de Contas
        contas.add(conta);
        contas.add(conta1);
        contas.add(conta2);

        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Dono: " + contas.get(i).getNome());
            System.out.println("Saldo: R$ " + contas.get(i).getSaldo());
            System.out.println(" ");
        }

        //Ordenando as contasa
        Collections.sort(contas);

        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Dono: " + contas.get(i).getNome());
            System.out.println("Saldo: R$ " + contas.get(i).getSaldo());
            System.out.println(" ");
        }
    }
}
