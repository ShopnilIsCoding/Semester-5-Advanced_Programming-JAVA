package lab_1.task_7;

import java.util.HashMap;
import java.util.Map;
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

   
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


class Customer {
    private String name;
    private String customerID;
    private Map<String, BankAccount> bankAccounts;

    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
        this.bankAccounts = new HashMap<>();
    }

   
    public String getName() {
        return name;
    }

    public String getCustomerID() {
        return customerID;
    }

    
    public void addBankAccount(BankAccount account) {
        bankAccounts.put(account.getAccountNumber(), account);
    }

    
    public void deposit(String accountNumber, double amount) {
        BankAccount account = bankAccounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    
    public void withdraw(String accountNumber, double amount) {
        BankAccount account = bankAccounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    
    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerID);
        for (BankAccount account : bankAccounts.values()) {
            account.displayAccountInfo();
        }
    }
}


public class BankSystem {
    public static void main(String[] args) {
        
        Customer customer1 = new Customer("Alice", "C001");
        Customer customer2 = new Customer("Bob", "C002");

        
        BankAccount account1 = new BankAccount("A001", 1000.0);
        BankAccount account2 = new BankAccount("A002", 2000.0);
        BankAccount account3 = new BankAccount("A003", 1500.0);

        
        customer1.addBankAccount(account1);
        customer1.addBankAccount(account2);
        customer2.addBankAccount(account3);

        
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();

        
        customer1.deposit("A001", 500.0);
        customer1.withdraw("A002", 300.0);
        customer2.deposit("A003", 700.0);
        customer2.withdraw("A003", 100.0);

        
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
    }
}
