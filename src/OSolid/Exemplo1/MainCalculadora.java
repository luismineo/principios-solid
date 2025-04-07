package OSolid.Exemplo1;

public class MainCalculadora {
    public static void main(String[] args) {
        DescontoNatal descontoNatal = new DescontoNatal();
        CalculadoraDesconto calcularaDesconto = new CalculadoraDesconto();
        System.out.println(calcularaDesconto.calcular(50.0, descontoNatal)); // 45
        System.out.println(calcularaDesconto.calcular(100.0, new DescontoAniversario())); // 80
        System.out.println(calcularaDesconto.calcular(100.0, new DescontoPascoa())); //70

    }

}
