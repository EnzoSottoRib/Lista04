package br.edu.up.controles;
import java.util.List;
import br.edu.up.modelos.*;


import java.util.ArrayList;

public class Agenda {
    private List<Contato> listaContatos;

    public Agenda() {
        this.listaContatos = new ArrayList<>();
    }

    public List<Contato> getListaContatos() {
        return listaContatos;
    }

    public void criarContato(int codigo, String nome, String telefone){
        Contato contato = new Contato();
        contato.setCodigo(codigo);
        contato.setNome(nome);
        contato.setTelefone(telefone);
    }


    public void criarContatoComercial(String cnpj){
        Comercial comercial = new Comercial();
        comercial.setCnpj(cnpj);
    }

    public void criarContatoPessoal(String aniversario){
        Pessoal pessoal = new Pessoal();
        pessoal.setAniversario(aniversario);
    }

    public Contato buscarContato(Integer codigo) {
        for (Contato contato : listaContatos) {
            if (contato.getCodigo().equals(codigo)) {
                return contato;
            }
        }
        return null; 
    }

    public boolean excluirContato(Integer codigo) {
        Contato contatoParaExcluir = null;
        for (Contato contato : listaContatos) {
            if (contato.getCodigo().equals(codigo)) {
                contatoParaExcluir = contato;
                break;
            }
        }
        if (contatoParaExcluir != null) {
            listaContatos.remove(contatoParaExcluir);
            return true; 
        } else {
            return false;
        }
    }


    

}

