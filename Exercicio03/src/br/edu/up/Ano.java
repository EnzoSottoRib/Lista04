package br.edu.up;

public class Ano {
    
    int ano;
    boolean bissexto;
    Mes[] meses;

    public Ano(int ano, boolean bissexto) {

        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];

    }

    public void adicionarMes(Mes mes) {
        meses[mes.getQtdeDias() - 1] = mes;
            }

    public void excluirCompromisso (String nomeMes, int diaMes, int hora) {
        for (Mes mes : meses) {
            // ana: aqui o nosso for mudou (em relação à classe Dia porque aqui [na classe Ano] a gente não tem o atributo comp)
                if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                    mes.excluirCompromisso(diaMes, hora); 
                    break; 
                }
            }
        }

    public String listarCompromissos (String nomeMes) {
        
        StringBuilder sb = new StringBuilder();

        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                sb.append(mes.listarCompromissos()).append("\n");
                return sb.toString();
            }
        }
        return "Mês não encontrado.\n";
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Mes mes : meses) {
            sb.append(mes.listarCompromissos()).append("\n"); 
        }
        return sb.toString(); 
    }
    
    
}
