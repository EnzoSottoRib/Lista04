package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente{
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(){
        super();
        setVlrMaxCredito(25000.0);
    }

    public ClienteEmpresa(String nome, String telefone, String email, String cnpj, String inscEstadual, int anoFundacao){
        super(nome, telefone, email, 25000.0);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    public double getSaldo(){
        return super.getSaldo();
    }

    @Override
    public String getDados(int i){
        return String.format("ClienteEmpresa\nCNPJ: %s\nInscrição Estadual: %s\nAno de Fundação: %d\n%s", 
                            cnpj, inscEstadual, anoFundacao, super.getDados(i));
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
