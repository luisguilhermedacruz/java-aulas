package Encapsulation_Coupling;

public class BankTeste {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("LUISGUILHERME");
        BankAccount account2 = new BankAccount("LAURA");
        BankAccount account3 = new BankAccount("SANDRA");

        System.out.println("CONTA COM VALOR VÁLIDO ---- TESTANDO");
        account1.deposit(100);
        account1.showInfoOfAccount();
        account1.deposit(200);
        account1.showInfoOfAccount();
        account1.withdraw(200);
        account1.showInfoOfAccount();
        System.out.println("CONTA COM VALOR INVÁLIDO ---- TESTANDO");
        account2.deposit(0);
        System.out.println("CONTA COM VALOR INVÁLIDO ---- TESTANDO");
        account3.deposit(-100);

        

    }
}
