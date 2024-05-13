package br.edu.up.modelos;

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
    
}
