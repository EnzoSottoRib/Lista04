package br.edu.up.Telas;
import java.util.Scanner;

import br.edu.up.Controle.ControleAeroporto;

public class MenuAeroporto {

    private static ControleAeroporto controleAeroporto = new ControleAeroporto();

    public void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja registrar um passageiro(a), comandante ou comissário(a)?\n1 - Passageiro(a)\n2 - Comandante\n3 - Comissario(a)\n: ");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                controleAeroporto.registrarPassageiro();
                break;

            case 2:
                controleAeroporto.registrarComandante();
                break;

            case 3:
                controleAeroporto.registrarComissario();
                break;
        }
        scanner.close();
    }
}
