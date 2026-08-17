public class LivroFisico extends Livro{

    private Double peso;

    public LivroFisico() {
        super();
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public void descricao(){
        System.out.println("Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nNúmero de Página: " + getNumPagina() + "\nPeso: " + getPeso());
    }
}
