package edu.up.modelos;

public class Estacionamento {

    private Carro[] vagas;
    private int entradas;
    private int saidas;
    private int vagasLivres;

    public Estacionamento() {
        this.vagas = new Carro[10];
        this.entradas = 0;
        this.saidas = 0;
        this.vagasLivres = 10;
    }

    public String ocuparVaga(Carro carro) {
        for (int i = 0; i < 10; i++) {
            if (vagas[i] == null) {
                vagas[i] = carro;
                vagasLivres--;
                entradas++;
                return "Carro adicionado na vaga!";
            }
        }
        return "Nenhuma vaga disponível!";
    }

    public String lerVagasOcupadas(){
        return "Todas as vagas ocupadas";
    }

    public String desocuparVaga(String placaRemover) {
        for (int i = 0; i < 10; i++) {
            if (vagas[i] != null && vagas[i].getPlaca().equalsIgnoreCase(placaRemover)) {
                vagas[i] = null;
                vagasLivres++;
                saidas++;
                return "Carro com placa " + placaRemover + " removido da vaga!";
            }
        }
        return "Carro com placa " + placaRemover + " não encontrado.";
    }

    public String emitirRelatorio() {
        double valorPeriodo = entradas * 5.0; 
        return "Entradas: " + entradas + "\nSaídas: " + saidas + "\nVagas livres: " + vagasLivres +
                "\nValor de pagamentos no período: R$" + valorPeriodo;
    }

    public int getVagasLivres() {
        return vagasLivres;
    }
}
