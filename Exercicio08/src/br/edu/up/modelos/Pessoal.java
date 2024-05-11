package br.edu.up.modelos;
import java.util.Scanner;

public class Pessoal extends Contato {

    private String aniversario;

    Scanner leitor = new Scanner(System.in);

    public Pessoal(String aniversario) {
        super(codigo, aniversario, aniversario);
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        aniversario = aniversario;
    }

    public void criarContatoPessoal(){
        Pessoal pessoal = new Pessoal(aniversario);
        System.out.printf("Digite o aniversário de seu contato: ");
        aniversario = leitor.nextLine();
    }

}

    
