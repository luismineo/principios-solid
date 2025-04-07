package SSolid.Exemplo1;

import java.util.ArrayList;
import java.util.List;

public class RelatorioVendas {
    private List<String> vendas;

    public RelatorioVendas() {
        this.vendas = new ArrayList<>();
    }

    public void adicionarVenda(String venda) {
        vendas.add(venda);
    }

    public double calcularTotalVendas() {
        double total = 0.0;
        for (String venda : vendas) {
            total += Double.parseDouble(venda);
        }
        return total;
    }

    public String gerarRelatorioFormatado() {
        StringBuilder sb = new StringBuilder();
        sb.append("----- Relatório de Vendas -----\n");
        for (String venda : vendas) {
            sb.append("Venda: ").append(venda).append("\n");
        }
        sb.append("Total: ").append(calcularTotalVendas()).append("\n");
        return sb.toString();
    }

    public void imprimirRelatorio() {
        System.out.println(gerarRelatorioFormatado());
    }
}

