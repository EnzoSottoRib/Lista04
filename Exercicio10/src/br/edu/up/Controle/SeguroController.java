package br.edu.up.Controle;
import java.time.LocalDate;

import br.edu.up.Modelo.*;

public class SeguroController {
    public void cadastrarSeguro(String apolice, Segurado segurado, Double vlrApolice, LocalDate dtaInicio, LocalDate dtaFinal){
        Seguro seguro = new Seguro();
        seguro.setApolice(apolice);
        seguro.setSegurado(segurado);
        seguro.setVlrApolice(vlrApolice);
        seguro.setDtaInicio(dtaInicio);
        seguro.setDtaFinal(dtaFinal);
    }
}
