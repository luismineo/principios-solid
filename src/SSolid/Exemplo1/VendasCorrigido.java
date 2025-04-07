package SSolid.Exemplo1;

import java.util.ArrayList;
import java.util.List;

public class VendasCorrigido {
        private List<Double> valoresDeVenda;


        public VendasCorrigido() {
            this.valoresDeVenda = new ArrayList<>();
        }

        public void adicionarVenda(Double valorDeVenda) {
            valoresDeVenda.add(valorDeVenda);
        }

        public double calcularTotalVendas() {
            double total = 0.0;
            for (Double valorDeVenda : valoresDeVenda) {
                total += valorDeVenda;
            }
            return total;
        }

        public List<Double> getValoresDeVenda() {
            return this.valoresDeVenda;
        }



    }

