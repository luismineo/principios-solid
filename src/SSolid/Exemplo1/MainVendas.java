package SSolid.Exemplo1;

public class MainVendas {
    public static void main(String[] args) {
        VendasCorrigido vendasCorrigido = new VendasCorrigido();
        VendasCorrigido vendasCorrigido2 = new VendasCorrigido();
        vendasCorrigido.adicionarVenda(10.0);
        vendasCorrigido.adicionarVenda(15.0);
        vendasCorrigido.adicionarVenda(20.0);

        vendasCorrigido2.adicionarVenda(11.0);
        vendasCorrigido2.adicionarVenda(13.0);
        vendasCorrigido2.adicionarVenda(24.0);
        vendasCorrigido2.adicionarVenda(1133.0);
        vendasCorrigido2.adicionarVenda(135.0);
        vendasCorrigido2.adicionarVenda(242.0);


        RelatoriosDeVendas relatorioVendas = new RelatoriosDeVendas();
        relatorioVendas.imprimirRelatorio(vendasCorrigido2);
    }
}
