package br.edu.up.Modelo;

public class SeguroVida extends Seguro{
    
    private Boolean cobreDoenca;
    private Boolean cobreAcidente;

    
    public Boolean getCobreDoenca() {
        return cobreDoenca;
    }
    public void setCobreDoenca(Boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }
    public Boolean getCobreAcidente() {
        return cobreAcidente;
    }
    public void setCobreAcidente(Boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }


    

}
