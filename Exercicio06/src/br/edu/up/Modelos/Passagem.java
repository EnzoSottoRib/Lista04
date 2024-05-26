package br.edu.up.Modelos;

import java.time.LocalDateTime;

public class Passagem {
    private int idPassagem;
    private int numAssentos;
    private String classeAssento;
    private LocalDateTime dataVoo;

    public Passagem(int idPassagem, int numAssentos, String classeAssento, LocalDateTime dataVoo) {
        this.idPassagem = idPassagem;
        this.numAssentos = numAssentos;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    public int getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(int idPassagem) {
        this.idPassagem = idPassagem;
    }

    public int getNumAssentos() {
        return numAssentos;
    }

    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }
}
