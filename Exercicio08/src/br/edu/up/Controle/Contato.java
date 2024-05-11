package br.edu.up.Controle;
import java.util.Scanner;

public class Contato {

    static int Codigo;
    private String Nome;
    private String Telefone;
    Scanner leitor = new Scanner(System.in);
    
public Contato(int Codigo, String Nome, String Telefone){
    this.Codigo = Codigo;
    this.Nome = Nome;
    this.Telefone = Telefone;
}

public int getCodigo() {
    return Codigo;
}

public void criarContato(){
    Contato contato = new Contato(Codigo, Nome, Telefone);

    System.out.printf("Digite o código de seu contato: ");
    Codigo = leitor.nextInt();
    leitor.nextLine();

    System.out.printf("Digite o Nome de seu contato: ");
    Nome = leitor.nextLine();

    System.out.printf("Digite o Telefone de seu contato: ");
    Telefone = leitor.nextLine();


}

public void setCodigo(int codigo) {
    Codigo = codigo;
}

public String getNome() {
    return Nome;
}

public void setNome(String nome) {
    Nome = nome;
}

public String getTelefone() {
    return Telefone;
}

public void setTelefone(String telefone) {
    Telefone = telefone;
}

@Override
public String toString() {
    return "Contato{" +
            "Codigo=" + Codigo +
            ", Nome='" + Nome + '\'' +
            ", Telefone='" + Telefone + '\'' +
            '}';
}



}
