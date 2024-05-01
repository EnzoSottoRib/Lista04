package br.edu.up;

import java.util.ArrayList;
import java.util.List;

public class Dia {
    
    int diaMes;
    List<Compromisso> compromisso;

    Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromisso = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso comp) {
        compromisso.add(comp); 
        System.out.println("Compromisso adicionado com sucesso! :)");
    }

    public void consultarCompromisso(int hora) {
        for (Compromisso comp : compromisso) {
            if (comp.getHora() == hora) { 
                System.out.println("Compromisso encontrado: ");
                System.out.println(comp); 
                return; 
            }
        }
        System.out.println("Nenhum compromisso encontrado para o horário mencionado. ");
    }

    public void excluirCompromisso (int hora) {

    }

    public String listarCompromissos() {
                
        String teste = "Oi";

        return teste;

    }
    
}
