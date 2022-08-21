public class Calculadora {
    float valor1;
    float valor2;
    float resultado;

    void soma(){
        resultado=valor1+valor2;
        System.out.println("Resultado: " + resultado);
    }
    void subtracao(){
        resultado=valor1-valor2;
        System.out.println("Resultado: " + resultado);
    }
    void divisao(){
        resultado=valor1/valor2;
        System.out.println("Resultado: " + resultado);
    }
    void multiplicacao(){
        resultado=valor1*valor2;
        System.out.println("Resultado: " + resultado);
    }
    void exponencial(){
        resultado = (float) Math.pow(valor1, valor2);
        System.out.println("Resultado: " + resultado);
    }
}
