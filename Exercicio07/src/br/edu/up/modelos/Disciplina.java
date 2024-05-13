package br.edu.up.modelos;

public class Disciplina {
    
    String nome;
    String id;
    Prof prof;
    Aluno[] alunos = new Aluno[30];
    Competencia competencia;
    int contadorAlunos;
    
    public Disciplina(String nome, String id, Prof prof) {
        this.nome = nome;
        this.id = id;
        this.prof = prof;
        contadorAlunos = 0;
    }

    public Disciplina() {
        contadorAlunos = 0;
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

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

}
