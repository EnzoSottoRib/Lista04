package br.edu.up.Controle;
import java.util.Scanner;

public class Comercial extends Contato {

    Scanner leitor = new Scanner(System.in);

    public Comercial(String Cnpj) {
        super(Codigo, Cnpj, Cnpj);
    }

    private String Cnpj;

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public void criarContatoComercial(){
        Comercial comercial = new Comercial(Cnpj);
        System.out.printf("Digite o CNPJ de seu contato: ");
        Cnpj = leitor.nextLine();
    }

    
}
