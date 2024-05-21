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

    public Aluno[] getVetorAluno() {
        return vetorAluno;
    }

    public void setVetorAluno(Aluno[] vetorAluno) {
        this.vetorAluno = vetorAluno;
    }

    public Prof[] getVetorProf() {
        return vetorProf;
    }

    public void setVetorProf(Prof[] vetorProf) {
        this.vetorProf = vetorProf;
    }

    public Disciplina[] getVetorDisciplina() {
        return vetorDisciplina;
    }

    public void setVetorDisciplina(Disciplina[] vetorDisciplina) {
        this.vetorDisciplina = vetorDisciplina;
    }

    public void adicionarAluno(String nome, String rg, String matricula) {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setRg(rg);
        aluno.setMatricula(matricula);
    
        vetorAluno[a] = aluno;
        a++;
    }    

    public void adicionarProf(String nome, String rg, String matricula, int nLattes, 
    String nomeInstituicao, int ano, String tituloObtido, String tituloTCC) {
        Prof prof = new Prof();
        prof.setNome(nome);
        prof.setRg(rg);
        prof.setMatricula(matricula);
        prof.setnLattes(nLattes);

        Titulacao titulacao = new Titulacao();
        titulacao.setNomeInstituicao(nomeInstituicao);
        titulacao.setAno(ano);
        titulacao.setTituloObtido(tituloObtido);
        titulacao.setTituloTCC(tituloTCC);

        prof.setTitulacao(titulacao);

        vetorProf[p] = prof;
        p++;
    }

    public void adicionarDisciplina(String nomeDisciplina, String idDisciplina, int indiceProf, int[] indicesAlunos, String[] competenciasDescricoes, boolean[] competenciasObrigatorias) {
        
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nomeDisciplina);
        disciplina.setId(idDisciplina);

        disciplina.setProf(vetorProf[indiceProf]);
        vetorProf[indiceProf].setDisciplina(disciplina);

        for (int i = 0; i < indicesAlunos.length; i++) {
            int indiceAluno = indicesAlunos[i];
            /* ana: ou seja, o índice que a gente enviou do menu encontra aqui no vetor aluno o seu aluno equivalente,
            para que a gente possa tanto colocar aluno na disc. como a disc. no aluno (assim como foi feito em prof, 
            apesar que de forma mais simples!) */
            if (indiceAluno == 0) {
                break; 
            }
            if (disciplina.getContadorAlunos() >= 30) {
                break;
            }

            if (vetorAluno[indiceAluno].getContadorDisciplina() < 5) {
                /* ana: ou seja, se o aluno ainda pode adicionar mais matérias */
                disciplina.getAlunos()[disciplina.getContadorAlunos()] = vetorAluno[indiceAluno];
                disciplina.setContadorAlunos(disciplina.getContadorAlunos() + 1);

                vetorAluno[indiceAluno].getDisciplinas()[vetorAluno[indiceAluno].getContadorDisciplina()] = disciplina;
                /* ana: o código parece complicade de primeira KKKK mas é basicamente um vetor que indica a posição do objeto
                 * aluno > depois acessa o vetor de disciplinas dentro do modelo aluno > precisa saber qual a posicação de aluno
                 * (de novo) e a posição do coiso de matéria! :>
                 */
                vetorAluno[indiceAluno].setContadorDisciplina(vetorAluno[indiceAluno].getContadorDisciplina() + 1);
            }
        }

        for (int i = 0; i < 4; i++) {
        Competencia competencia = new Competencia();
        competencia.setDescricao(competenciasDescricoes[i]);
        competencia.setObrigatoria(competenciasObrigatorias[i]);

        disciplina.getCompetencias()[i] = competencia;
        }

        vetorDisciplina[d] = disciplina;
        d++;
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

    public void editarNomeAluno(int a, String editarNomeAluno) {
        vetorAluno[a].setNome(editarNomeAluno);
    }

    public void editarNomeProf(int a, String editarNomeProf) {
        vetorProf[a].setNome(editarNomeProf);
    }

    public void editarTitulacao(int ano, String nomeInstituicao, String tituloObtido, String tituloTCC, int indiceProf) {
        Titulacao titulacao = new Titulacao();
        titulacao.setAno(ano);
        titulacao.setNomeInstituicao(nomeInstituicao);
        titulacao.setTituloObtido(tituloObtido);
        titulacao.setTituloTCC(tituloTCC);
    
        vetorProf[indiceProf].setTitulacao(titulacao);
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

    public void aprovado() {
        Prompt.imprimir("Qual sua disciplina? ");
        int a = selecionarDisciplina();

        for (int i = 0; i < vetorDisciplina[a].getAlunos().length; i++) {

            int contadorNecessaria = 0;
            int contadorComplementar = 0;
            int satisfatoriaN = 0;
            int satisfatoriaC = 0;

            Prompt.imprimir("Aluno: " + vetorDisciplina[a].getAlunos()[i].getNome() + "\nRGM: " + vetorDisciplina[a].getAlunos()[i].getMatricula());

            for (int j = 0; j < vetorDisciplina[a].getCompetencias().length; j++) {
                Prompt.imprimir("Competência: " + vetorDisciplina[a].getCompetencias()[j].getDescricao());
                
                String satisfatorio = "";

                do {
                    satisfatorio = Prompt.lerLinha("Digite S para satisfatório e I para insastifatório: ");
                } while (satisfatorio != "S" || satisfatorio != "I");

                if (vetorDisciplina[a].getCompetencias()[j].isObrigatoria()) {
                    contadorNecessaria++;

                    if (satisfatorio == "S") {
                        satisfatoriaN++;
                    }
                } else {
                    contadorComplementar++;

                    if (satisfatorio == "S") {
                        satisfatoriaN++;
                    }
                }
            }

           float mediaN = satisfatoriaN / contadorNecessaria;
           float mediaC = satisfatoriaC / contadorComplementar; 

           if (mediaN == 1.0 && mediaC >= 0.5) {
                vetorDisciplina[a].getAlunos()[i].setAprovado(Aluno.Aprovado.APROVADO);
           } else if (mediaN < 0.5 && mediaC < 0.5) {
               vetorDisciplina[a].getAlunos()[i].setAprovado(Aluno.Aprovado.REPROVADO);
           } else {
               vetorDisciplina[a].getAlunos()[i].setAprovado(Aluno.Aprovado.PENDENTE);
           }
        }

        for (int i = 0; i < vetorDisciplina[a].getAlunos().length; i++) {
            switch (vetorDisciplina[a].getAlunos()[i].getAprovado()) {
                case APROVADO : 
                Prompt.imprimir("Aluno " + vetorDisciplina[a].getAlunos()[i].getNome() + ": Aprovado!");
                break;
                case PENDENTE : 
                Prompt.imprimir("Aluno " + vetorDisciplina[a].getAlunos()[i].getNome() + ": Pendente!");
                break;
                case REPROVADO : 
                Prompt.imprimir("Aluno " + vetorDisciplina[a].getAlunos()[i].getNome() + ": Reprovado!");
                break;
            }
        }
    }

}
