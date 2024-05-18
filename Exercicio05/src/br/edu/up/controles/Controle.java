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

    public void incrementariR() {
        iR++;
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

    public void editarNome(int b, String editarNome) {
        listaEventos[b].setNomeEvento(editarNome);
    }

    public void editarLocal(int b, String editarLocal) {
        listaEventos[b].setLocalEvento(editarLocal);
    }

    public void editarHora(int b, int editarHora) {
        listaEventos[b].setHora(editarHora);
    }

    public void editarDia(int b, int editarDia) {
        listaEventos[b].setDia(editarDia);
    }

    public void editarMes(int b, int editarMes) {
        listaEventos[b].setMes(editarMes);
    }

    public void editarAno(int b, int editarAno) {
        listaEventos[b].setAno(editarAno);
    }

    public void editarLotacaoMax(int b, int lotacaoMax) {
        listaEventos[b].setLotacaoMax(lotacaoMax);
    }

    public void editarIngressosVendidos (int b, int editarIngressosVendidos) {
        listaEventos[b].setIngressosVendidos(editarIngressosVendidos);
    }

    public void editarPrecoIngressos (int b, double editarPrecoIngressos) {
        listaEventos[b].setPrecoIngresso(editarPrecoIngressos);
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

    public Reserva criarReserva(int n, String nomeResponsavel, int qtdePessoas) {

        Reserva reserva = new Reserva();

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

        return reserva;
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
