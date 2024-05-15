package br.edu.up.Modelos;

public class Aeronave {
    private int codigoAeronave;
    private String tipoAeronave;
    private int qtdAssentos;

    
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
