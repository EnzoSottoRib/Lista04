package br.edu.up.modelos;

public class Prof extends Pessoa {
    
    int nLattes;
    Titulacao titulacao;
    Disciplina disciplina;
    
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

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    @Override
    public String toString() {
        return "Prof [nome=" + nome + ", nLattes=" + nLattes + ", rg=" + rg + ", matricula=" + matricula
                + ", titulacao=" + titulacao + ", disciplina=" + disciplina + "]";
    }

}


