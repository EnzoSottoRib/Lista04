package br.edu.up.telas;
import br.edu.up.controles.*;
import java.util.Scanner;

public class MenuCadastro {

    private ControleCadastro controle;
        private Scanner scanner;

        public MenuCadastro(ControleCadastro controle){
            this.controle = controle;
            this.scanner = new Scanner(System.in);
        }

    public void executar() {

    int opcao = 1;

    do {
        System.out.println("Bem vindo ao menu! Digite:");
        System.out.println("1 - Incluir cliente pessoa\n2 - Incluir cliente empresa\n3 - Mostrar dados cliente pessoa\n4 - Mostrar dados cliente empresa\n5 - Emprestar para cliente pessoa\n6 - Emprestar para cliente empresa\n7 - Devolução de cliente pessoa\n8 - Devolução de cliente empresa\n9 - Sair");
        opcao = scanner.nextInt();
        switch (opcao){
            case 1:
            addClientePessoa();
            break;
        }
    } while (opcao != 9);

    scanner.close();

    }

    private void addClientePessoa(){
        System.out.println("Digite o nome do cliente pessoa: ");
        String nome = scanner.next();
        System.out.println("Digite o telefone do cliente pessoa: ");
        String telefone = scanner.next();
        System.out.println("Digite o email do cliente pessoa");
        String email = scanner.next();
        System.out.println("Digite a rua: ");
        String rua = scanner.nextLine();
        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o bairro: ");
        String bairro = scanner.nextLine();
        System.out.println("Digite o cep: ");
        int cep = scanner.nextInt();
        System.out.println("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();
        System.out.println("Digite a UF: ");
        String uf = scanner.nextLine();
        System.out.println("Digite o CPF do cliente pssoa: ");
        String cpf = scanner.next();
        System.out.println("Digite o peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        Cliente pessoa = new Cliente(nome, telefone, email )
    }

}
