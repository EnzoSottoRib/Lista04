package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;

import java.util.Scanner;

public class ControleEstacionamento {

    private Estacionamento estacionamento;
    private Scanner scanner;

    public ControleEstacionamento() {
        this.scanner = new Scanner(System.in);
        this.estacionamento = new Estacionamento();
    }

    public void adicionarCarro() {
        if (estacionamento.getVagasLivres() > 0) {
            Carro carro = lerDadosCarro();
            System.out.println(estacionamento.ocuparVaga(carro));
        } else {
            System.out.println("Todas as vagas estão ocupadas!");
        }
    }

    public void removerCarro() {
        System.out.print("Digite a placa do carro para remoção: ");
        String placaRemover = scanner.next();
        System.out.println(estacionamento.desocuparVaga(placaRemover));
    }

    public void emitirRelatorio() {
        System.out.println(estacionamento.emitirRelatorio());
    }

    private Carro lerDadosCarro() {
        System.out.println("Informe o modelo do carro: ");
        String modelo = scanner.next();
        System.out.println("Informe a placa do carro: ");
        String placa = scanner.next();
        System.out.println("Informe a cor do carro: ");
        String cor = scanner.next();

        return new Carro(modelo, placa, cor);
    }

    
}
