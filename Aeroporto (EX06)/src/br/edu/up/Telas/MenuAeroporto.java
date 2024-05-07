package br.edu.up.Telas;

import java.util.Scanner;

import br.edu.up.Modelos.*;

public class MenuAeroporto{

    private Scanner scanner;

    public MenuAeroporto(){
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenu(){
        System.out.println("Bem vindo ao sistema de Tráfego Aéreo!\nO que deseja fazer?\n1 - Registrar Pessoas.\n");
        return scanner.nextInt();
    }

    public Pessoa registrarPessoa(){
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o RG: ");
        String rg = scanner.nextLine();
        System.out.println("Digite o código da aeronave: ");
        String codigoAeronave = scanner.nextLine();
        System.out.println("Digite o tipo da aeronave: ");
        String tipoAeronave = scanner.nextLine();
        System.out.println("Digite a quantidade de assentos: ");
        int quantidadeAssentos = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, rg, codigoAeronave, tipoAeronave, quantidadeAssentos);

        System.out.println("Que tipo de pessoa deseja registrar?\n1 - Passageiro\n2 - Tripulação");
        int resposta = scanner.nextInt();
        switch(resposta){
            case 1: 
                System.out.println("Digite o id da bagagem: ");
                String idBagagem = scanner.nextLine();
                System.out.println("Digite a passagem: ");
                String idPassagem = scanner.nextLine();
                System.out.println("Digite o número do assento: ");
                String numAssento = scanner.nextLine();
                System.out.println("Digite a classe do assento: ");
                String classeAssento = scanner.nextLine();
                System.out.println("Digite a data do voo: ");
                int dataVoo = scanner.nextInt();

                Passagem passagem = new Passagem(numAssento, classeAssento, dataVoo);

                Passageiro passageiro = new Passageiro(nome, rg, codigoAeronave, tipoAeronave, quantidadeAssentos, idBagagem, idPassagem);
                break;
            case 2:
            System.out.println("Digite o id da aeronáutica: ");
            String idAeronautica = scanner.nextLine();
            System.out.println("Digite a matrícula de funcionário: ");
            String matriculaFuncionario = scanner.nextLine();
            

        }
        
    }

    
}
