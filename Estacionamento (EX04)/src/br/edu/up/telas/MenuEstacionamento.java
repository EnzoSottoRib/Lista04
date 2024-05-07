package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.modelos.Carro;

public class MenuEstacionamento {
    private Scanner scanner;

    public MenuEstacionamento() {
        this.scanner = new Scanner(System.in);
    }
    

    public int exibirMenu(){
        System.out.println("\n-- Menu do Estacionamento --");
        System.out.println("1- Adicionar carro");
        System.out.println("2- Remover carro");
        System.out.println("3- Emitir relatório");
        System.out.println("0- Sair ");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Carro lerDadosCarro(){
        System.out.println("Informe o modelo do carro: ");
        String modelo = scanner.next();
        System.out.println("Informe a placa do carro: ");
        String placa = scanner.next();
        System.out.println("Informe a cor do carro: ");
        String cor = scanner.next();

        return new Carro(modelo, placa, cor);
    }

    public String lerPlaca(){
        System.out.print("Digite a placa do carro para remoção: ");
        String placaRemover = scanner.next();
        return placaRemover;
    }

}
