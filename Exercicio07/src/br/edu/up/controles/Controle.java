package br.edu.up.controles;

import br.edu.up.modelos.*;
import br.edu.up.Prompt;

public class Controle {
    
    Aluno vetorAluno[] = new Aluno[600];
    Prof vetorProf[] = new Prof[30];
    Disciplina vetorDisciplina[] = new Disciplina[30];

    int a = 0;
    int p = 0;
    int d = 0;

    public void adicionarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(Prompt.lerLinha("Digite o nome do aluno: "));
        aluno.setRg(Prompt.lerLinha("Digite o RG do aluno: "));
        aluno.setMatricula(Prompt.lerLinha("Digite a matrícula do aluno: "));
    }

}
