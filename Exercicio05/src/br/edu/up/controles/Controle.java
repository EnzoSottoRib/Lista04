package controles;

import modelos.Evento;
import modelos.Reserva;

public class Controle {

    Evento listaEventos[] = new Evento[100];
    Reserva listaReservas[] = new Reserva[100];
    int iE = 0;
    int iR = 0;

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
    
        listaEventos[iE] = evento;
        iE++;
    
    }

    public void editarNome(int b) {
        listaEventos[b].setNomeEvento(Prompt.lerLinha("Digite o nome atualizado do evento: "));
    }

    public void editarLocal(int b) {
        listaEventos[b].setLocalEvento(Prompt.lerLinha("Digite o novo local do evento: "));
    }

    public void editarHora(int b) {
        do {
            listaEventos[b].setHora(Prompt.lerInteiro("Digite o horário no formato 24H: "));
        } while  (listaEventos[b].getHora() < 0 && listaEventos[b].getHora() > 24);
    }

    public void editarDia(int b) {
        listaEventos[b].setDia(Prompt.lerInteiro("Digite o novo dia (seu número, no formato 'DD'): "));
    }

    public void editarMes(int b) {
        listaEventos[b].setMes(Prompt.lerInteiro("Digite o novo mês (seu número, no formato 'MM'): "));
    }

    public void editarAno(int b) {
        listaEventos[b].setAno(Prompt.lerInteiro("Digite o novo ano (seu número, no formato 'AAAA'): "));
    }

    public void editarLotacaoMax(int b) {
        listaEventos[b].setLotacaoMax(Prompt.lerInteiro("Digite a nova lotação máxima: "));
    }

    public void editarIngressosVendidos (int b) {
        listaEventos[b].setIngressosVendidos(Prompt.lerInteiro("Digite a nova quantidade de ingressos vendidos: "));
    }

    public void editarPrecoIngressos (int b) {
        listaEventos[b].setPrecoIngresso(Prompt.lerDecimal("Digite o novo preço do ingresso, em reais: "));
    }

    public void excluirEvento(int b) {
        listaEventos[b] = null;
    }

    public String listarEvento() {
        if (listaEventos == null) {
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

        reserva.setAno(listaEventos[n].getAno());
        reserva.setMes(listaEventos[n].getMes());
        reserva.setDia(listaEventos[n].getDia());
        reserva.setHora(listaEventos[n].getHora());
        reserva.setPrecoIngresso(listaEventos[n].getPrecoIngresso());

        reserva.setNomeResponsavel(Prompt.lerLinha("Digite o nome do responsável: "));
        do {
            reserva.setQtdePessoas(Prompt.lerInteiro("Digite a quantidade de pessoas: "));
            if (listaEventos[n].getLotacaoMax() > (listaEventos[n].getIngressosVendidos() + reserva.getQtdePessoas())) {
                Prompt.imprimir("Não há ingressos suficientes.");
            }
        } while (listaEventos[n].getLotacaoMax() <= (listaEventos[n].getIngressosVendidos() + reserva.getQtdePessoas()));

        reserva.setValorTotal(listaEventos[n].getPrecoIngresso() * reserva.getQtdePessoas());
        
        listaReservas[iR] = reserva;
        iR++;
    }        

    public void editarNomeResponsavel(int b) {
        listaReservas[b].setNomeResponsavel(Prompt.lerLinha("Digite o nome do responsável: "));
    }

    public void editarQtdePessoas(int b) {
        listaReservas[b].setQtdePessoas(Prompt.lerInteiro("Digite a quantidade de pessoas: "));
    }

    public void excluirReserva(int b) {
        listaReservas[b] = null;
    }

    public String listarReserva() {
        if (listaReservas == null) {
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

    public int selecionarReserva() {

        Prompt.imprimir("As seguintes reservas existem: ");
        listarReserva();
        int a = Prompt.lerInteiro("Defina o número de sua reserva: ");

        return a;
    }
    
}
