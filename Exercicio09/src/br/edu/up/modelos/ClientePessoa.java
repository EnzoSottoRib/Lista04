package br.edu.up.modelos;

public class ClientePessoa extends Cliente{
    private String CPF;
    private double peso;
    private double altura;

    public double getSaldo(){
        return super.getSaldo();
    }

    /*public String getDados(){

    }*/

    public double clientePessoa(){
        double credito = 10000; 
        return credito;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
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
        return "ClientePessoa [CPF=" + CPF + ", peso=" + peso + ", altura=" + altura + "]";
    }

    
    
}
