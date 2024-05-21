package edu.up.telas;

import java.util.Scanner;

import edu.up.controles.ControleEstacionamento;
import edu.up.modelos.Carro;

public class MenuEstacionamento {

    private static ControleEstacionamento controle = new ControleEstacionamento();
    
    Scanner scanner = new Scanner(System.in);

    public void executar() {
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
                    lerDadosCarro();
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

        } while (a != 0);
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

    private void removerCarro() {
        System.out.print("Digite a placa do carro para remoção: ");
        String placa = scanner.next();
        String resultado = controle.removerCarro(placa);
        System.out.println(resultado);
    }

    private void emitirRelatorio() {
        String relatorio = controle.emitirRelatorio();
        System.out.println(relatorio);
    }

    

}
