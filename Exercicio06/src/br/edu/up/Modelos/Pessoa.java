package br.edu.up.Modelos;

public abstract class Pessoa {
    private String nome;
    private int rg;
    private int codigoAeronave;
    private String tipoAeronave;
    private int qtdAssentos;
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public int getCodigoAeronave() {
        return codigoAeronave;
    }
    public void setCodigoAeronave(int codigoAeronave) {
        this.codigoAeronave = codigoAeronave;
    }
    public String getTipoAeronave() {
        return tipoAeronave;
    }
    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }
    public int getQtdAssentos() {
        return qtdAssentos;
    }
    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    
}
