package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.ControleEstacionamento;

public class MenuEstacionamento {

    private static ControleEstacionamento controle = new ControleEstacionamento();
    

    public void executar() {

        Scanner scanner = new Scanner(System.in);
        int a = 1;
        
        do {
            System.out.println("\n-- Menu do Estacionamento --");
            System.out.println("1- Adicionar carro");
            System.out.println("2- Remover carro");
            System.out.println("3- Emitir relatório");
            System.out.println("0- Sair ");
            System.out.print("Escolha uma opção: ");

            a = scanner.nextInt();

            switch (a) {
                case 1:
                    controle.adicionarCarro();
                    break;
                case 2:
                    controle.removerCarro();
                    break;
                case 3:
                    controle.emitirRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (a != 0);
    }
}
