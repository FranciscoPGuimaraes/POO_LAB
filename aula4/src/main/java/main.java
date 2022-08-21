import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // ---------------------------------------Exercicio 1------------------------------------------------
        //Criando objeto CALCULADORA

        Calculadora cal = new Calculadora();

        float num1 = 2;
        float num2 = 3;

        //Atribuindo os valores ao objeto
        cal.valor1 = num1;
        cal.valor2 = num2;

        //Chamando os metodos (operações)
        cal.soma();
        cal.divisao();
        cal.subtracao();
        cal.multiplicacao();
        cal.exponencial();

        // ---------------------------------------Exercicio 2------------------------------------------------

        Carro car1 = new Carro();
        car1.marca = "Ford";
        car1.modelo = "Mustang";
        car1.cor = "Azul";
        car1.velocidadeMax = 310;
        car1.velocidadeAtual = 150;
        car1.motor.potencia = 300;
        car1.motor.tipo = "V8";


        Carro car2 = new Carro();
        car2.marca = "Chevrolet";
        car2.modelo = "Camaro";
        car2.cor = "Amarelo";
        car2.velocidadeMax = 300;
        car2.velocidadeAtual = 160;
        car2.motor.potencia = 300;
        car2.motor.tipo = "V8";

        car1.mostraInfo();
        car2.mostraInfo();
        car1.ligar();
        car1.acelerar();
        car2.ligar();
        car2.acelerar();


        // ---------------------------------------Exercicio 3------------------------------------------------

        Estudante e1 = new Estudante();
        e1.nome = "Francisco";
        e1.idade = 18;
        InfosContato info1 = new InfosContato();
        info1.enderecoCasa = "Rua Aguas, 567 - Muarama - Passos MG";
        info1.email = "francisco@gmail.com";
        info1.numTelefone = 55566753;
        e1.infos = info1;

        Estudante e2 = new Estudante();
        e2.nome = "Cleber";
        e2.idade = 23;
        InfosContato info2 = new InfosContato();
        info2.enderecoCasa = "Rua Pedras, 678 - centro - Itau MG";
        info2.email = "cleber@gmail.com";
        info2.numTelefone = 88765657;
        e2.infos = info2;

        e1.mostraInfo();
        e2.mostraInfo();
        e1.estudar();
        e2.estudar();
    }
}
