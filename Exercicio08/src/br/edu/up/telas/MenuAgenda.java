package br.edu.up.telas;
import java.util.List;
import java.util.Scanner;
import br.edu.up.controles.*;
import br.edu.up.modelos.Contato;


public class MenuAgenda {
    Scanner leitor = new Scanner (System.in);
    int inicio = 0;

    Agenda agenda = new Agenda();

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

          switch(opcao){
            case 1: 
                System.out.printf("\nDigite o código de seu contato: ");
                int codigo = leitor.nextInt();
                System.out.printf("\nDigite o nome de seu contato: ");
                String nome = leitor.nextLine();
                System.out.printf("/nDigite o telefone de seu contato: ");
                String telefone = leitor.nextLine();
                System.out.printf("Digite o dia do aniversário de seu contato pessoal: ");
                String aniversario = leitor.nextLine();
                agenda.criarContato(codigo, nome, telefone);
                agenda.criarContatoPessoal(aniversario);

            break;
      
            case 2: 
                System.out.printf("\nDigite o código de seu contato: ");
                codigo = leitor.nextInt();
                System.out.printf("\nDigite o nome de seu contato: ");
                nome = leitor.nextLine();
                System.out.printf("/nDigite o telefone de seu contato: ");
                telefone = leitor.nextLine();
                System.out.printf("Digite o CNPJ de seu contato comercial: ");
                String cnpj = leitor.nextLine();
                agenda.criarContato(codigo, nome, telefone);
                agenda.criarContatoComercial(cnpj);

            break;

            case 3: 
                System.out.printf("Digite o código do contato que deseja excluir: ");
                codigo = leitor.nextInt();
                boolean contatoExcluido = agenda.excluirContato(codigo);

                if (!contatoExcluido) {
                  System.out.printf("\nNão foi encontrado contato com o código informado.");
              } else {
                  System.out.printf("\nContato excluído com sucesso.");
              }
                  
            break;

            case 4: 
                System.out.printf("Digite o código do contato que deseja encontrar: ");
                codigo = leitor.nextInt();
                Contato contatoEncontrado = agenda.buscarContato(codigo);

                    if (contatoEncontrado != null) {
                        System.out.println("\nO contato em questão tem as seguintes informações:");
                        System.out.println(contatoEncontrado); 
                    } else {
                        System.out.println("\nContato não encontrado com o código fornecido.");
                    }
                    
            break;

            case 5: 
                List<Contato> todosContatos = agenda.getListaContatos();
                    for (Contato contato : todosContatos) {
                    System.out.println(contato);
                    }
            break;

            case 6:
                System.out.printf("Saindo...");
            break;    
            
            default:
                  System.out.printf("Opção inválida.");
            break;
          }
  
          
      } while (opcao != 6);
  }
}

