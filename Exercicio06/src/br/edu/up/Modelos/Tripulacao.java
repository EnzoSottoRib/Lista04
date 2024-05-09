package br.edu.up.Modelos;

public class Tripulacao extends Pessoa{
    private String idAeronautica;
    private String matriculaFuncionario;
    
    public Tripulacao(String nome, String rg, String codigoAeronave, String tipoAeronave, int quantidadeAssentos,
            String idAeronautica, String matriculaFuncionario) {
        super(nome, rg, codigoAeronave, tipoAeronave, quantidadeAssentos);
        this.idAeronautica = idAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getIdAeronautica() {
        return idAeronautica;
    }

    public void setIdAeronautica(String idAeronautica) {
        this.idAeronautica = idAeronautica;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

}

