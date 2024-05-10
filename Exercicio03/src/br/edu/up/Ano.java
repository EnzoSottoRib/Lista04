package br.edu.up;

public class Ano {
    
    int ano;
    boolean bissexto;
    Mes[] meses;

    Ano(int ano, boolean bissexto) {

        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];

    }

    // ana: em Ano a gente só colocou que quando o ano é bissexto fevereiro tem 29 dias

    public void adicionarMes(Mes mes, int nMes) {

            mes.set
            int dias = 31; 
            String[] nome = new String[12];
            
            if (nMes == 1 && bissexto) {
                dias = 29;
            } else if (nMes == 1) {
                dias = 28;
            } else if (nMes == 3 || nMes == 5 || nMes == 8 || nMes == 10) {
                dias = 30; 
            }

            switch(nMes) {
                case 1 : nome[0] = "Janeiro"; break;
                case 2 : nome[1] = "Fevereiro"; break;
                case 3 : nome[2] = "Março"; break;
                case 4 : nome[3] = "Abril"; break;
                case 5 : nome[4] = "Maio"; break;
                case 6 : nome[5] = "Junho"; break;
                case 7 : nome[6] = "Julho"; break;
                case 8 : nome[7] = "Agosto"; break;
                case 9 : nome[8] = "Setembro"; break;
                case 10 : nome[9] = "Outubro"; break;
                case 11 : nome[10] = "Novembro"; break;
                case 12 : nome[11] = "Dezembro"; break;
            }

            meses[nMes-1] = mes;

        }

    }

    // ana: aqui sim em adicionarMes a gente define todos os meses :>

    public void excluirCompromisso (String nomeMes, int diaMes, int hora) {
        for (Mes mes : meses) {
            // ana: aqui o nosso for mudou (em relação à classe Dia porque aqui [na classe Ano] a gente não tem o atributo comp)
                if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                    mes.excluirCompromisso(nomeMes, diaMes, hora); 
                    return; 
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
        return "Mês não encontrado";
    }

    // ana: testar acima

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Mes mes : meses) {
            sb.append(mes.listarCompromissos()).append("\n"); 
        }
        return sb.toString(); 
    }
    
    
}
