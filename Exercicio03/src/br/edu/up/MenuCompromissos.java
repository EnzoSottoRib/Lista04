package br.edu.up;
import java.util.Scanner;

public class MenuCompromissos {

    private Ano ano;

    public MenuCompromissos(Ano ano) {
        this.ano = ano;
    }

    public void exibirMenu() {

        int opcao;

        do {
            Prompt.imprimir("\nMenu de Compromissos");
            Prompt.imprimir("1. Adicionar Compromisso");
            Prompt.imprimir("2. Listar Compromissos do Dia");
            Prompt.imprimir("3. Excluir Compromisso");
            Prompt.imprimir("0. Sair");
            opcao = Prompt.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1: adicionarCompromisso(); break;
                case 2: listarCompromissosDia(); break;
                case 3: excluirCompromisso(); break;
                case 0: Prompt.imprimir("Saindo do Menu."); break;
                default: Prompt.imprimir("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void adicionarCompromisso() {

        int ano = Prompt.lerInteiro("Informe o ano: ");
        int mes = Prompt.lerInteiro("Informe o mês (1 a 12): ");
        int dia = Prompt.lerInteiro("Informe o dia do mês: ");

        String pessoa = Prompt.lerLinha("Informe a pessoa: ");
        String local = Prompt.lerLinha("Informe o local: ");
        String assunto = Prompt.lerLinha("Informe o assunto: ");
        int hora = Prompt.lerInteiro("Informe a hora (0 a 23): ");

        Compromisso comp = new Compromisso(pessoa, local, assunto, hora);

        ano.adicionarCompromisso(comp, mes, dia);
        Prompt.imprimir("Compromisso adicionado com sucesso!");

    }

    private void listarCompromissosDia() {
        int ano = Prompt.lerInteiro("Informe o ano: ");
        int mes = Prompt.lerInteiro("Informe o mês (1 a 12): ");
        int dia = Prompt.lerInteiro("Informe o dia do mês: ");

        String compromissos = ano.listarCompromissos(mes, dia);
        Prompt.imprimir("Compromissos do dia " + dia + "/" + mes + "/" + ano + ":");
        Prompt.imprimir(compromissos);
    }

    private void excluirCompromisso() {
        int ano = Prompt.lerInteiro("Informe o ano: ");
        int mes = Prompt.lerInteiro("Informe o mês (1 a 12): ");
        int dia = Prompt.lerInteiro("Informe o dia do mês: ");

        int hora = Prompt.lerInteiro("Informe a hora do compromisso a excluir (0 a 23): ");

        ano.excluirCompromisso(mes, dia, hora);
        Prompt.imprimir("Compromisso excluído com sucesso!");
    }
}

