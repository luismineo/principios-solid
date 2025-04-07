package LSOLID.Exemplo2;

public class ContaPoupanca implements IConta {
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
