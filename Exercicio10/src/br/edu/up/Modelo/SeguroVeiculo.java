package br.edu.up.Modelo;

public class SeguroVeiculo extends Seguro{
    
    private Double vlrFranquia;
    private Boolean temCarroReserva;
    private Boolean cobreVidros;

    
    public Double getVlrFranquia() {
        return vlrFranquia;
    }
    public void setVlrFranquia(Double vlrFranquia) {
        this.vlrFranquia = vlrFranquia;
    }
    public Boolean getTemCarroReserva() {
        return temCarroReserva;
    }
    public void setTemCarroReserva(Boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }
    public Boolean getCobreVidros() {
        return cobreVidros;
    }
    public void setCobreVidros(Boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    

}
