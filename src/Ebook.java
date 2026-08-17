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
}
