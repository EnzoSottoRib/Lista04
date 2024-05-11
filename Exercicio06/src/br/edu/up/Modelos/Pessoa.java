package br.edu.up.Modelos;

public class Pessoa {
    private String nome;
    private String rg;
    private String codigoAeronave;
    private String tipoAeronave;
    private int quantidadeAssentos;

    public Pessoa(String nome, String rg, String codigoAeronave, String tipoAeronave, int quantidadeAssentos) {
        this.nome = nome;
        this.rg = rg;
        this.codigoAeronave = codigoAeronave;
        this.tipoAeronave = tipoAeronave;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCodigoAeronave() {
        return codigoAeronave;
    }

    public void setCodigoAeronave(String codigoAeronave) {
        this.codigoAeronave = codigoAeronave;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    public void setQuantidadeAssentos(int quantidadeAssentos) {
        this.quantidadeAssentos = quantidadeAssentos;
    }

    
    
}
