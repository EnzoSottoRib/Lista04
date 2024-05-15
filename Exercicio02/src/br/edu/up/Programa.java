package br.edu.up;
public class Programa {
    public static void main(String[] args) throws Exception {

        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2, 5);

        System.out.printf("A distância entre o ponto 1 e o ponto 2 é: %.2f", Ponto.calcularDistancia(ponto1, ponto2));

        System.out.printf("\nA distância entre o ponto 2 e as coordenadas (7, 2) é: %.2f", Ponto.calcularDistanciaC(ponto2));

        ponto1.setX(10);
        ponto1.setY(3);

    }
}
