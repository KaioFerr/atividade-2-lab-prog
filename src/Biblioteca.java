import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Biblioteca {

    private final List<Livro> livros = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();
    private final List<Locacao> locacoes = new ArrayList<>();

    public Biblioteca() {
        super();
    }

    public void adicionarLivro(Livro livro) {
        try{
            livros.add(livro);
            System.out.println("livro adicionado...");
        }catch (Exception e){
            throw new RuntimeException("livro não adicionado...");
        }
    }

    public void listarLivros(){
        livros.forEach(Livro::descricao);
    }

    public Livro obterLivroPorId(UUID id) {
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

    public Boolean deletarLivroPorId(UUID id) {
        try{
           Livro livroEncontrado = obterLivroPorId(id);
           return livros.remove(livroEncontrado);
        }catch (Exception e){
            throw new RuntimeException("Erro ao deletar livro");
        }
    }

    public void atualizarLivroPorId (UUID id, Livro dadosAtualizado) {
        try {
            Livro encontrado = obterLivroPorId(id);
            encontrado.atualizaDados(dadosAtualizado);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar livro");
        }
    }

    public Usuario cadastrarUsuario (String cpf, String nome) {
        try {
            if (cpf.length() > 11) throw new RuntimeException("CPF com mais de 11 dígitos");

            Usuario usuarioNovo = Usuario.builder()
                    .nome(nome)
                    .cpf(cpf)
                    .build();

            System.out.println("\nUsuário cadastrado");

            return usuarioNovo;

        } catch (RuntimeException e) {
            throw new RuntimeException("Erro ao cadastrar usuário");
        }
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Locacao obterLocacaoPorId(UUID id) {
        try{
            for (Locacao locacao : locacoes) {
                if (locacao.getId().equals(id)) return locacao;
            }
        }catch (RuntimeException e) {
            throw new RuntimeException("Locação não encontrada");
        }
        return null;
    }

    public void alugarLivro (Livro livro, Usuario usuario, Integer qtdDias) {
        try{
            LocalDateTime agora = LocalDateTime.now();

            Locacao novaLocacao = Locacao.builder()
                    .usuario(usuario)
                    .livroAlugado(livro)
                    .dataInicio(agora)
                    .dataFim(agora.plusDays(qtdDias))
                    .build();

            locacoes.add(novaLocacao);

            System.out.println("\nLocação cadastrada!");

        }catch (RuntimeException e) {
            throw new RuntimeException("Erro ao alugar livro");
        }
    }

    public void encerrarEmprestimoPorId(UUID locacaoId) {
        try {
            Locacao locacaoEncontrada = obterLocacaoPorId(locacaoId);
            if (locacaoEncontrada != null) locacoes.remove(locacaoEncontrada);
        }catch (RuntimeException e) {
            throw new RuntimeException("Erro ao remover locação");
        }
    }

    public void listarLocacao() {
        System.out.println("\nLocações:");
        locacoes.forEach(Locacao::descricao);
    }
}
