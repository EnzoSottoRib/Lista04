package br.edu.up.Telas;

import br.edu.up.Controle.ControleAeroporto;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuAeroporto {

    private ControleAeroporto controleAeroporto;
    private Scanner scanner;

    public MenuAeroporto() {
        this.controleAeroporto = new ControleAeroporto();
        this.scanner = new Scanner(System.in);
    }


    public void executar() {
        iniciarMenu();

        int opcao;

        do{
            System.out.println("--------------------------\nVocê deseja registrar um passageiro(a), comandante ou comissário(a)?\n1 - Passageiro(a)\n2 - Comandante\n3 - Comissário(a)\n0 - Sair ");
            opcao = scanner.nextInt();
            scanner.nextLine();
    
            switch (opcao) {
                case 1:
                    if (registrarPassageiro() == 1) {
                        System.out.println("Passageiro registrado com sucesso!");
                    }
                    break;
                case 2:
                    if (registrarComandante() == 1) {
                        System.out.println("Comandante registrado com sucesso!");
                    }
                    break;
                case 3:
                    if (registrarComissario() == 1) {
                        System.out.println("Comissário registrado com sucesso!");
                    }
                    break;
                case 0: 
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public void iniciarMenu() {
        System.out.println("Bem-vindo ao menu do aeroporto!");

        System.out.println("Digite o código da aeronave: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o tipo da aeronave: ");
        String tipo = scanner.nextLine();

        System.out.println("Digite a quantidade de assentos: ");
        int qtdAssentos = scanner.nextInt();
        scanner.nextLine();

        controleAeroporto.setAeronave(codigo, tipo, qtdAssentos);
    }

    public int registrarPassageiro() {
        System.out.println("Vamos registrar um(a) passageiro(a)!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        int rg = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o id de sua bagagem: ");
        int idBagagem = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o id de sua passagem: ");
        int idPassagem = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número de seu assento: ");
        int numAssento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a classe do assento: ");
        String classe = scanner.nextLine();

        System.out.println("Digite a data do voo (formato: AAAA-MM-DDTHH:MM): ");
        String data = scanner.nextLine();
        LocalDateTime dataVoo = LocalDateTime.parse(data);

        controleAeroporto.registrarPassageiroControle(nome, rg, idBagagem, idPassagem, numAssento, classe, dataVoo);

        return 1;
    }

    public int registrarComandante() {
        System.out.println("Vamos registrar um(a) comandante!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        int rg = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o id da aeronáutica: ");
        int idAeronautica = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a matrícula de funcionário: ");
        int matriculaFuncionario = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o total de horas de voo: ");
        int totalHorasVoo = scanner.nextInt();
        scanner.nextLine();

        controleAeroporto.registrarComandanteControle(nome, rg, idAeronautica, matriculaFuncionario, totalHorasVoo);

        return 1;
    }

    public int registrarComissario() {
        System.out.println("Vamos registrar um(a) comissário(a)!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        int rg = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o id da aeronáutica: ");
        int idAeronautica = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a matrícula de funcionário: ");
        int matriculaFuncionario = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite os idiomas em que é fluente: ");
        String idiomasFluente = scanner.nextLine();

        controleAeroporto.registrarComissarioControle(nome, rg, idAeronautica, matriculaFuncionario, idiomasFluente);

        return 1;
    }
}
