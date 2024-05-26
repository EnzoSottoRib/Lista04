package br.edu.up.Modelos;

public class Passageiro extends Pessoa {
    private int idBagagem;
    private int idPassagem;

    public Passageiro(String nome, int rg, int idBagagem, int idPassagem) {
        super(nome, rg);
        this.idBagagem = idBagagem;
        this.idPassagem = idPassagem;
    }

    public int getIdBagagem() {
        return idBagagem;
    }

    public void setIdBagagem(int idBagagem) {
        this.idBagagem = idBagagem;
    }

    public int getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(int idPassagem) {
        this.idPassagem = idPassagem;
    }
}
