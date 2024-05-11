package br.edu.up.telas;
import java.util.Scanner;

import br.edu.up.controles.*;
import br.edu.up.modelos.Agenda;
import br.edu.up.modelos.Contato;
import br.edu.up.modelos.Pessoal;

public class MenuAgenda {
    Scanner leitor = new Scanner (System.in);
    int inicio = 0;
    Contato contato = new Contato(inicio, null, null);
    Pessoal pessoal = new Pessoal(null);
    Agenda agenda = new Agenda();


    public void exibirMenu(){
        System.out.printf("ESSA É SUA AGENDA PESSOAL PARA CONTATOS\n Digite 1 para adicionar um Contato Pessoal.\n Digite 2 caso queira adicionar um contato Comercial.\n Digite 3 caso queira excluir um contato de sua Agenda.\n Digite 4 para listar todos os contatos de sua Agenda.\n Digite 5 para fechar sua Agenda.\n");
        inicio = leitor.nextInt();

        int opcao = leitor.nextInt();

        if(opcao == 1){
                contato.criarContato();
                pessoal.criarContatoPessoal();
                agenda.adicionarContato(contato);  
    }
  }
}


