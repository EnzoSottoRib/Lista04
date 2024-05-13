package br.edu.up.telas;
import java.util.Scanner;

import br.edu.up.controles.*;
import br.edu.up.modelos.Agenda;
import br.edu.up.modelos.Comercial;
import br.edu.up.modelos.Contato;
import br.edu.up.modelos.Pessoal;

public class MenuAgenda {
    Scanner leitor = new Scanner (System.in);
    int inicio = 0;
    Contato contato = new Contato(inicio, null, null);
    Pessoal pessoal = new Pessoal(null);
    Agenda agenda = new Agenda();
    Comercial comercial = new Comercial(inicio, null, null, null);

    public void exibirMenu() {
      int opcao;
  
      do {
          System.out.println("\nESSA É SUA AGENDA PESSOAL PARA CONTATOS");
          System.out.println("Digite 1 para adicionar um Contato Pessoal.");
          System.out.println("Digite 2 caso queira adicionar um contato Comercial.");
          System.out.println("Digite 3 caso queira excluir um contato de sua Agenda.");
          System.out.println("Digite 4 para listar todos os contatos de sua Agenda.");
          System.out.println("Digite 5 para fechar sua Agenda.\n");
  
          opcao = leitor.nextInt();
  
          if (opcao == 1) {
            Pessoal novoContatoPessoal = new Pessoal(null); // Cria um novo contato pessoal
              novoContatoPessoal.criarContato();
              pessoal.criarContatoPessoal();
              agenda.adicionarContato(novoContatoPessoal);
          }
          if (opcao == 2) {
              Comercial novoContatoComercial = new Comercial(0, null, null, null); // Cria um novo contato comercial
              novoContatoComercial.criarContato();
              comercial.criarContatoComercial();
              agenda.adicionarContato(novoContatoComercial);
          }
          if (opcao == 3) {
              System.out.println("Digite o código do contato que deseja excluir:");
              int codigo = leitor.nextInt();
              agenda.excluirContato(codigo);
          }
          if (opcao == 4) {
              agenda.listarContatos();
          }
      } while (opcao < 5);
  }
}