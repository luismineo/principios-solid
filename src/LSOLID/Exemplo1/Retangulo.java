package LSOLID.Exemplo1;

public class Retangulo implements FormaGeometrica{
    protected double largura;
    protected double altura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea(double altura, double largura) {
        return altura*largura;
    }
}



