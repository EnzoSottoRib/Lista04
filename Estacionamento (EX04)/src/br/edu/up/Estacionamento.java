package br.edu.up;

public class Estacionamento {
    private Carro[] vagas;
    private int entradas;
    private int saidas;
    private double valorPeriodo;
    private int vagasLivres;

    public Estacionamento(){
    }

    public Estacionamento(int numVagas, int entradas, int saidas, double valorPeriodo, int vagasLivres) {
        this.vagas = new Carro[10];
        this.entradas = entradas;
        this.saidas = saidas;
        this.valorPeriodo = valorPeriodo;
        this.vagasLivres = 10;

    }

    public String ocuparVaga(Carro carro){
        
        for(int i = 0; i < 10; i++){
            if (vagas[i] == null){
                vagas[i] = carro;
                vagasLivres --;
                entradas ++;
                return "Carro adicionado na vaga" + i;
            }
        }
        return "Nenhuma vaga disponível!";
    }

    public String verificarVagas(){
        return "Existem " + vagasLivres + " vagas livres!";
    }

    public String desocuparVaga(String placa){
        for (int i = 0; i < 10; i++){
            if (vagas[i] != null && vagas[i].getPlaca().equalsIgnoreCase(placa)){
                vagas[i] = null;
                vagasLivres++;
                saidas ++;
                return "Carro com placa " + placa + " removido da vaga!";
            }
        }
        return "Carro com placa " + placa + " não encontrado.";
    }

    public String emitirRelatorio(){
        valorPeriodo = entradas * 5;
        return entradas + " carros entraram.\n" + 
        saidas + " carros sairam.\n" + 
        "Valor de pagamentos no período: R$" + valorPeriodo; 
    }

}
