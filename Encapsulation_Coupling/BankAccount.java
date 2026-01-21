package Encapsulation_Coupling;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public void validateAmount(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("O valor de operação precisa ser de ao menos R$0,01");
        }
    }

    public void deposit(double amount){
        validateAmount(amount);
        balance += amount;
    }

    public void withdraw(double amount){
        validateAmount(amount);
        balance -= amount;
    }

    public void showInfoOfAccount(){
        System.out.println("Senhor(a) " + getOwner() + "seu saldo atualizado agora é de R$" + getBalance());
    }

}
