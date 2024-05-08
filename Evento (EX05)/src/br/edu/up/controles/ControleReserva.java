package br.edu.up.controles;

import br.edu.up.modelos.Reserva;
import java.util.List;
import br.edu.up.modelos.Evento;

public class ControleReserva {

    private List<Reserva> listaReservas;
     
    public void criarReserva(Reserva reserva) {
        
        String input = Prompt.lerLinha("Digite a data da reserva seguindo o formato DD/MM/AAAA: ");
        String[] data = input.split("/");

        if (data.length == 3) {
            try {
                int dia = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int ano = Integer.parseInt(data[2]);

                reserva.setDia(dia);
                reserva.setMes(mes);
                reserva.setAno(ano);
            } catch (NumberFormatException e) {
                Prompt.imprimir("Formato inválido. Por favor escreva a data no formato DD/MM/AAAA: ");
            }
        } else {
            Prompt.imprimir("Formato inválido. Por favor escreva a data no formato DD/MM/AAAA: ");
        }

        do {
            reserva.setHora(Prompt.lerInteiro("Digite o horário no formato 24H: "));
        } while  (reserva.getHora() < 0 && reserva.getHora() > 24);

        reserva.setNomeResponsavel(Prompt.lerLinha("Digite o nome do responsável: "));
        reserva.setQtdePessoas(Prompt.lerInteiro("Digite a quantidade de pessoas: "));

        listaReservas.add(reserva);

    }

    public void excluirReserva(Reserva reserva) {
        reserva = null;
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
