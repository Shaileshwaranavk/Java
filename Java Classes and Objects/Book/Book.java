package Book;

import java.util.*;

public class Book {

    String title;
    String category;
    double price;

    Book(String title, String category, double price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    void applyDiscount() {
        double discount = 0.0;

        if (category.equalsIgnoreCase("Fiction")) {
            discount = price * 0.10;
        } else if (category.equalsIgnoreCase("Education")) {
            discount = price * 0.20;
        }

        double finalPrice = price - discount;

        System.out.println("\n-----------------------------");
        System.out.println("Book Title: " + title);
        System.out.println("Book Category: " + category);
        System.out.println("Original Price: " + price);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Price After Discount: " + finalPrice);
        System.out.println("-----------------------------\n");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Book Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Book Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            Book book = new Book(title, category, price);
            book.applyDiscount();

            System.out.print("Do you want to add another book? (Y/N): ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }
}
