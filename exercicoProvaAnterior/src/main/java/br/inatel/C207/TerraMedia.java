package br.inatel.C207;

public class TerraMedia {
    private Habitante[] herois = new Habitante[10];

    public void addHabitante(Habitante habitante){
        for (int i = 0; i < herois.length; i++) {
            if (herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes(){
        for (Habitante h:herois) {
            if (h != null){
                h.mostraInfo();
                h.atacar();
                if (h instanceof Anao) {
                    ((Anao) h).minerar();
                    System.out.println(" ");
                }else if (h instanceof Elfo) {
                    ((Elfo) h).curar();
                    System.out.println(" ");
                }else if (h instanceof Mago) {
                    ((Mago) h).lancaFeitico();
                    System.out.println(" ");
                }
            }
        }
    }
}
