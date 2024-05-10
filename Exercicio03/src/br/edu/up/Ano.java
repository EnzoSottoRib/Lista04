package br.edu.up;

public class Ano {
    
    int ano;
    boolean bissexto;
    Mes[] meses;

    public Ano(int ano, boolean bissexto) {

        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];

        meses[0] = new Mes(31, "Janeiro");
        adicionarMes(meses[0]);
        if (bissexto) {
            meses[1] = new Mes(29, "Fevereiro");
        } else {
            meses[1] = new Mes(28, "Fevereiro");
        }
        adicionarMes(meses[1]);
        meses[2] = new Mes(31, "Março");
        adicionarMes(meses[2]);
        meses[3] = new Mes(30, "Abril");
        adicionarMes(meses[3]);
        meses[4] = new Mes(31, "Maio");
        adicionarMes(meses[4]);
        meses[5] = new Mes(30, "Junho");
        adicionarMes(meses[5]);
        meses[6] = new Mes(31, "Julho");
        adicionarMes(meses[6]);
        meses[7] = new Mes(31, "Agosto");
        adicionarMes(meses[7]);
        meses[8] = new Mes(30, "Setembro");
        adicionarMes(meses[8]);
        meses[9] = new Mes(31, "Outubro");
        adicionarMes(meses[9]);
        meses[10] = new Mes(30, "Novembro");
        adicionarMes(meses[10]);
        meses[11] = new Mes(31, "Dezembro");
        adicionarMes(meses[11]);

    }

    public void adicionarMes(Mes mes) {
        
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
