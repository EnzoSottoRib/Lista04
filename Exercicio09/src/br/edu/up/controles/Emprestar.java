package br.edu.up.controles;

import br.edu.up.modelos.Cliente;

public class Emprestar {
        public static void executar(Cliente cliente, double valor){
        cliente.emprestar(valor);
    }
}
