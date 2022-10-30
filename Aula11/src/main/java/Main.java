public class Main {
    public static void main(String[] args) {
        // Criando Threads contadoras
        ThreadContadora t1 = new ThreadContadora("Cont1");
        ThreadContadora t2 = new ThreadContadora("Cont2");
        ThreadContadora t3 = new ThreadContadora("Cont3");

        //Thread com implements Runnable
        ThreadCont tc4 = new ThreadCont("Cont4");
        Thread t4 = new Thread(tc4);

        //Executando as tarefas
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
