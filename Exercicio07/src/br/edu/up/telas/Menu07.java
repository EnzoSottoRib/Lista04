package br.edu.up.telas;

import br.edu.up.Prompt;
import br.edu.up.controles.*;

public class Menu07 {
    
    ControleAcademico controle = new ControleAcademico();
    int n = 1;

    public void executar() {
        Prompt.imprimir("Bem-vindo ao Menu! :)");
        Prompt.imprimir("DIGITE:\n1: Aluno (adicionar, listar, alterar, excluir)");
        Prompt.imprimir("2: Professor (adicionar, listar, alterar, excluir)");
        Prompt.imprimir("3: Disciplina (adicionar, listar, alterar, excluir)");
        Prompt.imprimir("4: Visualizar situação de aprovação");
        Prompt.imprimir("0: Sair");

        n = Prompt.lerInteiro();
        int o = 0;

        switch (n) {
            case 1 : 
            Prompt.imprimir("DIGITE:\n1: Adicionar aluno");
            Prompt.imprimir("2: Listar alunos existentes");
            Prompt.imprimir("3: Alterar nome de aluno");
            Prompt.imprimir("4: Excluir aluno");
            Prompt.imprimir("5: Sair");

            o = Prompt.lerInteiro();

            switch (o) {
                case 1 : 
            }
            break;
            case 2 :
            Prompt.imprimir("DIGITE:\n1: Adicionar professor");
            Prompt.imprimir("2: Listar professores existentes");
            Prompt.imprimir("3: Alterar nome de professor");
            Prompt.imprimir("4: Alterar titulação de professor");
            Prompt.imprimir("5: Excluir professor");
            Prompt.imprimir("6: Sair");

            o = Prompt.lerInteiro();
            break;
            case 3 :
            Prompt.imprimir("DIGITE:\n1: Adicionar disciplina");
            Prompt.imprimir("2: Listar disciplinas existentes");
            Prompt.imprimir("3: Alterar nome de disciplina");
            Prompt.imprimir("4: Excluir disciplina");
            Prompt.imprimir("5: Sair");

            o = Prompt.lerInteiro();
            break;
            case 0 :
            Prompt.imprimir("Saindo...");
            break;
            default :
            Prompt.imprimir("Dígito inválido");
            break;
        }
    }

}
