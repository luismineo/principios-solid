package OSolid.Exemplo1;

public class DescontoAniversario implements CalcularDesconto{
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.8;
    }
}
