package SSolid.Exemplo2;

import java.io.*;
import java.util.Scanner;

public class ProcessadorEncomendas {

    public void processar(Encomenda encomenda) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            encomenda.setIdEncomenda(sc.nextLine());

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            encomenda.setValorFrete(peso * 10);

            System.out.println("Valor do frete calculado: " + encomenda.getValorFrete());

            new ExportadorDeArquivo().salvarEmArquivo(encomenda.getIdEncomenda(), encomenda.getValorFrete());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
