package br.edu.up.modelos;
import java.util.Scanner;

public class Pessoal extends Contato {

    private String aniversario;

    Scanner leitor = new Scanner(System.in);

    public Pessoal(int Codigo, String Nome, String Telefone, String aniversario) {
        super(Codigo, Nome, Telefone);
        this.aniversario = aniversario;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        aniversario = aniversario;
    }

    public void criarContatoPessoal(){
        Pessoal pessoal = new Pessoal(getCodigo(), getNome(), getTelefone(), aniversario);
        System.out.printf("Digite o aniversário de seu contato: ");
        aniversario = leitor.nextLine();
    }

}

    
