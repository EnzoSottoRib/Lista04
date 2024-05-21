package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente{
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String cnpj, String inscEstadual, int anoFundacao, double credito){
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
        super.setVlrMaxCredito(credito);
    }

    public double getSaldo(){
        return super.getSaldo();
    }

    public String getDados(int i){
        return toString() + super.getDados(i);
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
        return anoFundacao;
    }

    public void setAnoFuncadao(int anoFuncadao) {
        this.anoFundacao = anoFuncadao;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa [cnpj=" + cnpj + ", inscEstadual=" + inscEstadual + ", anoFuncadao=" + anoFundacao + "]";
    }

    
}
