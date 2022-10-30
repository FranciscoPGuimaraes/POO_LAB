import br.inatel.Carro;
import br.inatel.Match;
import br.inatel.SUV;
import br.inatel.Sedan;

public class Main {
    public static void main(String[] args) {
        Carro[] carros = new Carro[5];

        carros[0]= new SUV(122000, "Vermelho", 2018, "Traseira");
        carros[1] = new Sedan(90000, "Preto", 2022, 180);
        carros[2] = new Match(122000, "Vermelho", 2018, 4);

        for (Carro c:carros) {
            if(c != null){
                if(c instanceof SUV){
                    SUV aux = (SUV) c;
                    aux.mostraInfos();
                    aux.taxa();
                }else if(c instanceof Sedan){
                    Sedan aux = (Sedan) c;
                    aux.mostraInfos();
                    aux.taxa();
                }else if(c instanceof Match){
                    Match aux = (Match) c;
                    aux.mostraInfos();
                    aux.taxa();
                }
            }
        }
    }



}
