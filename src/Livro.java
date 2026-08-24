import java.util.UUID;

public abstract class Livro {
    private final UUID id;
    private Integer numPagina;
    private String autor;
    private String titulo;

    public Livro() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void descricao();

    public void atualizaDados(Livro dadosAtualizados) throws Exception{
        try{
            if (!dadosAtualizados.getAutor().isEmpty() && dadosAtualizados.getAutor() != null)
                setAutor(dadosAtualizados.getAutor());
            if (!dadosAtualizados.getTitulo().isEmpty() && dadosAtualizados.getTitulo() != null)
                setTitulo(dadosAtualizados.getTitulo());
            if (!dadosAtualizados.getNumPagina().equals(-1) && dadosAtualizados.getNumPagina() != null)
                setNumPagina(dadosAtualizados.getNumPagina());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
