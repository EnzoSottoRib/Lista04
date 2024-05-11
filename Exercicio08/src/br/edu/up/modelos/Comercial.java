package br.edu.up.modelos;

public class Comercial extends Contato {

    private String cnpj;

    public Comercial(int Codigo, String Nome, String Telefone) {
        super(Codigo, Nome, Telefone);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
