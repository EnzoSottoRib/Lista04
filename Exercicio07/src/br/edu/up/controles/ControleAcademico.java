package br.edu.up.controles;

import br.edu.up.modelos.*;
import br.edu.up.Prompt;

public class ControleAcademico {
    
    Aluno vetorAluno[] = new Aluno[600];

    Prof vetorProf[] = new Prof[30];
    Titulacao titulacao;
    Disciplina vetorDisciplina[] = new Disciplina[30];

    int a = 0;
    int p = 0;
    int d = 0;

    public void adicionarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(Prompt.lerLinha("Digite o nome do aluno: "));
        aluno.setRg(Prompt.lerLinha("Digite o RG do aluno: "));
        aluno.setMatricula(Prompt.lerLinha("Digite a matrícula do aluno: "));

        vetorAluno[a] = aluno;
        a++;
    }

    public void adicionarProf() {
        Prof prof = new Prof();
        prof.setNome(Prompt.lerLinha("Digite o nome do professor: "));
        prof.setRg(Prompt.lerLinha("Digite o RG do professor: "));
        prof.setMatricula(Prompt.lerLinha("Digite a matrícula do professor: "));
        prof.setnLattes(Prompt.lerInteiro("Digite o número Lattes do professor: "));

        Prompt.imprimir("Agora vamos registrar sua titulação: ");

        Titulacao titulacao = new Titulacao();
        titulacao.setNomeInstituicao(Prompt.lerLinha("Digite o nome da instituição: "));
        titulacao.setAno(Prompt.lerInteiro("Digite o ano de obtenção da titulação: "));
        titulacao.setTituloObtido(Prompt.lerLinha("Digite o título obtido: "));
        titulacao.setTituloTCC(Prompt.lerLinha("Digite o título do TCC: "));
    
        prof.setTitulacao(titulacao);

        vetorProf[p] = prof;
        p++;
    }

    public void adicionarDisciplina() {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(Prompt.lerLinha("Digite o nome da disciplina: "));
        disciplina.setId(Prompt.lerLinha("Digite o ID da disciplina: "));

        int a = selecionarProf();
        disciplina.setProf(vetorProf[a]);

        int c = 0;

        do {

            Prompt.imprimir("Digite 0 para sair: ");
            int b = consultarAluno();
            disciplina.getAlunos()[disciplina.getContadorAlunos()] = vetorAluno[b];
            disciplina.setContadorAlunos(disciplina.getContadorAlunos() + 1);

        } while (c != 0);
        
        Competencia competencia = new Competencia();
        competencia.setDescricao(Prompt.lerLinha("Digite a descrição da competência"));
        competencia.setNecessidade(null);
        /* ana: 
        falta adicionar prof: OK 
        e alunos: OK
        (e competencia):  */

        vetorDisciplina[d] = disciplina;
        d++;
    }

    public void adicionarAlunoDisciplina() {
        selecionarAluno();
        
    }

    public String listarAlunos() {
        if (vetorAluno == null) {
            return "Não há alunos registrados.";
        } else {
            StringBuilder sb = new StringBuilder();
            int index = 0; 
    
            for (Aluno aluno : vetorAluno) {
                sb.append("Aluno ").append(index).append(":\n");
                sb.append(aluno.toString()).append("\n");
                index++;
            }
    
            return sb.toString(); 
        }
    }

    public String listarProf() {
        if (vetorProf == null) {
            return "Não há professores registrados.";
        } else {
            StringBuilder sb = new StringBuilder();
            int index = 0; 
    
            for (Prof prof : vetorProf) {
                sb.append("Prof ").append(index).append(":\n");
                sb.append(prof.toString()).append("\n");
                index++;
            }
    
            return sb.toString(); 
        }
    }

    public String listarDisciplina() {
        if (vetorDisciplina == null) {
            return "Não há disciplinas registradas.";
        } else {
            StringBuilder sb = new StringBuilder();
            int index = 0; 
    
            for (Disciplina disciplina : vetorDisciplina) {
                sb.append("Disciplina ").append(index).append(":\n");
                sb.append(disciplina.toString()).append("\n");
                index++;
            }
    
            return sb.toString(); 
        }
    }

    public int selecionarAluno() {

        Prompt.imprimir("Os seguintes alunos estão registrados: ");
        listarAlunos();
        int a = Prompt.lerInteiro("Defina o índice de seu aluno: ");

        return a;
    }

    public int selecionarProf() {

        Prompt.imprimir("Os seguintes professores estão registrados: ");
        listarProf();
        int a = Prompt.lerInteiro("Defina o índice de seu professor: ");

        return a;
    }

    public int selecionarDisciplina() {

        Prompt.imprimir("As seguintes disciplinas estão registrados: ");
        listarDisciplina();
        int a = Prompt.lerInteiro("Defina o índice de sua disciplina: ");

        return a;
    }

    public int consultarAluno() {
        Aluno aluno = new Aluno();
        aluno.setRg(Prompt.lerLinha("Digite o RG do aluno: "));
        for (int a = 0; a < vetorAluno.length; a++) {
            if (aluno.getRg() == vetorAluno[a].getRg()) {
                break;
            }
        }
        return a;
    }

    public int consultarProf() {
        Prof prof = new Prof();
        prof.setRg(Prompt.lerLinha("Digite o RG do professor: "));
        for (int a = 0; a < vetorProf.length; a++) {
            if (prof.getRg() == vetorProf[a].getRg()) {
                break;
            }
        }
        return a;
    }

    public int consultarDisciplina() {
        Disciplina disciplina = new Disciplina();
        disciplina.setId(Prompt.lerLinha("Digite o ID da disciplina: "));
        for (int a = 0; a < vetorDisciplina.length; a++) {
            if (disciplina.getId() == vetorDisciplina[a].getId()) {
                break;
            }
        }
        return a;
    }

    public void excluirAluno(int b) {
        vetorAluno[b] = null;
    }

    public void excluirProf(int b) {
        vetorProf[b] = null;
    }

    public void excluirDisciplina(int b) {
        vetorDisciplina[b] = null;
    }

    public void editarAluno(int b) {
        
    }
}