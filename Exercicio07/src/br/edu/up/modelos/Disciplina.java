package br.edu.up.modelos;

public class Disciplina {
    
    String nome;
    String id;
    Prof prof;
    int cargaHoraria;
    Aluno[] alunos; // ??
    Curriculo curriculo;
    
    public Disciplina(String nome, String id, Prof prof, int cargaHoraria) {
        this.nome = nome;
        this.id = id;
        this.prof = prof;
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }

}
