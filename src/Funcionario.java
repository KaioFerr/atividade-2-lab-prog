import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Funcionario {
    private Integer ramal;
    private Cargo cargo;
    private Papel papel = Papel.FUNCIONARIO;
}
