package br.edu.up.modelos;

public class Titulacao {
    
    String nomeInstituicao;
    int ano;
    String tituloObtido;
    String tituloTCC;
    
    public Titulacao(String nomeInstituicao, int ano, String tituloObtido, String tituloTCC) {
        this.nomeInstituicao = nomeInstituicao;
        this.ano = ano;
        this.tituloObtido = tituloObtido;
        this.tituloTCC = tituloTCC;
    }

    public Titulacao() {
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTituloObtido() {
        return tituloObtido;
    }

    public void setTituloObtido(String tituloObtido) {
        this.tituloObtido = tituloObtido;
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }

}
