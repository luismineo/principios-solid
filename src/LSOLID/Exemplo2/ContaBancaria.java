package LSOLID.Exemplo2;

public class ContaBancaria implements IConta{
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        saldo -= valor;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }
}


