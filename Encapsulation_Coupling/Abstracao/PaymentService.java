package Encapsulation_Coupling.Abstracao;

public class PaymentService {

    public void payBuy(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }

    public static void main(String[] args) {
       PaymentService paymentService = new PaymentService();
       
       PaymentMethod pix = new PixPayment();
       paymentService.payBuy(pix, 100);

       PaymentMethod cartao = new CreditCardPayment();
       paymentService.payBuy(cartao, 400);

       PaymentMethod money = new MoneyPayment();
       paymentService.payBuy(money, 6000);

    }
}
