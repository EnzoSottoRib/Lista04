package br.edu.up.Modelo;

import java.time.LocalDate;

public class Seguro {
    private String apolice;
    private String segurado;
    private Double vlrApolice;
    private String dtaInicio;
    private String dtaFinal;


    public String getApolice() {
        return apolice;
    }
    public void setApolice(String apolice) {
        this.apolice = apolice;
    }
    public String getSegurado() {
        return segurado;
    }
    public void setSegurado(String segurado) {
        this.segurado = segurado;
    }
    public Double getVlrApolice() {
        return vlrApolice;
    }
    public void setVlrApolice(Double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }
    public String getDtaInicio() {
        return dtaInicio;
    }
    public void setDtaInicio(String dtaInicio) {
        this.dtaInicio = dtaInicio;
    }
    public String getDtaFinal() {
        return dtaFinal;
    }
    public void setDtaFinal(String dtaFinal) {
        this.dtaFinal = dtaFinal;
    }
    

    @Override
    public String toString() {
        return "Seguro [apolice=" + apolice + ", segurado=" + segurado + ", vlrApolice=" + vlrApolice + ", dtaInicio="
                + dtaInicio + ", dtaFinal=" + dtaFinal + "]";
    }

    





    

}
