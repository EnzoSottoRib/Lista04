package br.edu.up.modelos;
import java.util.Scanner;

public class Contato {

    static int codigo;
    private String nome;
    private String telefone;
    Scanner leitor = new Scanner(System.in);
    
    public Contato(int codigo, String nome, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "Codigo=" + codigo +
                ", Nome='" + nome + '\'' +
                ", Telefone='" + telefone + '\'' +
                '}';
    }

    public void criarContato(){
        Contato contato = new Contato(codigo, nome, telefone);

        System.out.printf("Digite o código de seu contato: ");
        codigo = leitor.nextInt();
        leitor.nextLine();

        System.out.printf("Digite o nome de seu contato: ");
        nome = leitor.nextLine();

        System.out.printf("Digite o telefone de seu contato: ");
        telefone = leitor.nextLine();
    }

    }
