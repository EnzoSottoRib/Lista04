import br.edu.up.Livro;
import br.edu.up.Util.Prompt;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        String codigo = "1598FHK";
        String titulo = "Core Java 2";
        String[] autores = {"Cay S. Horstmann", "Gary Cornell"};
        String isbn = "0130819336";
        int ano = 2005;

        Livro livro01 = new Livro(codigo, titulo, autores, isbn, ano);

        Livro livro02 = new Livro();

        livro02.setCodigo("9865PLO");
        livro02.setTitulo("Java, Como programar");
        String[] autoresLivro02 = {"Harvey Deitel"};
        livro02.setAutores(autoresLivro02);
        livro02.setIsbn("0130341517");
        livro02.setAno(2015);

        Prompt.imprimir("Detalhes do livro 01:");
        Prompt.imprimir(livro01.toString());

        Prompt.imprimir("Detalhes do livro 02:");
        Prompt.imprimir(livro02.toString());

    }
}
