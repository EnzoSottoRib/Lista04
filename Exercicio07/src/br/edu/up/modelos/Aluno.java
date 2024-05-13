package br.edu.up.modelos;

import java.util.Arrays;

public class Aluno extends Pessoa {

    Aprovado aprovado;

    public enum Aprovado {
        APROVADO, REPROVADO, PENDENTE
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", rg=" + rg + ", matricula="
                + matricula + ", aprovado=" + aprovado + "]";
    }

    
}
