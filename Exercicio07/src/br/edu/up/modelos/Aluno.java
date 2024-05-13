package br.edu.up.modelos;

import java.util.Arrays;

public class Aluno extends Pessoa {

    Aprovado aprovado;
    Disciplina[] disciplinas;
    int contadorDisciplina;

    public enum Aprovado {
        APROVADO, REPROVADO, PENDENTE
    }

    public Aprovado getAprovado() {
        return aprovado;
    }

    public void setAprovado(Aprovado aprovado) {
        this.aprovado = aprovado;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getContadorDisciplina() {
        return contadorDisciplina;
    }

    public void setContadorDisciplina(int contadorDisciplina) {
        this.contadorDisciplina = contadorDisciplina;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", aprovado=" + aprovado + ", rg=" + rg + ", matricula=" + matricula
                + ", disciplinas=" + Arrays.toString(disciplinas) + ", contadorDisciplina=" + contadorDisciplina + "]";
    }

}
