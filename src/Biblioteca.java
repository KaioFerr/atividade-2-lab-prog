import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    public Livro obterLivroPorId(UUID id) throws Exception{
        try{
            for(Livro livro : livros){
                assert livro.getId() != null;
                if (livro.getId().equals(id)) {
                    livro.descricao();
                    return livro;
                }
            }
        }catch (Exception e){
            System.out.println(e + ": Livro não encontrado");
        }
        return null;
    }

    public Boolean deletarLivroPorId(UUID id) throws Exception {
        try{
           Livro livroEncontrado = obterLivroPorId(id);
           return livros.remove(livroEncontrado);
        }catch (Exception e){
            System.out.println(e + " Erro ao deletar livro");
        }
        return false;
    }

    public Livro atualizarLivroPorId (UUID id, Livro dadosAtualizado) throws Exception{
        try {
            Livro encontrado = obterLivroPorId(id);
            encontrado.atualizaDados(dadosAtualizado);
            return encontrado;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
