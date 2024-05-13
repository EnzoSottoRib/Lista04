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
<<<<<<< HEAD:Exercicio08/src/br/edu/up/Controle/Agenda.java

    public void listarContatos() {
        System.out.println("Lista de Contatos:");
        for (Contato contato : listaContatos) {
            System.out.println(contato); // Supondo que você tenha implementado o método toString()  na classe Contato
        }
    }
=======
    
>>>>>>> bc95d46a08d3e32aab7ec2c2047028c123581021:Exercicio08/src/br/edu/up/modelos/Agenda.java
}