package br.edu.up.modelos;

public class Competencia {
    
    String descricao;
    Necessidade necessidade;
    boolean satisfatorio;

    public Competencia(String descricao, Necessidade necessidade) {
        this.descricao = descricao;
        this.necessidade = necessidade;
    }

    public Competencia() {
    }

    public enum Necessidade {
        NECESSARIO, COMPLEMENTAR
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Necessidade getNecessidade() {
        return necessidade;
    }

    public void setNecessidade(Necessidade necessidade) {
        this.necessidade = necessidade;
    }

    public boolean isSatisfatorio() {
        return satisfatorio;
    }

    public void setSatisfatorio(boolean satisfatorio) {
        this.satisfatorio = satisfatorio;
    }

}
