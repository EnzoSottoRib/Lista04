package br.edu.up.telas;

import br.edu.up.controles.Controle;

public class Menu {
    
    Controle controle = new Controle();
    int n = 1;

    public void executar() {

    do {
        n = Prompt.lerInteiro("Digite:\n1: Para criar um evento\n2: Para criar uma reserva\n3: Para alterar um evento\n4: Para alterar uma reserva\n5: Para listar os eventos existentes\n6: Para listar as reservas existentes\n7: Para excluir um evento\n8: Para excluir uma reserva\n0: Para sair");

        if (n == 1) {
            controle.criarEvento();
        }

        if (n == 2) {
            controle.criarReserva();
        }

        if (n == 3) {
        
        int a = controle.selecionarEvento();
        int b = 1;

        do {
            b = Prompt.lerInteiro("Digite:\n1: Editar nome\n2: Editar local:\n3: Editar hora\n4: Editar dia\n5: Editar mes\n6: Editar ano\n7: Editar lotação máxima\n8: Editar ingressos vendidos\n9: Editar preço ingressos\n0: Sair");

            switch (b) {
                case 1 : controle.editarNome(a); break;
                case 2 : controle.editarLocal(a); break;
                case 3 : controle.editarHora(a); break;
                case 4 : controle.editarDia(a); break;
                case 5 : controle.editarMes(a); break;
                case 6 : controle.editarAno(a); break;
                case 7 : controle.editarLotacaoMax(a); break;
                case 8 : controle.editarIngressosVendidos(a); break;
                case 9 : controle.editarPrecoIngressos(a); break;
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
            controle.listarEvento();
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
