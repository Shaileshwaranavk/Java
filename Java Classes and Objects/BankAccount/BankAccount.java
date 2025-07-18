package BankAccount;

import java.util.*;

public class BankAccount {

    String Name;
    double Balance;

    BankAccount(String Name, double Balance) {
        this.Name = Name;
        this.Balance = Balance;
    }

    void DepositMoney(double Amount) {
        Balance += Amount;
        System.out.println();
        System.out.println("Amount has been deposited successfully.");
        System.out.println("Deposited Amount: " + Amount);
        System.out.println("Updated Balance: " + Balance);
        System.out.println("----------------------------------");
    }

    void WithdrawMoney(double Amount) {
        if (Amount <= Balance) {
            Balance -= Amount;
            System.out.println();
            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn Amount: " + Amount);
            System.out.println("Updated Balance: " + Balance);
            System.out.println("----------------------------------");
        } else {
            System.out.println();
            System.out.println("Insufficient Balance!");
            System.out.println("Please check your balance and try again.");
            System.out.println("----------------------------------");
        }
    }

    void DisplayBalance() {
        System.out.println();
        System.out.println("Available Balance: " + Balance);
        System.out.println("----------------------------------");
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.print("Enter Your Name: ");
        String Name = sc.nextLine();

        System.out.print("Enter Initial Balance Amount: ");
        double Balance = sc.nextDouble();

        BankAccount B1 = new BankAccount(Name, Balance);

        char ch;

        do {
            System.out.println("\n----------------------------------");
            System.out.println("Hello, " + B1.Name + "! What would you like to do? \n 1. Deposit Money \n 2. Withdraw Money \n 3. Check Balance");
            System.out.print("Enter an Option (1-3): ");

            int Op = sc.nextInt();

            if (Op == 1) {
                System.out.print("\nEnter the Amount to Deposit: ");
                double Deposit = sc.nextDouble();
                B1.DepositMoney(Deposit);
            } 
            else if (Op == 2) {
                System.out.print("\nEnter the Amount to Withdraw: ");
                double Withdraw = sc.nextDouble();
                B1.WithdrawMoney(Withdraw);
            } 
            else if (Op == 3) {
                B1.DisplayBalance();
            } 
            else {
                System.out.println("\nInvalid Option! Please try again.");
                System.out.println("----------------------------------");
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            ch = sc.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        System.out.println("\nThank you for banking with us, " + B1.Name + ".");
        System.out.println("----------------------------------");

        sc.close();
    }
}
