package br.edu.up.Controle;
import br.edu.up.Modelo.*;

public class SeguradoController {

    public void cadastrarUsuario(String nome, String rg, String cpf, String sexo, String telefone, String endereco, String cep, String cidade){
      Segurado segurado = new Segurado();
      segurado.setNome(nome);
      segurado.setRG(rg);
      segurado.setCPF(cpf);
      segurado.setSexo(sexo);
      segurado.setTelefone(telefone);
      segurado.setEndereco(endereco);
      segurado.setCEP(cep);
      segurado.setCidade(cidade);
    }

    public String getcadastrarUsuario(){
      return getcadastrarUsuario();
    }

}
