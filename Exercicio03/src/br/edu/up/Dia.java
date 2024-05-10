package br.edu.up;

public class Dia {
    
    int diaMes;
    Compromisso[] compromissos;

    Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
    }

    public void adicionarCompromisso(Compromisso comp) {
        compromissos[comp.getHora()] = comp;
    }

    public Compromisso consultarCompromisso(int hora) {
        return compromissos[hora];
    }

    public void excluirCompromisso (int hora) {
        compromissos[hora] = null;
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        // ana: preferi usar o stringbuilder (e aprender o que é haha) ao string porque ele é mais prático, mutável, e administra melhor a memória :)
        for (Compromisso comp : compromissos) {
            // ana: o for enhanced loop é mais prático
            sb.append(comp.toString()).append("\n");
            // ana: explicando o cógido: o append adiciona e vai concatenando (juntando) as infos (atributos) dos compromissos! o \n é pra quebrar a linha!
        }
        return sb.toString(); 
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }
    
}
