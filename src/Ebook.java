public class Ebook extends Livro{

    private Double tamanhoArquivo;

    public Ebook() {
        super();
    }

    public Double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(Double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void descricao() {
        System.out.println("Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nNúmero de Página: " + getNumPagina() + "\nTamanho do Arquivo: " + getTamanhoArquivo());
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
