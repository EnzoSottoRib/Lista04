package br.edu.up.Modelos;

public class Passagem {
    private String numAssento;
    private String classeAssento;
    private int dataVoo;
    
    public Passagem(String numAssento, String classeAssento, int dataVoo) {
        this.numAssento = numAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    public String getNumAssento() {
        return numAssento;
    }

    public void setNumAssento(String numAssento) {
        this.numAssento = numAssento;
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
