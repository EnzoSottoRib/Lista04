package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente{
    private String cnpj;
    private String inscEstadual;
    private int anoFuncadao;

    public void ClienteEmpresa(){

    }

    public double getSaldo(){

    }

    public String getDados(){

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFuncadao() {
        return anoFuncadao;
    }

    public void setAnoFuncadao(int anoFuncadao) {
        this.anoFuncadao = anoFuncadao;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa [cnpj=" + cnpj + ", inscEstadual=" + inscEstadual + ", anoFuncadao=" + anoFuncadao + "]";
    }

    
}
