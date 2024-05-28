package br.edu.up.Controle;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.Modelo.*;

public class SeguroController {

    private List<Seguro> seguros;
    int qnt = 0;

    public SeguroController() {
        this.seguros = new ArrayList<>(); 
    }


    public void cadastrarSeguro(String apolice, String segurado, Double vlrApolice, String dtaInicio, String dtaFinal){
        Seguro seguro = new Seguro();
        seguro.setApolice(apolice);
        seguro.setSegurado(segurado);
        seguro.setVlrApolice(vlrApolice);
        seguro.setDtaInicio(dtaInicio);
        seguro.setDtaFinal(dtaFinal);

        seguros.add(seguro);
        qnt++;
    }

    public List<Seguro> getSeguros() {
        return seguros;
    }

    public Seguro buscarSeguroPorApolice(String nmrApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(nmrApolice)) {
                return seguro;
            }
        }
        return null; 
    }

    public boolean excluirSeguro(String nmrApolice) {
        Seguro seguroParaExcluir = null;
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(nmrApolice)) {
                seguroParaExcluir = seguro;
                break;
            }
        }
        if (seguroParaExcluir != null) {
            seguros.remove(seguroParaExcluir);
            qnt--;
            return true; 
        } else {
            return false;
        }
    }

    public void excluirTodosSeguros() {
        seguros.clear();
        qnt = 0;
    }


    public int getQnt() {
        return qnt;
    }

    

}
