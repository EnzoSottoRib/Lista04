package br.edu.up.Controle;
import br.edu.up.Controle.Contato;
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

    public void listarContatos() {
        System.out.println("Lista de Contatos:");
        for (Contato contato : listaContatos) {
            System.out.println(contato); // Supondo que você tenha implementado o método toString() na classe Contato
        }
    }
}