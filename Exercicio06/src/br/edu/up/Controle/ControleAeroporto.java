package br.edu.up.Controle;

import br.edu.up.Modelos.*;

public class ControleAeroporto {

    private Aeronave aeronave;
    private Passageiro passageiro;
    private Passagem passagem;
    private Comandante comandante;
    private Comissario comissario;

    public ControleAeroporto() {
        this.aeronave = new Aeronave();
        this.passageiro = new Passageiro();
        this.passagem = new Passagem();
        this.comandante = new Comandante();
        this.comissario = new Comissario();
    }

        public void setAeronave(int codigo, String tipo, int qtdAssentos) {
            aeronave.setCodigoAeronave(codigo);
            aeronave.setTipoAeronave(tipo);
            aeronave.setQtdAssentos(qtdAssentos);
        }
    
        public String registrarPassageiro(String nome, int rg, int idBagagem, int idPassagem, int numAssento, String classe, int dataVoo) {
            passageiro.setNome(nome);
            passageiro.setRg(rg);
            passageiro.setCodigoAeronave(aeronave.getCodigoAeronave());
            passageiro.setIdBagagem(idBagagem);
            passageiro.setIdPassagem(idPassagem);
            passagem.setIdPassagem(idPassagem);
            passagem.setNumAssentos(numAssento);
            passagem.setClasseAssento(classe);
            passagem.setDataVoo(dataVoo);
            return "Passageiro registrado com sucesso!";
        }
    
        public String registrarComandante(String nome, int rg, int idAeronautica, int matriculaFuncionario, int totalHorasVoo) {
            comandante.setNome(nome);
            comandante.setRg(rg);
            comandante.setCodigoAeronave(aeronave.getCodigoAeronave());
            comandante.setIdAeronautica(idAeronautica);
            comandante.setMatriculaFuncionario(matriculaFuncionario);
            comandante.setTotalHorasVoo(totalHorasVoo);
            return "Comandante registrado com sucesso!";
        }
    
        public String registrarComissario(String nome, int rg, int idAeronautica, int matriculaFuncionario, String idiomasFluente) {
            comissario.setNome(nome);
            comissario.setRg(rg);
            comissario.setCodigoAeronave(aeronave.getCodigoAeronave());
            comissario.setIdAeronautica(idAeronautica);
            comissario.setMatriculaFuncionario(matriculaFuncionario);
            comissario.setIdiomasFluente(idiomasFluente);
            return "Comissário(a) registrado(a) com sucesso!";
        }

    

    
}
