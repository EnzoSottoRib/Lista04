package controles;

import modelos.Evento;
import modelos.Reserva;

public class Controle {

    Evento listaEventos[] = new Evento[100];
    Reserva listaReservas[] = new Reserva[100];
    int iE = 0;
    int iR = 0;

    public Evento[] getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(Evento[] listaEventos) {
        this.listaEventos = listaEventos;
    }

    public Reserva[] getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Reserva[] listaReservas) {
        this.listaReservas = listaReservas;
    }

    public int getiE() {
        return iE;
    }

    public void incrementariE() {
        iE++;
    }

    public void setiE(int iE) {
        this.iE = iE;
    }

    public int getiR() {
        return iR;
    }

    public void setiR(int iR) {
        this.iR = iR;
    }

    public Evento criarEvento(String nomeEvento, String dataEvento, int horaEvento, String localEvento, int lotacaoMax, int ingressosVendidos, double precoIngresso) {
        Evento evento = new Evento();
    
        evento.setNomeEvento(nomeEvento);
    
        String[] data = dataEvento.split("/");
        if (data.length == 3) {
            try {
                int dia = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int ano = Integer.parseInt(data[2]);
    
                evento.setDia(dia);
                evento.setMes(mes);
                evento.setAno(ano);
            } catch (NumberFormatException e) {
                return null; 
            }
        } else {
            return null; 
        }
    
        if (horaEvento >= 0 && horaEvento <= 24) {
            evento.setHora(horaEvento);
        } else {
            return null; 
        }
    
        evento.setLocalEvento(localEvento);
        evento.setLotacaoMax(lotacaoMax);
        evento.setIngressosVendidos(ingressosVendidos);
        evento.setPrecoIngresso(precoIngresso);
    
        return evento;
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
