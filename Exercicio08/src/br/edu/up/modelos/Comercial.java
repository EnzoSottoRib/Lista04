package br.edu.up.modelos;

import java.util.Scanner;

import br.edu.up.controles.Contato;

public class Comercial extends Contato {
    private String cnpj;
    Scanner leitor = new Scanner(System.in);

    public Comercial(int Codigo, String Nome, String Telefone, String cnpj) {
        super(Codigo, Nome, Telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void criarContatoComercial(){
        System.out.printf("Digite o CNPJ de seu contato: ");
        cnpj = leitor.nextLine();
        Comercial comercial = new Comercial(getCodigo(), getNome(), getTelefone(), cnpj);
    }


    
}

    
