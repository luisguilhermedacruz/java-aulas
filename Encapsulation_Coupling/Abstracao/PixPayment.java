package Encapsulation_Coupling.Abstracao;

public class PixPayment implements PaymentMethod {
    @Override    
    public void pay(double amount){
        System.out.println("Pagamento realizado via PIX no valor de R$"+ amount);
    }
}
