package edu.up.controles;

import edu.up.modelos.Carro;
import edu.up.modelos.Estacionamento;

import java.util.Scanner;

public class ControleEstacionamento {

    private Estacionamento estacionamento;

    public ControleEstacionamento() {
        this.estacionamento = new Estacionamento();
    }

    public String lerDadosCarro(String modelo, String placa, String cor) {
        if (estacionamento.getVagasLivres() > 0) {
            Carro carro = new Carro(modelo, placa, cor);
            return estacionamento.ocuparVaga(carro);
        } else {
            return "Todas as vagas estão ocupadas!";
        }
    }

    public String removerCarro(String placa) {
        return estacionamento.desocuparVaga(placa);
    }

    public String emitirRelatorio() {
        return estacionamento.emitirRelatorio();
    }

    
}
