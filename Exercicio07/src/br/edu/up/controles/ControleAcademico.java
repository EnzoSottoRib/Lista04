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
        vetorProf[a].setDisciplina(vetorDisciplina[d]);
    
        int c = 0;
    
        do {
            
            if (disciplina.getContadorAlunos() >= 30) {
                Prompt.imprimir("Turma cheia.");
                c = 0;
                break;
            }

            Prompt.imprimir("Digite 0 para sair: ");
            int b = consultarAluno();

            if (vetorAluno[b].getContadorDisciplina() >= 5) {
                Prompt.imprimir("O aluno não tem espaço para novas disciplinas.");
            } else {
                disciplina.getAlunos()[disciplina.getContadorAlunos()] = vetorAluno[b];
                disciplina.setContadorAlunos(disciplina.getContadorAlunos() + 1);
    
                vetorAluno[b].getDisciplinas()[vetorAluno[b].getContadorDisciplina()] = vetorDisciplina[d];
                vetorAluno[b].setContadorDisciplina(vetorAluno[b].getContadorDisciplina() + 1);
            }

        } while (c != 0);
    
        c = 1;
    
        for (int i = 0; i < 4; i++) {
            Competencia competencia = new Competencia();
            competencia.setDescricao(Prompt.lerLinha("Digite uma breve descrição da competência: "));
    
            String comp = "A";
    
            do {
                comp = Prompt.lerLinha("Digite N caso a competência seja necessária, ou C caso ela seja complementar: ");
            } while (!comp.equals("N") && !comp.equals("C"));
    
            if (comp.equals("N")) {
                competencia.setObrigatoria(true);
            } else if (comp.equals("C")) {
                competencia.setObrigatoria(false);
            }
    
            disciplina.getCompetencias()[i] = competencia;
        }
    
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

    public String listarAlunosDisciplina() {
        int a = selecionarDisciplina();
    
        if (a >= 0 && a < vetorDisciplina.length) {
            Disciplina disciplina = vetorDisciplina[a];
    
            if (disciplina.getAlunos() == null) {
                return "Não há alunos registrados nesta disciplina.";
            } else {
                StringBuilder sb = new StringBuilder();
                int index = 0; 
    
                for (Aluno aluno : disciplina.getAlunos()) {
                    if (aluno != null) { 
                        sb.append("Aluno ").append(index).append(":\n");
                        sb.append(aluno.toString()).append("\n");
                        index++;
                    }
                }
    
                return sb.toString(); 
            }
        } else {
            return "Disciplina não encontrada.";
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

    public void editarNomeAluno() {
        int a = selecionarAluno();
        vetorAluno[a].setNome(Prompt.lerLinha("Digite o nome do aluno: "));
    }

    public void editarNomeProf() {
        int a = selecionarProf();
        vetorProf[a].setNome(Prompt.lerLinha("Digite o nome do professor: "));
    }

    public void editarTitulacao() {
        int a = selecionarProf();

        Titulacao titulacao = new Titulacao();
        titulacao.setAno(Prompt.lerInteiro("Digite o ano de conclusão: "));
        titulacao.setNomeInstituicao(Prompt.lerLinha("Digite o nome da instituição"));
        titulacao.setTituloObtido(Prompt.lerLinha("Digite o título obtido: "));
        titulacao.setTituloTCC(Prompt.lerLinha("Digite o título do TCC: "));

        vetorProf[a].setTitulacao(titulacao);
    }

    public void editarNomeDisciplina() {
        int a = selecionarDisciplina();

        vetorDisciplina[a].setNome(Prompt.lerLinha("Digite o nome da disciplina: "));
    }

    public void editarProfDisciplina() {
        int a = selecionarDisciplina();

        int b = selecionarProf();
        vetorDisciplina[a].setProf(vetorProf[b]);
        vetorProf[b].setDisciplina(vetorDisciplina[a]);
    }

}
