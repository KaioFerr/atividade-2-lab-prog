import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class Aluno extends Usuario {
    private String numeroMatricula;

    @Override
    public void atualizarDados(Usuario usuario) {
        try{
            super.atualizarDados(usuario);

            if (usuario instanceof Aluno dadosAtualizados) {
                if (dadosAtualizados.getNumeroMatricula() != null && !dadosAtualizados.getNumeroMatricula().isEmpty()) {
                    setNumeroMatricula(dadosAtualizados.getNumeroMatricula());
                }
            }
        }catch (RuntimeException e) {
            throw new RuntimeException("Erro ao atualizar Aluno");
        }
    }
}
