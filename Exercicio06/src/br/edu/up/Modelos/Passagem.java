package br.edu.up.Modelos;

public class Passagem extends Passageiro{
    private int idPassagem;
    private int numAssentos;
    private String classeAssento;
    private int dataVoo;


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
    public int getDataVoo() {
        return dataVoo;
    }
    public void setDataVoo(int dataVoo) {
        this.dataVoo = dataVoo;
    }

    
}
