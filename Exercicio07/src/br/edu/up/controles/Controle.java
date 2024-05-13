package br.edu.up.controles;

import br.edu.up.modelos.*;
import br.edu.up.Prompt;

public class Controle {
    
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
        
        // ana: falta adicionar prof e alunos

        vetorDisciplina[d] = disciplina;
        d++;
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

}
