//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Ebook ebook = new Ebook();
        ebook.setAutor("Davi Moreinra");
        ebook.setTamanhoArquivo(3.0);
        ebook.setNumPagina(5);
        ebook.setTitulo("A vida de Davi Moreira");

        LivroFisico livroFisico = new LivroFisico();
        livroFisico.setPeso(3.0);
        livroFisico.setAutor("Milk Milks");
        livroFisico.setTitulo("A vida de Milk Milks");
        livroFisico.setNumPagina(30);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(ebook);
        biblioteca.adicionarLivro(livroFisico);

        biblioteca.listarLivros();

        biblioteca.buscarLivroPorTitulo("A vida de avi Moreira");
    }
}