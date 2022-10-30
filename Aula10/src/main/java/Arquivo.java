import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    //Metodos para realizarmos em um arquivo

    //metodo para escrever
    public void escrever(Funcionario funcionario) {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Funcionarios.txt", true); //nome onde será salvo o arquivo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw); //variavel para escrever

            //Escrevendo no arquivo de forma estatica
            /*
            bw.write("Olá mundo!!");
            bw.newLine();
            */

            //Flag que indica onde começa as infos dos Funcionarios
            bw.write("++ Funcionarios ++\n");

            //Escrevendo os atributos dos funcionarios
            bw.write(funcionario.getNome() + "\n");
            bw.write(funcionario.getCpf() + "\n");
            bw.write(funcionario.getIdade() + "\n");

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        } finally {
            //fechando a entrada de dados
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println();
            }
        }
    }

    public ArrayList<Funcionario> ler(){
        //ArrayList que salvar funcionarios encontrados no arquivo
        ArrayList<Funcionario> encontreiNoArquivo = new ArrayList<>();

        InputStream is = null;
        InputStreamReader  isr = null;
        BufferedReader br = null;

        //Flag para o while
        String linhaler;

        try {
            is = new FileInputStream("Funcionarios.txt"); //Nome do arquivo
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr); //Variavel usada para ler

            //Colocando o cursor no inicio
            linhaler = br.readLine();
            while (linhaler != null){
                //Procuando a flag de funcionario
                if (linhaler.contains("++ Funcionarios ++")){
                    //Funcionario aux
                    String nome = br.readLine();
                    String cpf = br.readLine();
                    int idade = Integer.parseInt(br.readLine());
                    Funcionario func_aux = new Funcionario(nome, cpf, idade);

                    //Adicionando funcionario no Array
                    encontreiNoArquivo.add(func_aux);
                }
                linhaler = br.readLine();
            }
        }catch (Exception e){
            System.out.println("Erro: " + e);
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println();
            }
        }

        return encontreiNoArquivo;
    }
}