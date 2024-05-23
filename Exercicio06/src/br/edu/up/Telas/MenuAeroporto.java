package br.edu.up.Telas;
import java.util.Scanner;
import br.edu.up.Modelos.*;

import br.edu.up.Controle.ControleAeroporto;

public class MenuAeroporto {
    
    private ControleAeroporto controleAeroporto;
    private Scanner scanner;

    public MenuAeroporto(){
        this.controleAeroporto  = new ControleAeroporto();
        this.scanner = new Scanner(System.in);
    }

    public void executar(){

        iniciarMenu();

        System.out.println("Você deseja registrar um passageiro(a), comandante ou comissário(a)?\n1 - Passageiro(a)\n2 - Comandante\n3 - Comissario(a)\n: ");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                int res = registrarPassageiro();
                if (res == 1){
                    System.out.println("Passageiro registrado com sucesso!");
                }
                break;

            case 2:
                res = registrarComandante();
                if (res == 1){
                    System.out.println("Comandante registrado com sucesso!");
                }
                break;

            case 3:
                res = registrarComissario();
                if (res == 1){
                    System.out.println("Passageiro registrado com sucesso!");
                }
                break;
        }
        scanner.close();
    }

    public void iniciarMenu(){
        System.out.println("Bem vindo ao menu do aeroporto!");

        System.out.println("Digite o codigo da aeronave: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o tipo da aeronave: ");
        String tipo = scanner.nextLine();

        System.out.println("Digite a quantidade de assentos: ");
        int qtdAsse = scanner.nextInt();

        controleAeroporto.setAeronave(codigo, tipo, qtdAsse);
    }

    public int registrarPassageiro(){
        System.out.println("Vamos registrar um(a) passageiro(a)!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        int rg = scanner.nextInt();

        System.out.println("Digite o id de sua bagagem: ");
        int idBagagem = scanner.nextInt();

        System.out.println("Digite o id de sua passagem: ");
        int idPassagem = scanner.nextInt();

        System.out.println("Digite o número de seu assento: ");
        int numAssento = scanner.nextInt();

        System.out.println("Digite a classe do assento: ");
        String classe = scanner.nextLine();

        System.out.println("Digite a data do voo: ");
        int data = scanner.nextInt();

        controleAeroporto.registrarPassageiroControle(nome, rg, idBagagem, idPassagem, numAssento, classe, data);

        return 1;
    }

    public int registrarComandante(){
        System.out.println("Vamos registrar um(a) comandante!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        int rg = scanner.nextInt();
        
        System.out.println("Digite o id da aeronautica: ");
        int idAeronautica = scanner.nextInt();

        System.out.println("Digite a matricula de funcionário: ");
        int matriculaFuncionario = scanner.nextInt();

        System.out.println("Digite o total de horas de voo: ");
        int totalHorasVoo = scanner.nextInt();

        controleAeroporto.registrarComandanteControle(nome, rg, idAeronautica, matriculaFuncionario, totalHorasVoo);

        return 1;
    }

    public int registrarComissario(){
        System.out.println("Vamos registrar um(a) comissário(a)!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        int rg = scanner.nextInt();

        System.out.println("Digite o id da aeronautica: ");
        int idAeronautica = scanner.nextInt();

        System.out.println("Digite a matricula de funcionário: ");
        int matriculaFuncionario = scanner.nextInt();

        System.out.println("Digite os idiomas em que é fluente: ");
        String idiomasFluente = scanner.nextLine();

        controleAeroporto.registrarComissarioControle(nome, rg, idAeronautica, matriculaFuncionario, idiomasFluente);

        return 1;
    }

}
