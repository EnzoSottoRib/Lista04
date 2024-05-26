package br.edu.up.Controle;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.Modelo.*;

public class SeguroController {

    private List<Seguro> seguros;

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


}
