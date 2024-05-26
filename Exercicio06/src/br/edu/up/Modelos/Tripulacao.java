package br.edu.up.Modelos;

public abstract class Tripulacao extends Pessoa {
    private int idAeronautica;
    private int matriculaFuncionario;

    public Tripulacao(String nome, int rg, int idAeronautica, int matriculaFuncionario) {
        super(nome, rg);
        this.idAeronautica = idAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public int getIdAeronautica() {
        return idAeronautica;
    }

    public void setIdAeronautica(int idAeronautica) {
        this.idAeronautica = idAeronautica;
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }
}
