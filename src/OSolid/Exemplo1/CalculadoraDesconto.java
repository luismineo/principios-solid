package OSolid.Exemplo1;

public class CalculadoraDesconto {
    public double calcular(double valor, CalcularDesconto calcularDesconto) {
        return calcularDesconto.aplicarDesconto(valor);
    }
}
