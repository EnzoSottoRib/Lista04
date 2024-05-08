package br.edu.up.modelos;

public class Reserva {
    
    int dia;
    int mes;
    int ano;
    int hora;
    double valorTotal;
    String nomeResponsavel;
    int qtdePessoas;
    
    public Reserva(String nomeResponsavel, int qtdePessoas) {
        this.nomeResponsavel = nomeResponsavel;
        this.qtdePessoas = qtdePessoas;
    }

    public Reserva() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }



}
