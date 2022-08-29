public class Jardim {
    //Atributos
    String nomeDono;
    String contato;
    String endereco;

    Arvore[] arvores = new Arvore[10]; //Array para guardar as arvores

    public void addArvore(Arvore arvore){ //função para adicionar arvore
        boolean ocupado = true;
        for (int i = 0; i < arvores.length && ocupado; i++) {
            if(arvores[i] == null){
                arvores[i] = arvore;
                ocupado = false;
            }
        }
    }

    public void replantar(){ //função mostrar arvores que precisam ser replantadas
        System.out.println("Arvores que precisam ser replantadas: ");
        for (Arvore a:arvores) {
            if(a != null){
                if (a.altura > 50 && a.diametro > 3) System.out.println("- " + a.especie);
            }
        }
    }

    public void precoMedio(){ //função para mostrar preço medio
        float total = 0;
        float cont=0;
        int media;

        for (Arvore a:arvores) {
            if(a != null){
                cont++;
                total += a.preco;
            }
        }
        media = (int) (total / cont);

        System.out.println("Preco medio das plantas: " + media);
    }

    public void monstraInfo(){//função para mostrar informações do jardim
        System.out.println("--INFORMACOES DO JARDIM--");
        System.out.println("Proprietario: " + nomeDono);
        System.out.println("Contato: " + contato);
        System.out.println("Endereco: " + endereco);
        System.out.println("---Plantas---");
        for (Arvore a:arvores) {
            if(a != null){
                System.out.println("-" + a.especie.toUpperCase());
                System.out.println("Altura: " + a.altura + " cm");
                System.out.println("Diametro: " + a.diametro+ " cm");
                System.out.println("Preco: R$" + a.preco);
            }
        }
    }
}
