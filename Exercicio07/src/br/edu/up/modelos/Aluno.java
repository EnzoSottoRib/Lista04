package br.edu.up.modelos;

import java.util.Arrays;

public class Aluno extends Pessoa {

    Aprovado aprovado;
    Disciplina[] disciplinas;
    int contadorDisciplina;
    int satisfatoriaN = 0;
    int satisfatoriaC = 0;

    public enum Aprovado {
        APROVADO, REPROVADO, PENDENTE
    }

    public Aprovado getAprovado() {
        return aprovado;
    }

    public void setAprovado(Aprovado aprovado) {
        this.aprovado = aprovado;
    }

    public int getSatisfatoriaN() {
        return satisfatoriaN;
    }

    public void setSatisfatoriaN(int satisfatoriaN) {
        this.satisfatoriaN = satisfatoriaN;
    }

    public int getSatisfatoriaC() {
        return satisfatoriaC;
    }

    public void setSatisfatoriaC(int satisfatoriaC) {
        this.satisfatoriaC = satisfatoriaC;
    }

    public void incrementarSatisfatoriaC() {
        satisfatoriaC++;
    }

    public void incrementarSatisfatoriaN() {
        satisfatoriaN++;
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
