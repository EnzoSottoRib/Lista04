package edu.up.modelos;

public class Estacionamento {
    private Carro[] vagas;
    private int entradas;
    private int saidas;
    private double valorPeriodo;
    private int vagasLivres = 10;

    public Estacionamento(){
        this.vagas = new Carro[10];
        this.vagasLivres = 10;
    }

    public Estacionamento(int vagas, int entradas, int saidas, double valorPeriodo, int vagasLivres, String placaRemover) {
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
                return "Carro adicionado na vaga!";
            }
        }
        return "Nenhuma vaga disponível!";
    }

    // enzo: o for roda todas as vagas do estacionamento e verifica placa uma por uma, quando acha a placa que é pra ser removida ele tira do estacionamento e uma nova vaga é liberada
    public String desocuparVaga(String placaRemover){

        for (int i = 0; i < 10; i++){
            if (vagas[i] != null && vagas[i].getPlaca().equalsIgnoreCase(placaRemover)){
                vagas[i] = null;
                vagasLivres++;
                saidas ++;
                return "Carro com placa " + placaRemover + " removido da vaga!";
            }
        }
        return "Carro com placa " + placaRemover + " não encontrado.";
    }

    // enzo: relatório basiquinho, e separei os textos por linha pra n ficar muito gigante
    public String emitirRelatorio(){
        Double valorPeriodo = entradas * 5.0;
        return entradas + " carros entraram.\n" + 
        saidas + " carros sairam.\n" + 
        "Valor de pagamentos no período: R$" + valorPeriodo; 
    }

    public int getVagasLivres() {
        return vagasLivres;
    }

}
