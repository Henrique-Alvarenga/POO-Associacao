package associacao;

public class Associacao {

    public static void main(String[] args) {
        Livro l1 = new Livro("A", 10);
        Livro l2 = new Livro("B", 20);
        Livro l3 = new Livro("C", 30);
        Livro l4 = new Livro("D", 30);
        Livro l5 = new Livro("E", 40);
        
        Editora e1 = new Editora("DFG", "Sao Paulo");
        Editora e2 = new Editora("HIJ", "Minas Gerais");
        
        e1.adicionalivro(l1);
        e1.adicionalivro(l2);
        e1.adicionalivro(l3);
        e2.adicionalivro(l4);
        e2.adicionalivro(l5);
        
        System.out.println("Livros da editora DFG");
        e1.informalivrospublicados();
        System.out.println("");
        System.out.println("Livros da editora HIJ");
        e2.informalivrospublicados();
    }
    
}
