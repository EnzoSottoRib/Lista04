package br.edu.up.Controle;

import br.edu.up.Modelos.*;

import java.time.LocalDateTime;

public class ControleAeroporto {

    private Aeronave aeronave;

    public ControleAeroporto() {
        this.aeronave = new Aeronave();
    }

    public void setAeronave(int codigo, String tipo, int qtdAssentos) {
        aeronave.setCodigoAeronave(codigo);
        aeronave.setTipoAeronave(tipo);
        aeronave.setQtdAssentos(qtdAssentos);
    }

    public void registrarPassageiroControle(String nome, int rg, int idBagagem, int idPassagem, int numAssento, String classe, LocalDateTime dataVoo) {
        new Passageiro(nome, rg, idBagagem, idPassagem);
        new Passagem(idPassagem, numAssento, classe, dataVoo);
    }
    

    public void registrarComandanteControle(String nome, int rg, int idAeronautica, int matriculaFuncionario, int totalHorasVoo) {
        new Comandante(nome, rg, idAeronautica, matriculaFuncionario, totalHorasVoo);
    }

    public void registrarComissarioControle(String nome, int rg, int idAeronautica, int matriculaFuncionario, String idiomasFluente) {
        new Comissario(nome, rg, idAeronautica, matriculaFuncionario, idiomasFluente);
    }
}
