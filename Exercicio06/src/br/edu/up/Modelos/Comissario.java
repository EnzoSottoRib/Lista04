package br.edu.up.Modelos;

public class Comissario extends Tripulacao {
    private String idiomasFluente;

    public Comissario(String nome, int rg, int idAeronautica, int matriculaFuncionario, String idiomasFluente) {
        super(nome, rg, idAeronautica, matriculaFuncionario);
        this.idiomasFluente = idiomasFluente;
    }

    public String getIdiomasFluente() {
        return idiomasFluente;
    }

    public void setIdiomasFluente(String idiomasFluente) {
        this.idiomasFluente = idiomasFluente;
    }
}
