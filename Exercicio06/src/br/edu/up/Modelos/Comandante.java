package br.edu.up.Modelos;

public class Comandante extends Tripulacao {
    private int totalHorasVoo;

    public Comandante(String nome, int rg, int idAeronautica, int matriculaFuncionario, int totalHorasVoo) {
        super(nome, rg, idAeronautica, matriculaFuncionario);
        this.totalHorasVoo = totalHorasVoo;
    }

    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }
}
