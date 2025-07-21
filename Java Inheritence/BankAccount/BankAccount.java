package BankAccount;

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Number: ");
        acc.accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Holder Name: ");
        acc.holderName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        acc.balance = sc.nextDouble();
        
        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        
        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        acc.deposit(deposit);
        acc.withdraw(withdraw);
        acc.display();
        
        sc.close();
    }
}
