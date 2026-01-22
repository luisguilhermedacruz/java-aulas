package Encapsulation_Coupling.Abstracao;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Pagamento realizado através do cartão de crédito no valor de R$"+ amount);
    }
}
