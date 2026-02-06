package UseCase;

public class SacarUseCase {
    
    public void executar(Conta conta, double valor){
        conta.sacar(valor);
        System.out.println("Saque de R$" + valor + " feito com sucesso!");
    }
}
