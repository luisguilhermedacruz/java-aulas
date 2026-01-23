package Encapsulation_Coupling.Abstracao;

public class MoneyPayment implements PaymentMethod {
        @Override
        public void pay(double amount){
        System.out.println("Pagamento realizado através de dinheiro em espécie no valor de R$"+ amount);
    }
}
