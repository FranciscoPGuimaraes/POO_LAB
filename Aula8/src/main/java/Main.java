import br.inatel.cdg.Arquiteto;
import br.inatel.cdg.Engenheiro;
import br.inatel.cdg.Funcionario;
import br.inatel.cdg.Professor;

public class Main {
    public static void main(String[] args) {
        //Aula 8- Classe abstrata

        //Quando a classe é abstrata não podemos criar um objeto a partir dessa classe
        //Funcionario funcionario = new Funcionario();
        Funcionario funcionario = new Arquiteto();

        Professor professor = new Professor();
        professor.setNome("Fracisco");
        professor.setIdade(18);
        professor.setSalario(1000);
        professor.setMateria("Matematica");

        Engenheiro engenheiro = new Engenheiro();
        engenheiro.setNome("Fracisco");
        engenheiro.setIdade(18);
        engenheiro.setSalario(1000);
        engenheiro.setRamo("Software");

        Arquiteto arquiteto = new Arquiteto();
        arquiteto.setNome("Fracisco");
        arquiteto.setIdade(18);
        arquiteto.setSalario(1000);
        arquiteto.setEspecialidade("Design");


        //Logica para varios funcionarios
        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = arquiteto;
        funcionarios[1] = engenheiro;
        funcionarios[2] = professor;
        ;
        for (Funcionario f:funcionarios) {
            if (f != null){
                if(f instanceof Professor){
                    Professor auxProfessor = (Professor)f;
                    auxProfessor.corrigirProvas();
                    auxProfessor.mostraInfos();
                    auxProfessor.executaAcao();
                }else if(f instanceof Arquiteto){
                    Arquiteto auxArquiteto = (Arquiteto) f;
                    auxArquiteto.mostraInfos();
                    auxArquiteto.executaAcao();
                }else if(f instanceof Engenheiro){
                    Engenheiro auxEngenheiro = (Engenheiro)f;
                    auxEngenheiro.mostraInfos();
                    auxEngenheiro.executaAcao();
                }
            }
        }
    }
}
