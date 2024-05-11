package br.edu.up.modelos;
import java.util.List;
import java.util.ArrayList;

public class Agenda {
    private List<Contato> listaContatos;

    public Agenda() {
        this.listaContatos = new ArrayList<>();
    }

    public List<Contato> getListaContatos() {
        return listaContatos;
    }

    public void adicionarContato(Contato contato) {
        listaContatos.add(contato);
    }
    
}