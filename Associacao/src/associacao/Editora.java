package associacao;

public class Editora {
    private String nome;
    private String localizacao;
    private final int maxlivros = 3;
    private int quant;
    private Livro livros[] = new Livro[maxlivros];

    public Editora(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.quant = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void adicionalivro(Livro l){
        if(this.quant<this.maxlivros){
            this.livros[quant] = l;
            quant++;
        }
        else{
            System.out.println("Limite maximo de livros nesta editora foi atingido.");
        }
    }
    
    public void informalivrospublicados(){
        for(int i = 0; i<quant; i++){
            System.out.println("Nome do livro: "+this.livros[i].getNome());
            System.out.println("Quantidade de paginas: "+this.livros[i].getPaginas());
        }
    }
}
