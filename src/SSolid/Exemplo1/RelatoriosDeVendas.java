package SSolid.Exemplo1;

import java.util.List;

public class RelatoriosDeVendas {
    public String gerarRelatorioFormatado(VendasCorrigido vendas) {
        StringBuilder sb = new StringBuilder();
        sb.append("----- Relatório de Vendas -----\n");
        for (Double valorDeVenda: vendas.getValoresDeVenda()) {
            sb.append("Valor de venda: ").append(valorDeVenda).append("\n");
        }
        sb.append("Total: ").append(vendas.calcularTotalVendas()).append("\n");
        return sb.toString();
    }

    public void imprimirRelatorio(VendasCorrigido vendas) {
        System.out.println(gerarRelatorioFormatado(vendas));
    }
}
