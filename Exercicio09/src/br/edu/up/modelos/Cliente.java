package br.edu.up.modelos;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private double vlrMaxCredito;
    private double vlrEmprestado;


    public void emprestar(double valor){

        double valtot = valor + getVlrEmprestado();

        if (valtot > vlrMaxCredito){
            System.out.println("Valor maior que o limite.");
        } else {
            vlrEmprestado += valor;
        }
    }

    public double devolver(double valor){
        if (vlrEmprestado < valor){
            valor -= vlrEmprestado;
            vlrEmprestado = 0;
        } else {
            vlrEmprestado -= valor;
        }
        return valor;
    }

    public double getSaldo(){
        return getVlrEmprestado();
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }
    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }
    public double getVlrEmprestado() {
        return vlrEmprestado;
    }
    public void setVlrEmprestado(double vlrEmprestado) {
        this.vlrEmprestado += vlrEmprestado;
    }

    
}
