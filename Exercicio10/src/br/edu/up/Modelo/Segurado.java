package br.edu.up.Modelo;

public class Segurado {
    private String nome;
    private String RG;
    private String CPF;
    private Enum sexo;
    private String telefone;
    private String endereco;
    private String CEP;
    private String cidade;


    


    public Segurado(String nome, String RG, String CPF, Enum sexo, String telefone, String endereco, String CEP,
            String cidade) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.CEP = CEP;
        this.cidade = cidade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }
    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public Enum getSexo() {
        return sexo;
    }
    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    @Override
    public String toString() {
        return "Segurado [nome=" + nome + ", RG=" + RG + ", CPF=" + CPF + ", sexo=" + sexo + ", telefone=" + telefone
                + ", endereco=" + endereco + ", CEP=" + CEP + ", cidade=" + cidade + "]";
    }


    
    


}
