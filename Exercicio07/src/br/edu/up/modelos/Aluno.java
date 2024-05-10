package br.edu.up.modelos;

public class Aluno extends Pessoa {
    
    int faltas;
    double[] notas;
    Disciplina[] disciplinas[];
    
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
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
