import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float num1; //numero 1
        float num2; //numero 2
        float res = 0; //resultado
        int op; //operacao escolhida pelo usuario

        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o 1 numero: ");
        num1 = leitor.nextFloat();
        System.out.println("Entre com o 2 numero: ");
        num2 = leitor.nextFloat();

        System.out.println("Entre com a operacao desejada 1-Soma 2-Subtracao 3-Multiplicacao 4-Divisao 5-Potencia: ");
        op = leitor.nextInt();
        
        if(op == 1){
            res = num1+num2;
        } else if (op == 2) {
            res = num1-num2;
        }else if (op == 3) {
            res = num1*num2;
        }else if (op == 4) {
            res = num1/num2;
        }else if (op == 5) {
            res = (float) Math.pow(num1, num2);
        }

        System.out.println("Resultado: " + res);
    }

}
