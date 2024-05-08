package br.edu.up.controles;
import java.util.List;

import br.edu.up.Compromisso;
import br.edu.up.modelos.Evento;

public class ControleEvento {

    private List<Evento> eventos;

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
    }

    public void editarNome(Evento evento) {
        evento.setNomeEvento(Prompt.lerLinha("Digite o nome atualizado do evento: "));
    }

    public void editarLocal(Evento evento) {
        evento.setLocalEvento(Prompt.lerLinha("Digite o novo local do evento: "));
    }

    public void editarHora(Evento evento) {
        do {
            evento.setHora(Prompt.lerInteiro("Digite o horário no formato 24H: "));
        } while  (evento.getHora() < 0 && evento.getHora() > 24);
    }

    public void editarDia(Evento evento) {
        evento.setDia(Prompt.lerInteiro("Digite o novo dia (seu número, no formato 'DD'): "));
    }

    public void editarMes(Evento evento) {
        evento.setMes(Prompt.lerInteiro("Digite o novo mês (seu número, no formato 'MM'): "));
    }

    public void editarAno(Evento evento) {
        evento.setAno(Prompt.lerInteiro("Digite o novo ano (seu número, no formato 'AAAA'): "));
    }

    public void editarLotacaoMax(Evento evento) {
        evento.setLotacaoMax(Prompt.lerInteiro("Digite a nova lotação máxima: "));
    }

    public void editarIngressosVendidos (Evento evento) {
        evento.setIngressosVendidos(Prompt.lerInteiro("Digite a nova quantidade de ingressos vendidos: "));
    }

    public void editarPrecoIngresos (Evento evento) {
        evento.setPrecoIngresso(Prompt.lerDecimal("Digite o novo preço do ingresso, em reais: "));
    }

    public void excluirEvento(Evento evento) {
        evento = null;
    }

    public String listarEvento() {
        if (eventos.isEmpty()) {
            return "Não há eventos listados.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Evento evento : eventos) {
                sb.append(evento.toString()).append("\n");
            }
            return sb.toString(); 
            }
    }
    
}
