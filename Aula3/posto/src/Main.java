import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String combustivel;
        char comb;
        float litros;
        float preco = 0;
        float desconto;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Combustivel: ");
        combustivel = leitor.nextLine();
        combustivel = combustivel.toLowerCase();
        comb = combustivel.charAt(0);
        System.out.println("Litros: ");
        litros = leitor.nextFloat();

        if(comb == 'g'){
            if (litros <= 20){
                desconto = (float) (6*0.04);
                preco = (litros*6)-(litros*desconto);
            } else if (litros > 20) {
                desconto = (float) (6*0.06);
                preco = (litros*6)-(litros*desconto);
            }
        } else if (comb == 'a') {
            if (litros <= 20){
                desconto = (float) (4.9*0.03);
                preco = (float) ((litros*4.9)-(litros*desconto));
            } else if (litros > 20) {
                desconto = (float) (4.9*0.05);
                preco = (float) ((litros*4.9)-(litros*desconto));
            }
        }
        System.out.println("Preco: "+ preco);
    }

}
