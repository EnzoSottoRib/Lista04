package br.edu.up.telas;

import java.util.Arrays;

import br.edu.up.Prompt;
import br.edu.up.controles.*;
import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disciplina;
import br.edu.up.modelos.Prof;

public class Menu07 {
    
    ControleAcademico controle = new ControleAcademico();
    int n = 1;

    public String listarAlunos() {
        if (controle.getVetorAluno() == null) {
            return "Não há alunos registrados.";
        } else {
            StringBuilder sb = new StringBuilder();
            int index = 0; 
    
            for (Aluno aluno : controle.getVetorAluno()) {
                sb.append("Aluno ").append(index).append(":\n");
                sb.append(aluno.toString()).append("\n");
                index++;
            }
    
            return sb.toString();
        }
    }

    public String listarProf() {
        if (controle.getVetorProf() == null) {
            return "Não há professores registrados.";
        } else {
            StringBuilder sb = new StringBuilder();
            int index = 0; 

            for (Prof prof : controle.getVetorProf()) {
                sb.append("Prof ").append(index).append(":\n");
                sb.append(prof.toString()).append("\n");
                index++;
            }
            return sb.toString();
        }
    }

    public String listarDisciplina() {
        if (controle.getVetorDisciplina() == null) {
            return "Não há disciplinas registradas.";
        } else {
            StringBuilder sb = new StringBuilder();
            int index = 0; 
        
            for (Disciplina disciplina : controle.getVetorDisciplina()) {
                sb.append("Disciplina ").append(index).append(":\n");
                sb.append(disciplina.toString()).append("\n");
                index++;
            }
        
            return sb.toString(); 
        }
    }

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
            Prompt.imprimir("0: Sair");

            o = Prompt.lerInteiro();

            switch (o) {
                case 1 : 
                    String nome = Prompt.lerLinha("Digite o nome do aluno: ");
                    String rg = Prompt.lerLinha("Digite o RG do aluno: ");
                    String matricula = Prompt.lerLinha("Digite a matrícula do aluno: ");
            
                    controle.adicionarAluno(nome, rg, matricula); 
                    break;
                case 2 :
                    listarAlunos();
                    break;
                case 3 :
                    listarAlunos();
                    int a = Prompt.lerInteiro("Defina o índice de seu aluno:");
                    String editarNomeAluno = Prompt.lerLinha("Digite o nome do aluno: ");
                    controle.editarNomeAluno(a, editarNomeAluno);
                    break;
                case 4 : 
                    listarAlunos();
                    int b = Prompt.lerInteiro("Defina o índice de seu aluno:");
                    controle.excluirAluno(b);
                    break;
                case 0 : Prompt.imprimir("Saindo..."); break;
                default : Prompt.imprimir("Dígito inválido"); break;
            }

            break;
            case 2 :
            Prompt.imprimir("DIGITE:\n1: Adicionar professor");
            Prompt.imprimir("2: Listar professores existentes");
            Prompt.imprimir("3: Alterar nome de professor");
            Prompt.imprimir("4: Alterar titulação de professor");
            Prompt.imprimir("5: Excluir professor");
            Prompt.imprimir("0: Sair");

            o = Prompt.lerInteiro();

