package bank_account;

import java.util.Scanner;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= 20000) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Insufficient funds or limit exceeded.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed: Insufficient funds.");
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account type (savings/current): ");
        String type = sc.nextLine();

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account;
        if (type.equalsIgnoreCase("savings")) {
            account = new SavingsAccount(accNo, balance);
        } else {
            account = new CurrentAccount(accNo, balance);
        }

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Balance after deposit: " + account.getBalance());

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        
        sc.close();
    }
}
