package OSolid.Exemplo1;

public class DescontoPascoa implements CalcularDesconto{
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.7;
    }
}
