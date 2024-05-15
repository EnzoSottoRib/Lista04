package br.edu.up.Controle;

import java.util.Scanner;
import br.edu.up.Modelos.*;

public class ControleAeroporto {

    Scanner scanner = new Scanner(System.in);
        Aeronave aeronave = new Aeronave();
        Passageiro passageiro = new Passageiro();
        Passagem passagem = new Passagem();
        Comandante comandante = new Comandante();
        Comissario comissario = new Comissario();

    public void iniciarMenu(){
        System.out.println("Bem vindo ao menu do aeroporto!");

        System.out.println("Digite o codigo da aeronave: ");
        int codigo = scanner.nextInt();
        aeronave.setCodigoAeronave(codigo);

        System.out.println("Digite o tipo da aeronave: ");
        String tipo = scanner.nextLine();
        aeronave.setTipoAeronave(tipo);

        System.out.println("Digite a quantidade de assentos: ");
        int qtdAsse = scanner.nextInt();
        aeronave.setQtdAssentos(qtdAsse);
    }

    public void registrarPassageiro(){
        System.out.println("Vamos registrar um(a) passageiro(a)!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        passageiro.setNome(nome);

        System.out.println("Digite seu RG: ");
        int rg = scanner.nextInt();
        passageiro.setRg(rg);

        passageiro.setCodigoAeronave(aeronave.getCodigoAeronave());

        System.out.println("Digite o id de sua bagagem: ");
        int idBagagem = scanner.nextInt();
        passageiro.setIdBagagem(idBagagem);

        System.out.println("Digite o id de sua passagem: ");
        int idPassagem = scanner.nextInt();
        passageiro.setIdPassagem(idPassagem);
        passagem.setIdPassagem(idPassagem);

        System.out.println("Digite o número de seu assento: ");
        int numAssento = scanner.nextInt();
        passagem.setNumAssentos(numAssento);

        System.out.println("Digite a classe do assento: ");
        String classe = scanner.nextLine();
        passagem.setClasseAssento(classe);

        System.out.println("Digite a data do voo: ");
        int data = scanner.nextInt();
        passagem.setDataVoo(data);

        System.out.println("Passageiro registrado com sucesso!");
    }

    public void registrarComandante(){
        System.out.println("Vamos registrar um(a) comandante!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        comandante.setNome(nome);

        System.out.println("Digite seu RG: ");
        int rg = scanner.nextInt();
        comandante.setRg(rg);

        comandante.setCodigoAeronave(aeronave.getCodigoAeronave());
        
        System.out.println("Digite o id da aeronautica: ");
        int idAeronautica = scanner.nextInt();
        comandante.setIdAeronautica(idAeronautica);

        System.out.println("Digite a matricula de funcionário: ");
        int matriculaFuncionario = scanner.nextInt();
        comandante.setMatriculaFuncionario(matriculaFuncionario);

        System.out.println("Digite o total de horas de voo: ");
        int totalHorasVoo = scanner.nextInt();
        comandante.setTotalHorasVoo(totalHorasVoo);

        System.out.println("Comandante registrado com sucesso!");
    }

    public void registrarComissario(){
        System.out.println("Vamos registrar um(a) comissário(a)!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        comissario.setNome(nome);

        System.out.println("Digite seu RG: ");
        int rg = scanner.nextInt();
        comissario.setRg(rg);

        comissario.setCodigoAeronave(aeronave.getCodigoAeronave());

        System.out.println("Digite o id da aeronautica: ");
        int idAeronautica = scanner.nextInt();
        comissario.setIdAeronautica(idAeronautica);

        System.out.println("Digite a matricula de funcionário: ");
        int matriculaFuncionario = scanner.nextInt();
        comissario.setMatriculaFuncionario(matriculaFuncionario);

        System.out.println("Digite os idiomas em que é fluente: ");
        String idiomasFluente = scanner.nextLine();
        comissario.setIdiomasFluente(idiomasFluente);

        System.out.println("Comissario(a) registrado(a) com sucesso!");
    }
}
