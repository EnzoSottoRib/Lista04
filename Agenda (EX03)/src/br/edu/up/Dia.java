package br.edu.up;

import java.util.ArrayList;
import java.util.List;

public class Dia {
    
    int diaMes;
    List<Compromisso> compromisso;
    // ana: decidi usar uma lista porque em um vetor o seu tamanho não pode ser alterado

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
            // ana: o enhanced for loop é mais prático
            if (comp.getHora() == hora) { 
                System.out.println("Compromisso encontrado: ");
                System.out.println(comp); 
                return; 
            }
        }
        System.out.println("Nenhum compromisso encontrado para o horário mencionado. ");
    }

    public void excluirCompromisso (int hora) {
        for (Compromisso comp : compromisso) {
            if (comp.getHora() == hora) {
                compromisso.remove(comp);
                System.out.println("Compromisso removido com sucesso! :)");
            }
        }
        System.out.println("Nenhum compromisso encontrado para o horário mencionado. ");
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        // ana: preferi usar o stringbuilder (e aprender o que é haha) ao string porque ele é mais prático, mutável, e administra melhor a memória :)
        for (Compromisso comp : compromisso) {
            sb.append(comp.toString()).append("\n");
            // ana: explicando o cógido: o append adiciona e vai concatenando (juntando) as infos (atributos) dos compromissos! o \n é pra quebrar a linha!
        }
        return sb.toString(); 
    }
    
    
}
