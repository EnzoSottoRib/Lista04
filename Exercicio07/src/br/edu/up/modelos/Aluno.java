package br.edu.up.modelos;

import java.util.Arrays;

public class Aluno extends Pessoa {

    Disciplina[] disciplinas[];
    Aprovado aprovado;

    public Disciplina[][] getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Disciplina[][] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public enum Aprovado {
        APROVADO, REPROVADO, PENDENTE
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", rg=" + rg + ", disciplinas=" + Arrays.toString(disciplinas) + ", matricula="
                + matricula + ", aprovado=" + aprovado + "]";
    }

    
}
