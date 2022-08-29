import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Jardim jardim = new Jardim();

        //Entrada dos dados do jardim
        System.out.print("Nome do proprietario: ");
        jardim.nomeDono = sc.nextLine();
        System.out.print("Contato: ");
        jardim.contato = sc.nextLine();
        System.out.print("Endereco: ");
        jardim.endereco = sc.nextLine();

        int op;// opção do usuario

        //MENU
        do {
            System.out.print("""
                    [1] - Adicionar uma arvore\s
                    [2] - Ver arvores que precisam ser replantadas\s
                    [3] - Ver preco medio  \s
                    [4] - Ver informacoes do jardim \s
                    [0] - SAIR
                    """);
            System.out.print("Opcao: ");
            op = sc.nextInt();
            sc.nextLine();
            if (op == 1){
                Arvore a = new Arvore();
                System.out.print("Especie: ");
                a.especie = sc.nextLine();
                System.out.print("Altura: ");
                a.altura = sc.nextFloat();
                System.out.print("Diametro: ");
                a.diametro = sc.nextFloat();
                System.out.print("Preco: ");
                a.preco = sc.nextFloat();
                jardim.addArvore(a);
            } else if (op == 2) {
                jardim.replantar();
            } else if (op == 3) {
                jardim.precoMedio();
            } else if (op == 4) {
                jardim.monstraInfo();
            }
        }while (op != 0);
    }

}
