package LSOLID.Exemplo2;

public class ContaMain {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaBancaria();
        contaCorrente.depositar(1000);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        contaCorrente.sacar(500);
        System.out.println("Saldo após saque: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(1000);
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
        boolean resultadoSaque = contaPoupanca.sacar(500);
        System.out.println("Resultado do saque: " + resultadoSaque);
        System.out.println("Saldo após tentativa de saque: " + contaPoupanca.getSaldo());
    }
}
