package br.edu.up;

public class Ano {
    
    int ano;
    boolean bissexto;
    Mes[] meses;

    Ano(int ano, boolean bissexto) {

        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
        int dias = 28;

            if (bissexto) {
                dias = 29;
            }

            meses[1] = new Mes(dias, "Fevereiro");

    }

    // ana: em Ano a gente só colocou que quando o ano é bissexto fevereiro tem 29 dias

    public void adicionarMes(Mes mes) {

        for (int i = 0; i < meses.length; i++) {

            int dias = 31; 
            String[] nome = new String[12];
            
            if (i == 1 && bissexto) {
                dias = 29;
            } else if (i == 1) {
                dias = 28;
            } else if (i == 3 || i == 5 || i == 8 || i == 10) {
                dias = 30; 
            }

            switch(i + 1) {
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

            meses[i] = new Mes(dias, nome[i]);

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
