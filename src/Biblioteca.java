import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public Biblioteca() {
        super();
    }

    public void adicionarLivro(Livro livro) throws Exception{
        try{
            livros.add(livro);
            System.out.println("livro adicionado...");
        }catch (Exception e){
            System.out.println("livro não adicionado...");
        }
    }

    public void listarLivros(){
        livros.forEach(Livro::descricao);
    }

    public Livro buscarLivroPorTitulo(String titulo) throws Exception{
        try{
            for(Livro livro : livros){
                if (livro.getTitulo().equals(titulo)) {
                    System.out.println("\n\nTitulo do Livro encontrado: " + livro.getTitulo());
                    return livro;
                }else throw new Exception("Livro não encontrado");
            }
        }catch (Exception e){
            System.out.println("Livro não encontrado");
        }
        return null;
    }
}
