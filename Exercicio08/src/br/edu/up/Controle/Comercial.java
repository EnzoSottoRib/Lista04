package br.edu.up.Controle;

public class Comercial extends Contato {
    public Comercial(int Codigo, String Nome, String Telefone) {
        super(Codigo, Nome, Telefone);
    }

    private String Cnpj;

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    
}
