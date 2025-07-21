package org.bankaccount;

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

class FixedDeposit extends Account {
    FixedDeposit(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance * 0.07;
    }
}

class BankSystem {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount(10000);
        Account a2 = new CurrentAccount(15000);
        Account a3 = new FixedDeposit(20000);

        System.out.println(a1.calculateInterest());
        System.out.println(a2.calculateInterest());
        System.out.println(a3.calculateInterest());
    }
}
