package br.edu.up;

import br.edu.up.controles.ControleCadastro;
import br.edu.up.telas.MenuCadastro;

public class Programa {
    public static void main(String[] args) {
        ControleCadastro controleCadastro = new ControleCadastro();
        MenuCadastro menuCadastro = new MenuCadastro(controleCadastro);
        menuCadastro.executar();
    }
}

