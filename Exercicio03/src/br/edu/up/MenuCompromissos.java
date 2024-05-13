package br.edu.up;

public class MenuCompromissos {

    private Ano ano;

    public void exibirMenu() {

        int anoAtual = Prompt.lerInteiro("Informe o ano atual: ");
        String b = Prompt.lerLinha("O ano é bissexto? (S/N): ");
        boolean bissexto = false;
        
        if (b.equalsIgnoreCase("s")) {
            bissexto = true;
        }

        Mes meses[] = new Mes[12];
        ano = new Ano(anoAtual, bissexto);

        meses[0] = new Mes(31, "Janeiro");
        ano.adicionarMes(meses[0], 0);
        if (bissexto) {
            meses[1] = new Mes(29, "Fevereiro");
        } else {
            meses[1] = new Mes(28, "Fevereiro");
        }
        ano.adicionarMes(meses[1], 1);
        meses[2] = new Mes(31, "Março");
        ano.adicionarMes(meses[2], 2);
        meses[3] = new Mes(30, "Abril");
        ano.adicionarMes(meses[3], 3);
        meses[4] = new Mes(31, "Maio");
        ano.adicionarMes(meses[4], 4);
        meses[5] = new Mes(30, "Junho");
        ano.adicionarMes(meses[5], 5);
        meses[6] = new Mes(31, "Julho");
        ano.adicionarMes(meses[6], 6);
        meses[7] = new Mes(31, "Agosto");
        ano.adicionarMes(meses[7], 7);
        meses[8] = new Mes(30, "Setembro");
        ano.adicionarMes(meses[8], 8);
        meses[9] = new Mes(31, "Outubro");
        ano.adicionarMes(meses[9], 9);
        meses[10] = new Mes(30, "Novembro");
        ano.adicionarMes(meses[10], 10);
        meses[11] = new Mes(31, "Dezembro");
        ano.adicionarMes(meses[11], 11);

        int opcao;

        do {
            Prompt.imprimir("\nMenu de Compromissos");
            Prompt.imprimir("1. Adicionar Compromisso");
            Prompt.imprimir("2. Listar Compromissos do Dia");
            Prompt.imprimir("3. Listar Compromissos do Mês");
            Prompt.imprimir("4. Excluir Compromisso");
            Prompt.imprimir("0. Sair");
            opcao = Prompt.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1: adicionarCompromisso(); break;
                case 2: listarCompromissosDia(); break;
                case 3: listarCompromissosMes(); break;
                case 4: excluirCompromisso(); break;
                case 0: Prompt.imprimir("Saindo do Menu."); break;
                default: Prompt.imprimir("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void adicionarCompromisso() {

        int mes = Prompt.lerInteiro("Informe o mês (1 a 12): ");
        int dia = Prompt.lerInteiro("Informe o dia do mês: ");

        String pessoa = Prompt.lerLinha("Informe a pessoa: ");
        String local = Prompt.lerLinha("Informe o local: ");
        String assunto = Prompt.lerLinha("Informe o assunto: ");
        int hora = Prompt.lerInteiro("Informe a hora (0 a 23): ");

        Compromisso comp = new Compromisso(pessoa, local, assunto, hora);

        ano.meses[mes-1].adicionarCompromisso(comp, dia);

        Prompt.imprimir("Compromisso adicionado com sucesso!");

    }

    private void listarCompromissosDia() {

        int mes = Prompt.lerInteiro("Informe o mês (1 a 12): ");
        int dia = Prompt.lerInteiro("Informe o dia do mês: ");

        String compromissos = ano.meses[mes-1].listarCompromissos(dia);
        Prompt.imprimir("Compromissos do dia " + dia + "/" + mes + "/" + ano + ":");
        Prompt.imprimir(compromissos);
    }

    private void listarCompromissosMes() {
        String nomeMes = Prompt.lerLinha("Digite o nome do mês: ");

        String compromissos = ano.listarCompromissos(nomeMes);
        Prompt.imprimir("Compromissos do mês " + nomeMes + ":");
        Prompt.imprimir(compromissos);
    }

    private void excluirCompromisso() {
        String nomeMes = Prompt.lerLinha("Digite o nome do mês: ");
        int dia = Prompt.lerInteiro("Informe o dia do mês: ");
        int hora = Prompt.lerInteiro("Informe a hora do compromisso a excluir (0 a 23): ");

        ano.excluirCompromisso(nomeMes, dia, hora);
        Prompt.imprimir("Compromisso excluído com sucesso!");
    }
}

