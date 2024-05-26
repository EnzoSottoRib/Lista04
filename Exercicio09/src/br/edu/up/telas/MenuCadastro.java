package br.edu.up.telas;

import br.edu.up.util.Prompt;
import br.edu.up.controles.ControleCadastro;
import br.edu.up.controles.Emprestar;
import br.edu.up.controles.Devolver;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.Endereco;
import br.edu.up.modelos.Cidade;

import java.util.Scanner;

public class MenuCadastro {
    private Scanner scanner;
    private ControleCadastro controleCadastro;

    public MenuCadastro(ControleCadastro controleCadastro) {
        this.scanner = new Scanner(System.in);
        this.controleCadastro = controleCadastro;
    }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println("Bem vindo ao menu! Digite:");
            System.out.println("1 - Incluir cliente pessoa");
            System.out.println("2 - Incluir cliente empresa");
            System.out.println("3 - Mostrar dados cliente pessoa");
            System.out.println("4 - Mostrar dados cliente empresa");
            System.out.println("5 - Emprestar para cliente pessoa");
            System.out.println("6 - Emprestar para cliente empresa");
            System.out.println("7 - Devolução de cliente pessoa");
            System.out.println("8 - Devolução de cliente empresa");
            System.out.println("9 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    addClientePessoa();
                    break;
                case 2:
                    addClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosPessoa();
                    break;
                case 4:
                    mostrarDadosEmpresa();
                    break;
                case 5:
                    emprestarPessoa();
                    break;
                case 6:
                    emprestarEmpresa();
                    break;
                case 7:
                    devolverPessoa();
                    break;
                case 8:
                    devolverEmpresa();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 9);
        scanner.close();
    }

    private void addClientePessoa() {
        System.out.println("Digite o nome do cliente pessoa: ");
        String nome = scanner.next();
        System.out.println("Digite o telefone do cliente pessoa: ");
        String telefone = scanner.next();
        System.out.println("Digite o email do cliente pessoa: ");
        String email = scanner.next();
        Endereco endereco = addEndereco();
        System.out.println("Digite o CPF do cliente pessoa: ");
        String cpf = scanner.next();
        System.out.println("Digite o peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        ClientePessoa pessoa = new ClientePessoa(nome, telefone, email, cpf, peso, altura);
        pessoa.setEndereco(endereco);
        controleCadastro.addClientePessoa(pessoa);
    }

    private void addClienteEmpresa() {
        System.out.println("Digite o nome do cliente empresa: ");
        String nome = scanner.next();
        System.out.println("Digite o telefone do cliente empresa: ");
        String telefone = scanner.next();
        System.out.println("Digite o email do cliente empresa: ");
        String email = scanner.next();
        Endereco endereco = addEndereco();
        System.out.println("Digite o CNPJ do cliente empresa: ");
        String cnpj = scanner.next();
        System.out.println("Digite a inscrição estadual: ");
        String inscEstadual = scanner.next();
        System.out.println("Digite o ano de fundação: ");
        int anoFundacao = scanner.nextInt();

        ClienteEmpresa empresa = new ClienteEmpresa(nome, telefone, email, cnpj, inscEstadual, anoFundacao);
        empresa.setEndereco(endereco);
        controleCadastro.addClienteEmpresa(empresa);
    }

    private Endereco addEndereco() {
        System.out.println("Digite a rua: ");
        String rua = scanner.next();
        System.out.println("Digite o número: ");
        String numero = scanner.next();
        System.out.println("Digite o bairro: ");
        String bairro = scanner.next();
        System.out.println("Digite o CEP: ");
        String cep = scanner.next();
        System.out.println("Digite o nome da cidade: ");
        String cidadeNome = scanner.next();
        System.out.println("Digite a UF da cidade: ");
        String cidadeUF = scanner.next();

        Cidade cidade = new Cidade(cidadeNome, cidadeUF);
        return new Endereco(rua, numero, bairro, cep, cidade);
    }

    private void mostrarDadosPessoa() {
        int i = 1;
        for (ClientePessoa cliente : controleCadastro.getListaPessoa()) {
            System.out.println(cliente.getDados(i));
            i++;
        }
    }

    private void mostrarDadosEmpresa() {
        int i = 1;
        for (ClienteEmpresa cliente : controleCadastro.getListaEmpresa()) {
            System.out.println(cliente.getDados(i));
            i++;
        }
    }

    private void emprestarPessoa() {
        System.out.println("Digite o CPF do cliente pessoa: ");
        String cpf = scanner.next();
        for (ClientePessoa cliente : controleCadastro.getListaPessoa()) {
            if (cpf.equalsIgnoreCase(cliente.getCpf())) {
                System.out.println("Digite o valor do empréstimo: ");
                double valor = scanner.nextDouble();
                Emprestar.executar(cliente, valor);
                break;
            }
        }
    }

    private void emprestarEmpresa() {
        System.out.println("Digite o CNPJ do cliente empresa: ");
        String cnpj = scanner.next();
        for (ClienteEmpresa cliente : controleCadastro.getListaEmpresa()) {
            if (cnpj.equalsIgnoreCase(cliente.getCnpj())) {
                System.out.println("Digite o valor do empréstimo: ");
                double valor = scanner.nextDouble();
                Emprestar.executar(cliente, valor);
                break;
            }
        }
    }

    private void devolverPessoa() {
        System.out.println("Digite o CPF do cliente pessoa: ");
        String cpf = scanner.next();
        for (ClientePessoa cliente : controleCadastro.getListaPessoa()) {
            if (cpf.equalsIgnoreCase(cliente.getCpf())) {
                System.out.println("Digite o valor da devolução: ");
                double valor = scanner.nextDouble();
                Devolver.executar(cliente, valor);
                break;
            }
        }
    }

    private void devolverEmpresa() {
        System.out.println("Digite o CNPJ do cliente empresa: ");
        String cnpj = scanner.next();
        for (ClienteEmpresa cliente : controleCadastro.getListaEmpresa()) {
            if (cnpj.equalsIgnoreCase(cliente.getCnpj())) {
                System.out.println("Digite o valor da devolução: ");
                double valor = scanner.nextDouble();
                Devolver.executar(cliente, valor);
                break;
            }
        }
    }
}
