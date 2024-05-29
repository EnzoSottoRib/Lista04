package br.edu.up.modelos;


public class Contato {

    private Integer codigo;
    private String nome;
    private String telefone;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
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

    }
