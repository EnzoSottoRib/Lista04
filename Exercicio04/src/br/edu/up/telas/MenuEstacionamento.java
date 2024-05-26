package edu.up.telas;

import edu.up.controles.ControleEstacionamento;

import java.util.Scanner;

public class MenuEstacionamento {

    private ControleEstacionamento controle;
    private Scanner scanner;

    public MenuEstacionamento() {
        controle = new ControleEstacionamento();
        scanner = new Scanner(System.in);
    }

    public void executar() {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

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
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n-- Menu do Estacionamento --");
        System.out.println("1- Adicionar carro");
        System.out.println("2- Remover carro");
        System.out.println("3- Emitir relatório");
        System.out.println("0- Sair ");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarCarro() {
        System.out.println("Informe o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.println("Informe a placa do carro: ");
        String placa = scanner.nextLine();
        System.out.println("Informe a cor do carro: ");
        String cor = scanner.nextLine();

        String resultado = controle.lerDadosCarro(modelo, placa, cor);
        System.out.println(resultado);
    }

    private void removerCarro() {
        System.out.println("Digite a placa do carro para remoção: ");
        String placa = scanner.nextLine();
        String resultado = controle.removerCarro(placa);
        System.out.println(resultado);
    }

    private void emitirRelatorio() {
        String relatorio = controle.emitirRelatorio();
        System.out.println(relatorio);
    }
}
