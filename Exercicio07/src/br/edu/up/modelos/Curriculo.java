package br.edu.up.modelos;

public class Curriculo {
    
    String descricao;
    boolean necessario;
    
    public Curriculo(String descricao, boolean necessario) {
        this.descricao = descricao;
        this.necessario = necessario;
    }

    public Curriculo() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isNecessario() {
        return necessario;
    }

    public void setNecessario(boolean necessario) {
        this.necessario = necessario;
    }

}
