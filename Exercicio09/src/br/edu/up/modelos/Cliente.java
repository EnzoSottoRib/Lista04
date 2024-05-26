package br.edu.up.modelos;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private double vlrMaxCredito;
    private double vlrEmprestado;

    public Cliente(){
        
    }

    public Cliente(String nome, String telefone, String email, double vlrMaxCredito) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.vlrMaxCredito = vlrMaxCredito;
    }

    public void emprestar(double valor) {
        if (vlrEmprestado + valor > vlrMaxCredito) {
            System.out.println("Valor maior que o limite.");
        } else {
            vlrEmprestado += valor;
        }
    }

    public void devolver(double valor) {
        if (vlrEmprestado < valor) {
            vlrEmprestado = 0;
        } else {
            vlrEmprestado -= valor;
        }
    }

    public double getSaldo(){
        return getVlrEmprestado();
    }

    public String getDados(int i){
        return "Cliente "+ i +"\nNome = " + nome + "\nTelefone =    " + telefone + "\nemail =   " + email + "\nValor Maximo de Crédito =    "
        + vlrMaxCredito + "\nValor de Emprestimo =  " + vlrEmprestado + "\nEndereco =   " + endereco+ "\n-->Saldo:" + getSaldo();
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
