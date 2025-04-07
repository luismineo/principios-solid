package OSolid.Exemplo2;

public class MainPagamentos {
    public static void main(String[] args) {
        SistemaPagamento pagamento = new SistemaPagamento();

        pagamento.realizarPagamento(150, new PagamentoBoleto());
        pagamento.realizarPagamento(100, new PagamentoCartao());
        pagamento.realizarPagamento(120, new PagamentoPIX());
    }
}
