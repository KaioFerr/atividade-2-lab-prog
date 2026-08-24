import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public abstract class Livro {
    private final UUID id;
    @Nullable
    private Integer numPagina;

    @Nullable
    private String autor;

    @Nullable
    private String titulo;

    public Livro() {
        this.id = UUID.randomUUID();
    }

    @Nullable
    public UUID getId() {
        return id;
    }

    @Nullable
    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(@Nullable Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Nullable
    public String getAutor() {
        return autor;
    }

    public void setAutor(@Nullable String autor) {
        this.autor = autor;
    }

    @Nullable
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(@Nullable String titulo) {
        this.titulo = titulo;
    }

    public abstract void descricao();

    public void atualizaDados(Livro dadosAtualizados) throws Exception{
        try{
            if (dadosAtualizados.getAutor() != null && !dadosAtualizados.getAutor().isEmpty())
                setAutor(dadosAtualizados.getAutor());
            if ( dadosAtualizados.getTitulo() != null && !dadosAtualizados.getTitulo().isEmpty() )
                setTitulo(dadosAtualizados.getTitulo());
            if (dadosAtualizados.getNumPagina() != null)
                setNumPagina(dadosAtualizados.getNumPagina());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