            switch (o) {
                case 1 : 
                    String nome = Prompt.lerLinha("Digite o nome do professor: ");
                    String rg = Prompt.lerLinha("Digite o RG do professor: ");
                    String matricula = Prompt.lerLinha("Digite a matrícula do professor: ");
                    int nLattes = Prompt.lerInteiro("Digite o número Lattes do professor: ");
            
                    Prompt.imprimir("Agora vamos registrar sua titulação: ");
            
                    String nomeInstituicao = Prompt.lerLinha("Digite o nome da instituição: ");
                    int ano = Prompt.lerInteiro("Digite o ano de obtenção da titulação: ");
                    String tituloObtido = Prompt.lerLinha("Digite o título obtido: ");
                    String tituloTCC = Prompt.lerLinha("Digite o título do TCC: ");
            
                    controle.adicionarProf(nome, rg, matricula, nLattes, nomeInstituicao, ano, tituloObtido, tituloTCC);
                    break;
                case 2 :
                    listarProf();
                    break;
                case 3 :
                    listarProf();
                    int a = Prompt.lerInteiro("Defina o índice de seu professor: ");
                    String editarNomeProfessor = Prompt.lerLinha("Digite o nome do professor: ");
                    controle.editarNomeProf(a, editarNomeProfessor);
                    break;
                case 4 :
                    listarProf();
                    int b = Prompt.lerInteiro("Defina o índice de seu professor: ");

                    int anoE = Prompt.lerInteiro("Digite o ano de conclusão: ");
                    String nomeInstituicaoE = Prompt.lerLinha("Digite o nome da instituição: ");
                    String tituloObtidoE = Prompt.lerLinha("Digite o título obtido: ");
                    String tituloTCCE = Prompt.lerLinha("Digite o título do TCC: ");
            
                    controle.editarTitulacao(anoE, nomeInstituicaoE, tituloObtidoE, tituloTCCE, b);
                    break;
                case 5 :
                    listarProf();
                    int c = Prompt.lerInteiro("Defina o índice de seu professor: ");
                    controle.excluirProf(c);
                    break;
                case 0 : Prompt.imprimir("Saindo..."); break;
                default : Prompt.imprimir("Dígito inválido"); break;
            }

            break;
            case 3 :
            Prompt.imprimir("DIGITE:\n1: Adicionar disciplina");
            Prompt.imprimir("2: Listar disciplinas existentes");
            Prompt.imprimir("3: Alterar nome de disciplina");
            Prompt.imprimir("4: Excluir disciplina");
            Prompt.imprimir("0: Sair");

            o = Prompt.lerInteiro();

            switch (o) {
                case 1 : 
                    String nomeDisciplina = Prompt.lerLinha("Digite o nome da disciplina: ");
                    String idDisciplina = Prompt.lerLinha("Digite o ID da disciplina: ");

                    listarProf();
                    int iP = Prompt.lerInteiro("Digite o índice do professor: ");

                    int[] indicesAlunos = new int[30];
                    int contadorAlunos = 0;

                    while (true) {
                        listarAlunos();
                        int b = Prompt.lerInteiro("Digite o índice do aluno: ");

                        indicesAlunos[contadorAlunos] = b;
                        contadorAlunos++;

                        // ana: basicamente, ao invés de levar todos os objetos alunos (e o objeto prof ali em cima), levamos seus índices e os adicionamos no controle :)
                    }

                    String[] competenciasDescricoes = new String[4];
                    boolean[] competenciasObrigatorias = new boolean[4];

                    for (int i = 0; i < 4; i++) {
                        competenciasDescricoes[i] = Prompt.lerLinha("Digite uma breve descrição da competência: ");
                        
                        String comp;
                        do {
                            comp = Prompt.lerLinha("Digite N caso a competência seja necessária, ou C caso ela seja complementar: ");
                        } while (!comp.equals("N") && !comp.equals("C"));
            
                        competenciasObrigatorias[i] = comp.equals("N");
                    }

                    controle.adicionarDisciplina(nomeDisciplina, idDisciplina, iP, Arrays.copyOf(indicesAlunos, contadorAlunos), Arrays.copyOf(competenciasDescricoes, 4), competenciasObrigatorias);
                    // ana: sobre "Arrays.copyOf" - o primeiro parametro sao os elementos em si, enquanto o segundo e o tamanho do vetor :) 
                    break;
                case 2 : ; break;
                case 3 : ; break;
                case 4 : ; break;
                case 0 : Prompt.imprimir("Saindo..."); break;
                default : Prompt.imprimir("Dígito inválido"); break;
            }

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
