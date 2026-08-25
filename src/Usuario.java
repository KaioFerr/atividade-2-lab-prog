import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class Usuario {
    private UUID id = UUID.randomUUID();
    private String cpf;
    private String nome;
}
