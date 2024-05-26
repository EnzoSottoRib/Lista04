package br.edu.up.modelos;

public class ClientePessoa extends Cliente{
    private String cpf;
    private double peso;
    private double altura;

    public ClientePessoa(){
        super();
        setVlrMaxCredito(10000.0);
    }

    public ClientePessoa(String nome, String telefone, String email, String cpf, double peso, double altura) {
        super(nome, telefone, email, 10000.0);
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    public double getSaldo(){
        return super.getSaldo();
    }

    @Override
    public String getDados(int i){
        return String.format("ClientePessoa\nCPF: %s\nPeso: %.2f\nAltura: %.2f\n%s", 
        cpf, peso, altura, super.getDados(i));
    }

    public double clientePessoa(){
        double credito = 10000; 
        return credito;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cPF) {
        cpf = cPF;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "ClientePessoa [CPF=" + cpf + ", peso=" + peso + ", altura=" + altura + "]";
    }

    
    
}
