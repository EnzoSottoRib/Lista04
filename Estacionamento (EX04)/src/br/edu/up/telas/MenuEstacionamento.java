package br.edu.up.telas;

import br.edu.up.controles.ControleEstacionamento;

public class MenuEstacionamento {

    private static ControleEstacionamento controle = new ControleEstacionamento();

    public static void main(String[] args) {
        controle.executar();
    }
}
