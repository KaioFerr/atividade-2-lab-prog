import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class Usuario {
    private UUID id = UUID.randomUUID();
    private String cpf;
    private String nome;

    public void atualizarDados (Usuario usuarioAtualizado) {
        try {
            if (usuarioAtualizado.cpf != null && !usuarioAtualizado.cpf.isEmpty()) setCpf(usuarioAtualizado.getCpf());
            if (usuarioAtualizado.nome != null && !usuarioAtualizado.nome.isEmpty()) setNome(usuarioAtualizado.getNome());
        }catch (RuntimeException e) {
            throw new RuntimeException("Erro ao atualizar usuário");
        }
    }
}
