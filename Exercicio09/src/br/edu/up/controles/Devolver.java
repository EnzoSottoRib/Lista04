package br.edu.up.controles;

import br.edu.up.modelos.Cliente;

public class Devolver {
        public static void executar(Cliente cliente, double valor){
        cliente.emprestar(valor);
    }
}
