package ProductGSTCalculator;

import java.util.*;

public class ProductGSTCalculator {

    String ProductName;
    double Price;
    String Category;

    ProductGSTCalculator(String ProductName, double Price, String Category) {
        this.ProductName = ProductName;
        this.Price = Price;
        this.Category = Category;
    }

    void CalculateGST() {
        double TotalPrice = 0.0;

        if (Category.equalsIgnoreCase("Electronics")) {
            TotalPrice = Price + (Price * (18.0 / 100));
        } else if (Category.equalsIgnoreCase("Groceries")) {
            TotalPrice = Price + (Price * (5.0 / 100));
        } else if (Category.equalsIgnoreCase("Clothes")) {
            TotalPrice = Price + (Price * (12.0 / 100));
        }

        System.out.println("\n-------------------------------");
        System.out.println("Product : " + ProductName);
        System.out.println("Category : " + Category);
        System.out.println("Original Price : " + Price);
        System.out.println("Price with GST : " + TotalPrice);
        System.out.println("-------------------------------\n");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("\nEnter the Product Name : ");
            String Name = sc.nextLine();

            String Category = "";
            boolean validCategory = false;

            while (!validCategory) {
                System.out.print("Enter the Category (Electronics/Groceries/Clothes) : ");
                Category = sc.nextLine();
                if (Category.equalsIgnoreCase("Electronics") ||
                    Category.equalsIgnoreCase("Groceries") ||
                    Category.equalsIgnoreCase("Clothes")) {
                    validCategory = true;
                } else {
                    System.out.println("Invalid Category! Please enter a valid category.\n");
                }
            }

            System.out.print("Enter the Price : ");
            double Price = sc.nextDouble();
            sc.nextLine();

            ProductGSTCalculator product = new ProductGSTCalculator(Name, Price, Category);
            product.CalculateGST();

            System.out.print("Do you want to add another product? (Y/N): ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }
}
