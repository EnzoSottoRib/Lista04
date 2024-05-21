package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;

public class ControleCadastro {

    List<ClientePessoa> listaPessoa = new ArrayList<ClientePessoa>();  
    List<ClienteEmpresa> listaEmpresa = new ArrayList<ClienteEmpresa>();
    
    public ControleCadastro(){
        this.listaPessoa = new ArrayList<>();
        this.listaEmpresa = new ArrayList<>();
    }

    private void addClientePessoa(ClientePessoa pessoa){
        listaPessoa.add(pessoa);
    }
 
    private void addClienteEmpresa(ClienteEmpresa pessoa){
        listaEmpresa.add(pessoa);
    }




        /* O menu apresentado ao usuário deve conter os seguintes itens (encerrar o programa no Sair):
        1. Incluir cliente pessoa
        2. Incluir cliente empresa
        3. Mostrar dados cliente pessoa
        4. Mostrar dados cliente empresa
        5. Emprestar para cliente pessoa
        6. Emprestar para cliente empresa
        7. Devolução de cliente pessoa
        8. Devolução de cliente empresa
        9. Sair */


}
