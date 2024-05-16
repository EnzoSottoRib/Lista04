package br.edu.up.telas;
import br.edu.up.controles.*;
import java.util.Scanner;

public class MenuCadastro {

    public void executar() {

        ControleCadastro controle = new ControleCadastro();
        Scanner scanner = new Scanner(System.in);

    int opcao = 1;

    do {
        System.out.println("Bem vindo ao menu! Digite:");
        System.out.println("1 - Incluir pessoa\n2 - Incluir cliente empresa\n3 - Mostrar dados cliente pessoa\n4 - Mostrar dados cliente empresa\n5 - Emprestar para cliente pessoa\n6 - Emprestar para cliente empresa\n7 - Devolução de cliente pessoa\n8 - Devolução de cliente empresa\n9 - Sair");
        opcao = scanner.nextInt();
        switch (opcao){
            case 1:
            
        }
    } while (opcao != 9);

    }
}
