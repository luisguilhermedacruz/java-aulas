package UseCase;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial){
        if( saldoInicial < 0){
            throw new IllegalArgumentException("Saldo Inválido!");
        }

        this.saldo = saldoInicial;
    }

    public void sacar(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }

        if (valor > saldo) {
            throw new IllegalStateException("Saldo infuficiente!");
        }
        
        saldo -= valor;

    }

    public void depositar(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor para depósito inválido!");
        }

        saldo += valor;
    }

    public double getSaldo(){
        return saldo;
    }

}
