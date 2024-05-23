package br.edu.up.Modelo;

import java.time.LocalDate;

public class Seguro {
    private String apolice;
    private Segurado segurado;
    private Double vlrApolice;
    private LocalDate dtaInicio;
    private LocalDate dtaFinal;


    public String getApolice() {
        return apolice;
    }
    public void setApolice(String apolice) {
        this.apolice = apolice;
    }
    public Segurado getSegurado() {
        return segurado;
    }
    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }
    public Double getVlrApolice() {
        return vlrApolice;
    }
    public void setVlrApolice(Double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }
    public LocalDate getDtaInicio() {
        return dtaInicio;
    }
    public void setDtaInicio(LocalDate dtaInicio) {
        this.dtaInicio = dtaInicio;
    }
    public LocalDate getDtaFinal() {
        return dtaFinal;
    }
    public void setDtaFinal(LocalDate dtaFinal) {
        this.dtaFinal = dtaFinal;
    }


    


    

}
