package br.edu.up;

public class Mes {
    
    String nome;
    // ana: eu preferi definir o atributo nome como String
    int qtdeDias;
    Dia[] dias;

    Mes (int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.nome = nome;
    }

    public void adicionarCompromisso (Compromisso comp, int diaMes) {
        if (dias == null || diaMes < 1 || diaMes > qtdeDias) {
            System.out.println("Data inválida.");
        }

        if(dias[diaMes -1] == null) {
            dias[diaMes - 1] = new Dia(diaMes);
        }

        dias[diaMes - 1].adicionarCompromisso(comp);
        System.out.println("Compromisso adicionado com sucesso! :)");
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        for (Dia dia : dias) {
            if (dia != null && dia.getDiaMes() == diaMes) {
                if (getNome().equalsIgnoreCase(nomeMes)) {
                    dia.excluirCompromisso(hora);
                    return;
                }
            }
        }
    }
    

    public String listarCompromissos (String nomeMes) {
        
        String teste = "Oi";

        return teste;

    }

    public String listarCompromissos() {
                
        String teste = "Oi";

        return teste;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
