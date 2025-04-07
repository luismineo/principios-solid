package DSOLID.Exemplo2;

public class ServicoPagamento {
    private ConsoleLogger logger = new ConsoleLogger();

    public void pagar(double valor) {
        // Lógica de pagamento
        logger.log("Pagamento de R$" + valor + " realizado com sucesso!");
    }
}

