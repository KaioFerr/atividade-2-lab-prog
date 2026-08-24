import org.jetbrains.annotations.Nullable;

public class Ebook extends Livro{

    @Nullable
    private Double tamanhoArquivo;

    public Ebook() {
        super();
    }

    @Nullable
    public Double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(Double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void descricao() {
        System.out.println("\nID: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nNúmero de Página: " + getNumPagina() + "\nTamanho do Arquivo: " + getTamanhoArquivo() + " MB");
    }

    @Override
    public void atualizaDados(Livro dadosAtualizados) throws Exception{
        super.atualizaDados(dadosAtualizados);

        if (dadosAtualizados instanceof Ebook) {
            Ebook ebookNovo = (Ebook) dadosAtualizados;

            if (ebookNovo.getTamanhoArquivo() != null && !ebookNovo.getTamanhoArquivo().isNaN()) setTamanhoArquivo(ebookNovo.getTamanhoArquivo());
        }
    }
}
