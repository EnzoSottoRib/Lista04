package br.edu.up.telas;
import br.edu.up.Util.Prompt;
import br.edu.up.controles.*;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.Endereco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCadastro {

    Scanner scanner = new Scanner(System.in);

    List<Cliente> listaClientePessoas = new ArrayList<Cliente>();
    List<Cliente> listaClienteEmpresas = new ArrayList<Cliente>();

    public void executar(List<Cliente> ListaClientePessoas, List<Cliente> ListaClienteEmpresas) {

        int opcao = 1;

        do {
            System.out.println("Bem vindo ao menu! Digite:");
            System.out.println("1 - Incluir cliente pessoa\n2 - Incluir cliente empresa\n3 - Mostrar dados cliente pessoa\n4 - Mostrar dados cliente empresa\n5 - Emprestar para cliente pessoa\n6 - Emprestar para cliente empresa\n7 - Devolução de cliente pessoa\n8 - Devolução de cliente empresa\n9 - Sair");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:addClientePessoa(listaClienteEmpresas);break;    
                case 2:addClienteEmpresa(listaClienteEmpresas);break;    
                case 3:
                int i = 1;
                for (Cliente cliente : listaClientePessoas){
                            ClientePessoa clientePessoa = (ClientePessoa) cliente;
                                Prompt.imprimir(clientePessoa.getDados(i));
                        }
                break;
                case 4:
                int j = 1;
                for (Cliente cliente : listaClienteEmpresas) {
                            j++;
                            ClienteEmpresa clienteEmpresa = (ClienteEmpresa) cliente;
                            Prompt.imprimir(clienteEmpresa.getDados(j));
                        }
                break;
                case 5:emprestarPessoa(listaClientePessoas);break;
                case 6:emprestarEmpresa(listaClienteEmpresas);break;
                case 7:devolverEmpresa(listaClientePessoas);break;
                case 8:devolverEmpresa(listaClienteEmpresas);break;
                case 9: Programa.parar();break;
            }
        } while (opcao != 9);

        scanner.close();

        }

        private void addClientePessoa(List<Cliente> listaClientes){
            System.out.println("Digite o nome do cliente pessoa: ");
            String nome = scanner.next();
            System.out.println("Digite o telefone do cliente pessoa: ");
            String telefone = scanner.next();
            System.out.println("Digite o email do cliente pessoa");
            String email = scanner.next();
            Endereco endereco = addEndereco();
            System.out.println("Digite o CPF do cliente pessoa: ");
            String cpf = scanner.next();
            System.out.println("Digite o peso: ");
            double peso = scanner.nextDouble();
            System.out.println("Digite a altura: ");
            double altura = scanner.nextDouble();

            addCliente.pessoa(listaClientePessoas, nome, telefone, email, endereco, cpf, peso, altura);
        }

        public void addClienteEmpresa(List<Cliente> listaClientes){
        
            System.out.println("Digite o nome do cliente empresa: ");
            String nome = scanner.next();
            System.out.println("Digite o telefone do cliente empresa: ");
            String telefone = scanner.next();
            System.out.println("Digite o email do cliente empresa");
            String email = scanner.next();
            Endereco endereco = addEndereco();
            System.out.println("Digite o CNPJ do cliente empresa: ");
            String cnpj = scanner.next();
            System.out.println("Digite a inscrição estadual: ");
            double inscEstadual = scanner.nextDouble();
            System.out.println("Digite o ano de fundação: ");
            int anoFundacao = scanner.nextInt();

            addCliente.cliente(listaClienteEmpresas, nome, telefone, email, endereco, cnpj, inscEstadual, anoFundacao);
    }

    public static void emprestarPessoa(List<Cliente> listaClientes){
        String CPF = Prompt.lerLinha("CPF do Cliente:");

        for (Cliente cliente : listaClientes) {
            if(cliente != null){
                ClientePessoa clientePessoa = (ClientePessoa) cliente;
                
                if(CPF.equalsIgnoreCase(clientePessoa.getCPF())){
                    double valor = Prompt.lerDecimal("Valor:");
                    Emprestar.executar(clientePessoa, valor);
                }
            }
        }
    }
    public static void emprestarEmpresa(List<Cliente> listaClientes){
        String CNPJ = Prompt.lerLinha("CNPJ da empresa:");

        for (Cliente cliente : listaClientes) {
            if(cliente != null){
                ClienteEmpresa clienteEmpresa = (ClienteEmpresa) cliente;
                
                if(CNPJ.equalsIgnoreCase(clienteEmpresa.getCnpj())){
                    double valor = Prompt.lerDecimal("Valor:");
                    Emprestar.executar(clienteEmpresa, valor);
                }
            }
        }
    }

    public static void devolverPessoa(List<Cliente> listaClientes){
        String CPF = Prompt.lerLinha("CPF do Cliente:");

        for (Cliente cliente : listaClientes) {
            if(cliente != null){
                ClientePessoa clientePessoa = (ClientePessoa) cliente;
                
                if(CPF.equalsIgnoreCase(clientePessoa.getCPF())){
                    double valor = Prompt.lerDecimal("Valor:");
                    Emprestar.executar(clientePessoa, valor);
                }
            }
        }
    }
    public static void devolverEmpresa(List<Cliente> listaClientes){
        String CNPJ = Prompt.lerLinha("CNPJ da empresa:");

        for (Cliente cliente : listaClientes) {
            if(cliente != null){
                ClienteEmpresa clienteEmpresa = (ClienteEmpresa) cliente;
                
                if(CNPJ.equalsIgnoreCase(clienteEmpresa.getCnpj())){
                    double valor = Prompt.lerDecimal("Valor:");
                    Emprestar.executar(clienteEmpresa, valor);
                }
            }
        }
    }

}
