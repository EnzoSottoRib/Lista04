package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.ClienteEmpresa;

public class ControleCadastro {
    private List<ClientePessoa> listaPessoa;
    private List<ClienteEmpresa> listaEmpresa;

    public ControleCadastro() {
        this.listaPessoa = new ArrayList<>();
        this.listaEmpresa = new ArrayList<>();
    }

    public void addClientePessoa(ClientePessoa pessoa) {
        listaPessoa.add(pessoa);
    }

    public void addClienteEmpresa(ClienteEmpresa empresa) {
        listaEmpresa.add(empresa);
    }

    public List<ClientePessoa> getListaPessoa() {
        return listaPessoa;
    }

    public List<ClienteEmpresa> getListaEmpresa() {
        return listaEmpresa;
    }
}
