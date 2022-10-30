public class ThreadCont implements Runnable{
    // Atributos
    private String nomeThread;

    // Construtor
    public ThreadCont(String nome){
        this.nomeThread = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.nomeThread + " - " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
