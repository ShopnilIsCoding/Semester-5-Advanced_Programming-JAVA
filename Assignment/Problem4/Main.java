package Problem4;

abstract class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract void calculateInterest();  // Abstract method
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest for Savings Account calculated.");
    }
}

class FixedDepositAccount extends BankAccount {

    public FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest for Fixed Deposit Account calculated.");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount fixed = new FixedDepositAccount(5000);

        savings.calculateInterest();
        fixed.calculateInterest();
    }
}
