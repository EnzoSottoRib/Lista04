package br.edu.up.modelos;

public class Cidade {
    private String nome;
    private String uf;

    public Cidade(){
        
    }

    public Cidade(String nome, String uf){
        this.nome = nome;
        this.uf = uf;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUF() {
        return uf;
    }
    public void setUF(String uF) {
        uf = uF;
    }


    @Override
    public String toString() {
        return "Cidade [nome=" + nome + ", uf=" + uf + "]";
    }

}
