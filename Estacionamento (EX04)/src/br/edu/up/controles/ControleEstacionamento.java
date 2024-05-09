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

    public void executar() {
        int opcao;
        do {
            opcao = exibirMenu();
            switch (opcao) {
                case 1:
                    adicionarCarro();
                    break;
                case 2:
                    removerCarro();
                    break;
                case 3:
                    emitirRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
    }

    public int exibirMenu() {
        System.out.println("\n-- Menu do Estacionamento --");
        System.out.println("1- Adicionar carro");
        System.out.println("2- Remover carro");
        System.out.println("3- Emitir relatório");
        System.out.println("0- Sair ");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
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
