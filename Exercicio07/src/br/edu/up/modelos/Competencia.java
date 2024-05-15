package br.edu.up.modelos;

public class Competencia {
    
    String descricao;
    boolean obrigatoria;
    boolean satisfatorio;

    public Competencia(String descricao, boolean obrigatoria) {
        this.descricao = descricao;
        this.obrigatoria = obrigatoria;
    }

    public Competencia() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isObrigatoria() {
        return obrigatoria;
    }

    public void setObrigatoria(boolean obrigatoria) {
        this.obrigatoria = obrigatoria;
    }

    public boolean isSatisfatorio() {
        return satisfatorio;
    }

    public void setSatisfatorio(boolean satisfatorio) {
        this.satisfatorio = satisfatorio;
    }

    @Override
    public String toString() {
        return "Competencia [descricao=" + descricao + ", obrigatoria=" + obrigatoria + ", satisfatorio=" + satisfatorio
                + "]";
    }

}
