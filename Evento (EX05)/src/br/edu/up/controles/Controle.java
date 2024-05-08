package br.edu.up.controles;
import java.util.List;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;

public class Controle {

    private List<Evento> listaEventos;
    private List<Reserva> listaReservas;

    public void criarEvento() {

        Evento evento = new Evento();

        evento.setNomeEvento(Prompt.lerLinha("Digite o nome do evento: "));
        
        String input = Prompt.lerLinha("Digite a data do evento seguindo o formato DD/MM/AAAA: ");
        String[] data = input.split("/");
        // ana: o split divide o vetor String em várias partes, ou seja: de "19/04/2005", nós vamos para "19", "04", "2005"

        if (data.length == 3) {
            try {
                int dia = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int ano = Integer.parseInt(data[2]);
                // ana: o parseInt transforma um String em int!

                evento.setDia(dia);
                evento.setMes(mes);
                evento.setAno(ano);
            } catch (NumberFormatException e) {
                // ana: encontra exceções / partes erradas no input do usuário
                Prompt.imprimir("Formato inválido. Por favor escreva a data no formato DD/MM/AAAA: ");
            }
        } else {
            Prompt.imprimir("Formato inválido. Por favor escreva a data no formato DD/MM/AAAA: ");
        }

        do {
            evento.setHora(Prompt.lerInteiro("Digite o horário no formato 24H: "));
        } while  (evento.getHora() < 0 && evento.getHora() > 24);

        evento.setLocalEvento(Prompt.lerLinha("Digite o local do evento: "));
        evento.setLotacaoMax(Prompt.lerInteiro("Digite a lotação máxima: "));
        evento.setIngressosVendidos(Prompt.lerInteiro("Digite a quantidade de ingressos vendidos: "));
        evento.setPrecoIngresso(Prompt.lerDecimal("Digite o preço individual dos ingressos, em reais: "));
    
        listaEventos.add(evento);
    
    }

    public void editarNome(int b) {
        listaEventos.get(b-1).setNomeEvento(Prompt.lerLinha("Digite o nome atualizado do evento: "));
    }

    public void editarLocal(int b) {
        listaEventos.get(b-1).setLocalEvento(Prompt.lerLinha("Digite o novo local do evento: "));
    }

    public void editarHora(int b) {
        do {
            listaEventos.get(b-1).setHora(Prompt.lerInteiro("Digite o horário no formato 24H: "));
        } while  (listaEventos.get(b-1).getHora() < 0 && listaEventos.get(b-1).getHora() > 24);
    }

    public void editarDia(int b) {
        listaEventos.get(b-1).setDia(Prompt.lerInteiro("Digite o novo dia (seu número, no formato 'DD'): "));
    }

    public void editarMes(int b) {
        listaEventos.get(b-1).setMes(Prompt.lerInteiro("Digite o novo mês (seu número, no formato 'MM'): "));
    }

    public void editarAno(int b) {
        listaEventos.get(b-1).setAno(Prompt.lerInteiro("Digite o novo ano (seu número, no formato 'AAAA'): "));
    }

    public void editarLotacaoMax(int b) {
        listaEventos.get(b-1).setLotacaoMax(Prompt.lerInteiro("Digite a nova lotação máxima: "));
    }

    public void editarIngressosVendidos (int b) {
        listaEventos.get(b-1).setIngressosVendidos(Prompt.lerInteiro("Digite a nova quantidade de ingressos vendidos: "));
    }

    public void editarPrecoIngressos (int b) {
        listaEventos.get(b-1).setPrecoIngresso(Prompt.lerDecimal("Digite o novo preço do ingresso, em reais: "));
    }

    public void excluirEvento(int b) {
        listaEventos.remove(listaEventos.get(b-1));
    }

    public String listarEvento() {
        if (listaEventos.isEmpty()) {
            return "Não há eventos listados.";
        } else {
            StringBuilder sb = new StringBuilder();
            int index = 0; 
    
            for (Evento evento : listaEventos) {
                sb.append("Evento ").append(index).append(":\n");
                sb.append(evento.toString()).append("\n");
                index++;
            }
    
            return sb.toString(); 
        }
    }

    public void criarReserva() {

        Reserva reserva = new Reserva();

        int n = selecionarEvento();

        reserva.setAno(listaEventos.get(n-1).getAno());
        reserva.setMes(listaEventos.get(n-1).getMes());
        reserva.setDia(listaEventos.get(n-1).getDia());
        reserva.setHora(listaEventos.get(n-1).getHora());
        reserva.setPrecoIngresso(listaEventos.get(n-1).getPrecoIngresso());

        reserva.setNomeResponsavel(Prompt.lerLinha("Digite o nome do responsável: "));
        reserva.setQtdePessoas(Prompt.lerInteiro("Digite a quantidade de pessoas: "));

        listaReservas.add(reserva);

    }

    public void editarNomeResponsavel(int b) {
        listaReservas.get(b-1).setNomeResponsavel(Prompt.lerLinha("Digite o nome do responsável: "));
    }

    public void editarQtdePessoas(int b) {
        listaReservas.get(b-1).setQtdePessoas(Prompt.lerInteiro("Digite a quantidade de pessoas: "));
    }

    public void excluirReserva(int b) {
        listaReservas.remove(listaReservas.get(b-1));
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

    public int selecionarEvento() {

        Prompt.imprimir("Os seguintes eventos existem: ");
        listarEvento();
        int a = Prompt.lerInteiro("Defina o número de seu evento: ");

        return a;
    }
    
}
