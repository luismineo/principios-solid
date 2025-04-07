package OSolid.Exemplo2;

public class SistemaPagamento {
    public void realizarPagamento(double valor, IRealizarPagamento pagamento) {
        pagamento.realizarPagamento(valor);
    }
}
