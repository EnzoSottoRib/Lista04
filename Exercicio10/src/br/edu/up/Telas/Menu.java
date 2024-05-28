package br.edu.up.Telas;

import java.util.List;
import java.util.Scanner;
import br.edu.up.Controle.SeguradoController;
import br.edu.up.Controle.SeguroController;
import br.edu.up.Modelo.Seguro;

public class Menu {

    public void exibirMenu() {
        int opcao;
        Scanner leitor = new Scanner(System.in);
        SeguradoController seguradoController = new SeguradoController();
        SeguroController seguroController = new SeguroController();

        
        System.out.println("Cadastre seu usuário para acessar a apólice de seguros:");
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Digite seu RG:");
        String RG = leitor.nextLine();
        System.out.println("Digite seu CPF:");
        String CPF = leitor.nextLine();
        System.out.println("Digite qual seu sexo:");
        String sexo = leitor.nextLine();
        System.out.println("Digite seu telefone:");
        String telefone = leitor.nextLine();
        System.out.println("Digite seu endereço:");
        String endereco = leitor.nextLine();
        System.out.println("Digite seu CEP:");
        String CEP = leitor.nextLine();
        System.out.println("Digite sua cidade:");
        String cidade = leitor.nextLine();
        seguradoController.cadastrarUsuario(nome, RG, CPF, sexo, telefone, endereco, CEP, cidade);

        
        do {
            System.out.println("\nAPÓLICE DE SEGUROS");
            System.out.println("1. Incluir seguro.");
            System.out.println("2. Localizar seguro.");
            System.out.println("3. Excluir seguro.");
            System.out.println("4. Excluir todos os seguros.");
            System.out.println("5. Listar todos os seguros.");
            System.out.println("6. Ver quantidade de seguros.");
            System.out.println("7. Sair.");

            opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\nIncluir Seguro:");
                    System.out.println("Digite o número de sua apólice:");
                    String apolice = leitor.nextLine();
                    System.out.println("Digite o CPF cadastrado:");
                    String segurado = leitor.nextLine();
                    System.out.println("Digite o valor de sua apólice:");
                    Double vlrApolice = leitor.nextDouble();
                    leitor.nextLine(); 
                    System.out.println("Digite a data inicial da apólice:");
                    String dtaInicio = leitor.nextLine();
                    System.out.println("Digite a data final da apólice:");
                    String dtaFinal = leitor.nextLine();
                    seguroController.cadastrarSeguro(apolice, segurado, vlrApolice, dtaInicio, dtaFinal);
                    break;

                case 2:
                    System.out.println("\nLocalizar Seguro:");
                    System.out.println("Digite o número de sua apólice para localizar o seguro:");
                    String numeroApolice = leitor.nextLine();
                    Seguro seguroEncontrado = seguroController.buscarSeguroPorApolice(numeroApolice);

                    if (seguroEncontrado != null) {
                        System.out.println("\nO seguro em questão possui os seguintes valores:");
                        System.out.println(seguroEncontrado); 
                    } else {
                        System.out.println("\nSeguro não encontrado para o número de apólice fornecido.");
                    }
                    break;

                case 3:
                System.out.printf("Digite o número da apólice do seguro que deseja excluir: ");
                numeroApolice = leitor.nextLine();
                boolean seguroExcluido = seguroController.excluirSeguro(numeroApolice);
                
                if (!seguroExcluido) {
                    System.out.printf("\nSeguro não encontrado para o número da apólice fornecido.");
                } else {
                    System.out.printf("\nSeguro excluído com sucesso.");
                }
                    break;

                case 4:
                    seguroController.excluirTodosSeguros();
                    System.out.printf("Todos os seguros foram excluidos com sucesso!");
                    break;

                case 5:
                    List<Seguro> todosSeguros = seguroController.getSeguros();
                    for (Seguro seguro : todosSeguros) {
                    System.out.println(seguro);
                    }   
                    break;

                case 6:
                    System.out.printf("A quantidade de seguros cadastrados é de: %d", seguroController.getQnt());
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (opcao != 7);

        leitor.close(); 
    }
}

    


