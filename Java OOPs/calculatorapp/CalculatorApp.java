package calculatorapp;

import java.util.Scanner;

class CalculatorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.print("Enter the First Number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the Second Number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter the Operation (+, -, *, /): ");
            char Operation = sc.next().charAt(0);

            if (Operation == '+') {
                System.out.println("Sum = " + (num1 + num2));
            } else if (Operation == '-') {
                System.out.println("Difference = " + (num1 - num2));
            } else if (Operation == '*') {
                System.out.println("Product = " + (num1 * num2));
            } else if (Operation == '/') {
                if (num2 != 0) {
                    System.out.println("Quotient = " + (num1 / num2));
                } else {
                    System.out.println("The Divisor can't be Zero");
                }
            } else {
                System.out.println("Invalid Operation");
            }

            System.out.print("Do You Want To Continue (Y/N): ");
            ch = sc.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');
        
        sc.close();

    }
}
