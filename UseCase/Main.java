package UseCase;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(0);
        DepositarUseCase depositoUseCase = new DepositarUseCase();
        SacarUseCase saqueUseCase = new SacarUseCase();

        depositoUseCase.executar(conta1, 1000);
        System.out.println("Saldo atual: R$" + conta1.getSaldo());
        
        saqueUseCase.executar(conta1, 100);
        System.out.println("Saldo atual: R$" + conta1.getSaldo());
    }
}
