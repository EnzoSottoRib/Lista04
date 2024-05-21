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

    public void excluirAluno(int b) {
        for (int i = 0; i < vetorDisciplina.length; i++) {
            for (int j = 0; j < vetorDisciplina[i].getAlunos().length; j++) {
                if (vetorAluno[b] == vetorDisciplina[i].getAlunos()[j]) {
                    vetorDisciplina[i].getAlunos()[j] = null;
                }
            }
        }

        vetorAluno[b] = null;
    }

    public void excluirProf(int b) {
        for (int i = 0; i < vetorDisciplina.length; i++) {
            if (vetorDisciplina[i].getProf().getMatricula() == vetorProf[b].getMatricula()) {
                vetorDisciplina[i].setProf(null);
            }
        }

        vetorProf[b] = null;
    }

    public void excluirDisciplina(int b) {
        for (int i = 0; i < vetorProf.length; i++) {
            if (vetorDisciplina[b].getProf().getMatricula() == vetorProf[i].getMatricula()) {
                vetorProf[i].setDisciplina(null);
            }
        }

        for (int i = 0; i < vetorAluno.length; i++) {
            for (int j = 0; j < vetorAluno[i].getDisciplinas().length; j++) {
                if (vetorDisciplina[b].getId() == vetorAluno[i].getDisciplinas()[j].getId()) {
                    vetorAluno[i].getDisciplinas()[j] = null;
                }
            }
        }

        // ana: tiro primeiro a  disciplina dos objetos prof e aluno

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

    public void editarNomeDisciplina(int a, String editarNomeDisciplina) {
        vetorDisciplina[a].setNome(editarNomeDisciplina);

        for (int i = 0; i < vetorProf.length; i++) {
            if (vetorDisciplina[a].getProf().getMatricula() == vetorProf[i].getMatricula()) {
                vetorProf[i].setDisciplina(vetorDisciplina[a]);
            }
        }
        // ana: arrumando pra que o prof também tenha o nome da disciplina atualizado!

        for (int i = 0; i < vetorAluno.length; i++) {
            for (int j = 0; j < vetorAluno[i].getDisciplinas().length; j++) {
                if (vetorDisciplina[a].getId() == vetorAluno[i].getDisciplinas()[j].getId()) {
                    vetorAluno[i].getDisciplinas()[j] = vetorDisciplina[a];
                }
            }
        }
        // ana: fiz a mesma coisa com aluno!
    }

    public void novoProfDisciplina (int a, int b) {
        vetorDisciplina[a].setProf(vetorProf[b]);
        vetorProf[b].setDisciplina(vetorDisciplina[a]);
    }

    public void novoAlunoDisciplina (int a, int i, int b) {
        vetorDisciplina[a].getAlunos()[i] = vetorAluno[b];
        for (int j = 0; j < 5; j++) {
            if (vetorAluno[b].getDisciplinas()[j] == null) {
                vetorAluno[b].getDisciplinas()[j] = vetorDisciplina[a];
                break;
            }
        }
    }

    public void aprovado() {

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
