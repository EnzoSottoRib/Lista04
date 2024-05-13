package br.edu.up;
import br.edu.up.controles.*;
import br.edu.up.telas.MenuAgenda;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        MenuAgenda menuAgenda = new MenuAgenda();

        
        menuAgenda.exibirMenu();

    }
}
