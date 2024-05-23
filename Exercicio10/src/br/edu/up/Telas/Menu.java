package br.edu.up.Telas;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import br.edu.up.Controle.*;
import br.edu.up.Modelo.*;


public class Menu {

     public void exibirMenu() {
      int opcao;
      Scanner leitor = new Scanner(System.in);
      SeguradoController seguradoController = new SeguradoController();
      SeguroController seguroController = new SeguroController();


      if(seguradoController.getcadastrarUsuario() == null){
        String nome = leitor.nextLine();
        String RG = leitor.nextLine();
        String CPF = leitor.nextLine();
        String sexo = leitor.nextLine();
        String telefone = leitor.nextLine();
        String endereco = leitor.nextLine();
        String CEP = leitor.nextLine();
        String cidade = leitor.nextLine();
        seguradoController.cadastrarUsuario(nome, RG, CPF, sexo, telefone, endereco, CEP, cidade);
      }
  
      do {
          System.out.println("\nAPÓLICE DE SEGUROS");
          System.out.println("1. Incluir seguro.");
          System.out.println("2. Localizar seguro.");
          System.out.println("3. Excluir seguro.");
          System.out.println("4. Excluir todos os seguros.");
          System.out.println("5. Listar todos os seguros.\n");
          System.out.println("6. Ver quantidade de seguros.\n");
          System.out.println("7. Sair.\n");

          opcao = leitor.nextInt();

          switch(opcao){
            case 1: 
            String apolice = leitor.nextLine();
            String segurado = leitor.nextLine();
            Double vlrApolice = leitor.nextDouble();
            String dtaInicio = leitor.nextLine();
            String dtaFinal = leitor.nextLine();
            seguroController.cadastrarSeguro(apolice, segurado, vlrApolice, dtaInicio, dtaFinal);
            break;

            case 2:
            
          }
          
          
      
    }while (opcao < 7);

  }

}
  

    


