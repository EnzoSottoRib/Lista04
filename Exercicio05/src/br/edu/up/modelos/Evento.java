package br.edu.up.modelos;

public class Evento {
    
    String nomeEvento;
    String localEvento;
    int dia;
    int mes;
    int ano;
    int hora;
    int lotacaoMax;
    int ingressosVendidos;
    double precoIngresso;

    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    public String getLocalEvento() {
        return localEvento;
    }
    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getLotacaoMax() {
        return lotacaoMax;
    }
    public void setLotacaoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }
    public int getIngressosVendidos() {
        return ingressosVendidos;
    }
    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }
    public double getPrecoIngresso() {
        return precoIngresso;
    }
    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    @Override
    public String toString() {
        return "Evento [Nome do Evento = " + nomeEvento + ", Local do Evento = " + localEvento + ", Dia = " + dia + ", Mês = " + mes
                + ", Ano = " + ano + ", Hora = " + hora + ", Lotação Máxima = " + lotacaoMax + ", Ingressos Vendidos = "
                + ingressosVendidos + ", Preço Ingresso = R$ " + precoIngresso + "]";
    }

}
