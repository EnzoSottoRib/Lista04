package br.edu.up.modelos;

public class Prof extends Pessoa {
    
    int nLattes;
    Titulacao titulacao;
    
    public int getnLattes() {
        return nLattes;
    }
    public void setnLattes(int nLattes) {
        this.nLattes = nLattes;
    }
    public Titulacao getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }
    
    @Override
    public String toString() {
        return "Prof [nome=" + nome + ", nLattes=" + nLattes + ", rg=" + rg + ", matricula=" + matricula
                + ", titulacao=" + titulacao + "]";
    }

}


