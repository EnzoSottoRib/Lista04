package br.edu.up;

public class Mes {
    
    String nome;
    int qtdeDias;
    Dia[] dias;

    Mes (int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.nome = nome;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso (Compromisso comp, int diaMes) {
        dias[diaMes - 1].adicionarCompromisso(comp);
    }

    public void excluirCompromisso(int diaMes, int hora) {
        dias[diaMes - 1].excluirCompromisso(hora);
    }
    
    public String listarCompromissos(int diaMes) {
        return dias[diaMes - 1].listarCompromissos();
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Dia dia : dias) {
            if (dia != null) {
                sb.append(dia.listarCompromissos()).append("\n");
            }
        }
        return sb.toString(); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

}
