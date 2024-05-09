package br.edu.up.Controle;

public class Pessoal extends Contato {
    public Pessoal(int Codigo, String Nome, String Telefone) {
        super(Codigo, Nome, Telefone);
    }

    private String Aniversario;

    public String getAniversario() {
        return Aniversario;
    }

    public void setAniversario(String aniversario) {
        Aniversario = aniversario;
    }

    
}
