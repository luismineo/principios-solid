package OSolid.Exemplo2;

public class PagamentoBoleto implements IRealizarPagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via BOLETO.");
    }
}
