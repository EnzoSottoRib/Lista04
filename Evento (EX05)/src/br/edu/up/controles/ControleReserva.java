package br.edu.up.controles;

import br.edu.up.modelos.Reserva;
import java.util.List;
import br.edu.up.modelos.Evento;
import br.edu.up.controles.ControleEvento;

public class ControleReserva {

    private List<Reserva> listaReservas;
     
    public void criarReserva(Reserva reserva, Evento evento) {

        reserva.setNomeResponsavel(Prompt.lerLinha("Digite o nome do responsável: "));
        reserva.setQtdePessoas(Prompt.lerInteiro("Digite a quantidade de pessoas: "));

        listaReservas.add(reserva);

    }

    public void excluirReserva(Reserva reserva) {
        listaReservas.remove(reserva);
    }

    public String listarReserva() {
        if (listaReservas.isEmpty()) {
            return "Não há reservas.";
        } else {
            StringBuilder sb = new StringBuilder();
    
            for (Reserva reserva : listaReservas) {
                sb.append(reserva.toString()).append("\n");
            }
    
            return sb.toString(); 
        }
    }
       
}
