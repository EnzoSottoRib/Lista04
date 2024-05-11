package br.edu.up.Controle;
import java.util.Scanner;

public class Pessoal extends Contato {

    Scanner leitor = new Scanner(System.in);

    public Pessoal(String Aniversario) {
        super(Codigo, Aniversario, Aniversario);
    }

    private String Aniversario;

    public String getAniversario() {
        return Aniversario;
    }

    public void setAniversario(String aniversario) {
        Aniversario = aniversario;
    }

    public void criarContatoPessoal(){
        Pessoal pessoal = new Pessoal(Aniversario);
        System.out.printf("Digite o aniversário de seu contato: ");
        Aniversario = leitor.nextLine();
    }

    

    
}

    
