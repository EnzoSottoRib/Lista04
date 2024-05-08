package br.edu.up.telas;

import br.edu.up.controles.Controle;
import br.edu.up.modelos.Evento;

public class Menu {
    
    Controle controle = new Controle();

    do {
        int n = Prompt.lerInteiro("Digite:\n1: Para criar um evento\n2: Para criar uma reserva\n3: Para alterar um evento\n4: Para alterar uma reserva\n5: Para listar os eventos existentes\n6: Para listar as reservas existentes\n7: Para excluir um evento\n8: Para excluir uma reserva\n0: Para sair");

        if (n == 1) {
            controle.criarEvento();
        }

        if (n == 2) {
            controle.criarReserva();
        }

        if (n == 3) {
        
        Prompt.imprimir("Os seguintes eventos existem: ");
        controle.listarEvento();
        int a = Prompt.lerInteiro("Defina o número de seu evento: ");
        int b = 1;

        do {
            b = Prompt.lerInteiro("Digite:\n1: Editar nome\n2: Editar local:\n3: Editar hora\n4: Editar dia\n5: Editar mes\n6: Editar ano\n7: Editar lotação máxima\n8: Editar ingressos vendidos\n9: Editar preço ingressos\n0: Sair");

            switch (b) {
                case 1: controle.editarNome(null);
            }
        } while (b != 0);
        }
    } while (n != 0);

}
