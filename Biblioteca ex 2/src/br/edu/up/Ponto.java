package br.edu.up;

public class Ponto {

    double x;
    double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double calcularDistancia(Ponto ponto1, Ponto ponto2){
        double dx = ponto1.getX() - ponto2.getX();
        double dy = ponto1.getY() - ponto2.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static double calcularDistanciaC(Ponto ponto2){
        double dx = ponto2.getX() - 7;
        double dy = ponto2.getY() - 2;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

}
