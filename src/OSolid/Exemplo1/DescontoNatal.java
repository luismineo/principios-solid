package OSolid.Exemplo1;

public class DescontoNatal implements CalcularDesconto{
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.9;
    }
}
