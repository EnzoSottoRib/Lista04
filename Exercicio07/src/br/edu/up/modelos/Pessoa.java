package br.edu.up.modelos;

public class Pessoa {

    String nome;
    String rg;
    String matricula;
    Disciplina[] disciplinas = new Disciplina[10];

    public Pessoa() {
    }

    public Pessoa(String nome, String rg, String matricula) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
}


