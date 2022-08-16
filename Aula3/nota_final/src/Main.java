import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float NP1;
        float NP2;
        int NPF;

        Scanner leitor = new Scanner(System.in);
        System.out.println("NP1: ");
        NP1 = leitor.nextFloat();
        System.out.println("NP2: ");
        NP2 = leitor.nextFloat();
        NPF =  (int) ((NP1+NP2)/2);

        System.out.println("NPF: "+ NPF);
    }
}
