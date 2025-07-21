package org.bankaccountdetails;

class Bank {
    String name;
    String branch;

    Bank(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    void bankName() {
        System.out.println("Bank Name: " + name);
    }

    void bankBranch() {
        System.out.println("Bank Branch: " + branch);
    }
}

class AccountHolder extends Bank {
    String holder;
    String accountNo;

    AccountHolder(String name, String branch, String holder, String accountNo) {
        super(name, branch);
        this.holder = holder;
        this.accountNo = accountNo;
    }

    void holderName() {
        System.out.println("Account Holder: " + holder);
    }

    void accountNumber() {
        System.out.println("Account Number: " + accountNo);
    }
}

class SavingsAccount extends AccountHolder {
    double interest;

    SavingsAccount(String name, String branch, String holder, String accountNo, double interest) {
        super(name, branch, holder, accountNo);
        this.interest = interest;
    }

    void interestRate() {
        System.out.println("Interest Rate: " + interest + "%");
    }
}

class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("State Bank", "Chennai", "Shailesh", "6116002451", 4.5);
        sa.bankName();
        sa.bankBranch();
        sa.holderName();
        sa.accountNumber();
        sa.interestRate();
    }
}
