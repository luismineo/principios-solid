package OSolid.Exemplo1;

public class DescontoBlackFriday implements CalcularDesconto{
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.5;
    }
}
