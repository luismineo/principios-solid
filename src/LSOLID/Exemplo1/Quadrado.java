package LSOLID.Exemplo1;

public class Quadrado implements FormaGeometrica {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(double altura, double largura) {
        return lado*lado;
    }
}
