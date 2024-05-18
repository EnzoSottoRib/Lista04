package telas;

import controles.Controle;
import modelos.*;

public class Menu {
    
    Controle controle = new Controle();
    int n = 1;

    public void executar() {

    do {
        n = Prompt.lerInteiro("Digite:\n1: Para criar um evento\n2: Para criar uma reserva\n3: Para alterar um evento\n4: Para alterar uma reserva\n5: Para listar os eventos existentes\n6: Para listar as reservas existentes\n7: Para excluir um evento\n8: Para excluir uma reserva\n0: Para sair");

        if (n == 1) {
            String nomeEvento = Prompt.lerLinha("Digite o nome do evento: ");
            String dataEvento = Prompt.lerLinha("Digite a data do evento seguindo o formato DD/MM/AAAA: ");
            int horaEvento;

            do {
               horaEvento = Prompt.lerInteiro("Digite o horário no formato 24H: ");
            } while (horaEvento < 0 || horaEvento > 24);

            String localEvento = Prompt.lerLinha("Digite o local do evento: ");
            int lotacaoMax = Prompt.lerInteiro("Digite a lotação máxima: ");
            int ingressosVendidos = Prompt.lerInteiro("Digite a quantidade de ingressos vendidos: ");
            double precoIngresso = Prompt.lerDecimal("Digite o preço individual dos ingressos, em reais: ");

            Evento eventoCriado = controle.criarEvento(nomeEvento, dataEvento, horaEvento, localEvento, lotacaoMax, ingressosVendidos, precoIngresso);
                if (eventoCriado != null) {
                    controle.getListaEventos()[controle.getiE()] = eventoCriado;
                    controle.incrementariE();
                } else {
                    Prompt.imprimir("Erro ao criar o evento. Verifique os dados inseridos.");
                }

        }

        if (n == 2) {
            if (controle.getListaEventos() == null) {
                Prompt.imprimir("Não há eventos listados.");
            } else {
                Prompt.imprimir("Os seguintes eventos existem: ");
                StringBuilder sb = new StringBuilder();
                int index = 0; 
        
                for (Evento evento : controle.getListaEventos()) {
                    sb.append("Evento ").append(index).append(":\n");
                    sb.append(evento.toString()).append("\n");
                    index++;
                }
            }

            int a = Prompt.lerInteiro("Defina o número de seu evento: ");
            String nomeResponsavel = Prompt.lerLinha("Digite o nome do responsável: ");
            int qtdePessoas = 0;
            do {
                qtdePessoas = Prompt.lerInteiro("Digite a quantidade de pessoas: ");
                if (controle.getListaEventos()[n].getLotacaoMax() > (controle.getListaEventos()[n].getIngressosVendidos() + qtdePessoas)) {
                    Prompt.imprimir("Não há ingressos suficientes.");
                }
            } while (controle.getListaEventos()[n].getLotacaoMax() <= (controle.getListaEventos()[n].getIngressosVendidos() + qtdePessoas));

            Reserva reservaCriada = controle.criarReserva(a, nomeResponsavel, qtdePessoas);
            if (reservaCriada != null) {
                controle.getListaReservas()[controle.getiR()] = reservaCriada;
                controle.incrementariR();
            } else {
                Prompt.imprimir("Erro ao criar a reserva. Verifique os dados inseridos.");
            }
        }

        if (n == 3) {
            if (controle.getListaEventos() == null) {
                Prompt.imprimir("Não há eventos listados.");
            } else {
                Prompt.imprimir("Os seguintes eventos existem: ");
                StringBuilder sb = new StringBuilder();
                int index = 0; 
            
                for (Evento evento : controle.getListaEventos()) {
                    sb.append("Evento ").append(index).append(":\n");
                    sb.append(evento.toString()).append("\n");
                    index++;
                }
            }
            int a = Prompt.lerInteiro("Defina o número de seu evento: ");
            int b = 1;

        do {
            b = Prompt.lerInteiro("Digite:\n1: Editar nome\n2: Editar local:\n3: Editar hora\n4: Editar dia\n5: Editar mes\n6: Editar ano\n7: Editar lotação máxima\n8: Editar ingressos vendidos\n9: Editar preço ingressos\n0: Sair");

            switch (b) {
                case 1 : 
                String editarNome = Prompt.lerLinha("Digite o nome atualizado do evento: ");
                controle.editarNome(a, editarNome); break;
                case 2 : 
                String editarLocal = Prompt.lerLinha("Digite o novo local do evento: ");
                controle.editarLocal(a, editarLocal); break;
                case 3 : 
                int editarHora = 0;
                do {
                    editarHora = Prompt.lerInteiro("Digite o horário no formato 24H: ");
                } while  (editarHora < 0 && editarHora > 24);
                controle.editarHora(a, editarHora); break;
                case 4 : 
                int editarDia = Prompt.lerInteiro("Digite o novo dia (seu número, no formato 'DD'): ");
                controle.editarDia(a, editarDia); break;
                case 5 : 
                int editarMes = Prompt.lerInteiro("Digite o novo mês (seu número, no formato 'MM'): ");
                controle.editarMes(a, editarMes); break;
                case 6 : 
                int editarAno = Prompt.lerInteiro("Digite o novo ano (seu número, no formato 'AAAA'): ");
                controle.editarAno(a, editarAno); break;
                case 7 : 
                int lotacaoMax = Prompt.lerInteiro("Digite a nova lotação máxima: ");
                controle.editarLotacaoMax(a, lotacaoMax); break;
                case 8 : 
                int editarIngressosVendidos = Prompt.lerInteiro("Digite a nova quantidade de ingressos vendidos: ");
                controle.editarIngressosVendidos(a, editarIngressosVendidos); break;
                case 9 : 
                double editarPrecoIngressos = Prompt.lerDecimal("Digite o novo preço do ingresso, em reais: ");
                controle.editarPrecoIngressos(a, editarPrecoIngressos); break;
                case 0 : Prompt.imprimir("Saindo\n"); break;
                default : Prompt.imprimir("Dígito inválido!\n");
            }
        } while (b != 0);
        }

        if (n == 4) {

            int c = controle.selecionarEvento();
            int d = 1;

            do {
                d = Prompt.lerInteiro("Digite:\n1: Editar Nome Responsável\n2: Editar Quantidade de Pessoas\n0: Sair\n");

                switch (d) {
                    case 1 : controle.editarNomeResponsavel(c); break;
                    case 2 : controle.editarQtdePessoas(c); break;
                    case 0 : Prompt.imprimir("Saindo\n"); break;
                    default : Prompt.imprimir("Dígito inválido!\n"); break;
                }
            } while (d != 0);
        }

        if (n == 5) {
            if (controle.getListaEventos() == null) {
                Prompt.imprimir("Não há eventos listados.");
            } else {
                Prompt.imprimir("Os seguintes eventos existem: ");
                StringBuilder sb = new StringBuilder();
                int index = 0; 
        
                for (Evento evento : controle.getListaEventos()) {
                    sb.append("Evento ").append(index).append(":\n");
                    sb.append(evento.toString()).append("\n");
                    index++;
                }
            }
        }

        if (n == 6) {
            controle.listarReserva();
        }
        
        if (n == 7) {
            int f = controle.selecionarEvento();
            controle.excluirEvento(f);
        }

        if (n == 8) {
            int f = controle.selecionarReserva();
            controle.excluirReserva(f);
        }

    } while (n != 0);

}

}
