package OSolid.Exemplo2;

public class PagamentoPIX implements IRealizarPagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}
