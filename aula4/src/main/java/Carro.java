public class Carro {
    public String cor;
    public String marca;
    public String modelo;
    public double velocidadeMax;
    public double velocidadeAtual;
    Motor motor = new Motor();


    public void ligar(){
        System.out.println("O carro " + modelo + " ligou!");
    }
    public void acelerar(){
        System.out.println("Vrummm!");
    }
    public void mostraInfo(){
        System.out.println(marca + " " + modelo + " - " + cor);
        System.out.println("Velocidade maxima: "+ velocidadeMax);
        System.out.println("Velocidade: "+ velocidadeAtual);
        System.out.println("Motor: " + motor.tipo + " - " + motor.potencia + " CV\n");
    }
}
