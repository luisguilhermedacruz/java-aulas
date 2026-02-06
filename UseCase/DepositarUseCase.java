package UseCase;

public class DepositarUseCase {
    
    public void executar(Conta conta, double valor){
        conta.depositar(valor);
        System.out.println("Depósito no valor de R$" + valor + " realizado com sucesso!");
    }
}
