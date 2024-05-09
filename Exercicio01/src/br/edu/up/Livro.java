package br.edu.up;
import java.util.Arrays;

public class Livro {

    String codigo;
    String titulo;
    String autores[];
    String isbn;
    int ano;

    public Livro(String codigo, String titulo, String[] autores, String isbn, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }

    public Livro() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIsbn() {
        return ano;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    @Override
    public String toString() {
        return "Livro [codigo = " + codigo + ", titulo = " + titulo + ", autores = " + Arrays.toString(autores) + ", isbn = "
                + isbn + ", ano = " + ano + "]";
    }

}
