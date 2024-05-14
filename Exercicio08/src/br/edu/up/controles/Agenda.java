package br.edu.up.controles;
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

            System.out.println(contato); 
            
        }
    }

    public void excluirContato(int codigo) {
        boolean contatoEncontrado = false;
        for (Contato contato : listaContatos) {
            if (contato.getCodigo() == codigo) {
                listaContatos.remove(contato);
                System.out.println("Contato removido com sucesso.");
                contatoEncontrado = true;
                break; // Para evitar a ConcurrentModificationException
            }
        }
        if (!contatoEncontrado) {
            System.out.println("Nenhum contato encontrado com o código especificado.");
        }
    }
}

