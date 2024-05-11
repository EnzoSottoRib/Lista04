package br.edu.up.Modelos;

public class Passageiro extends Pessoa {
    private String idBagagem;
    private String idPassagem;

    public Passageiro(String nome, String rg, String codigoAeronave, String tipoAeronave, int quantidadeAssentos,
            String idBagagem, String passagem) {
        super(nome, rg, codigoAeronave, tipoAeronave, quantidadeAssentos);
        this.idBagagem = idBagagem;
        this.idPassagem = passagem;
    }
    
    public String getIdBagagem() {
        return idBagagem;
    }
    public void setIdBagagem(String idBagagem) {
        this.idBagagem = idBagagem;
    }
    public String getPassagem() {
        return idPassagem;
    }
    public void setPassagem(String passagem) {
        this.idPassagem = passagem;
    }
    
}


