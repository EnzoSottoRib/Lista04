package br.edu.up.modelos;

public class Aluno extends Pessoa {

    double[] notas;
    Disciplina[] disciplinas[];

    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public Disciplina[][] getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Disciplina[][] disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
