import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

@Getter
@ToString
@Builder
public class Locacao {
    private UUID id = UUID.randomUUID();
    private Livro livroAlugado;
    private Usuario usuario;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    public void descricao() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        String dataInicioFormatada = dataInicio.format(formatador);
        String dataFimFormata = dataFim.format(formatador);
        System.out.printf("""
                ===================
                Livro: %s
                Usuario: %s
                Data Início: %s
                Data Fim: %s
                ==================
                \n
                %n""", livroAlugado.getTitulo(), usuario.getNome(), dataInicioFormatada, dataFimFormata);
    }
}
