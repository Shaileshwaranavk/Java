package Employee;

import java.util.*;

public class Employee {

    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void calculateBonus() {
        double bonus;
        if (salary > 50000) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.05;
        }

        System.out.println("\n-----------------------------");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Calculated Bonus: " + bonus);
        System.out.println("-----------------------------");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(empId, name, salary);
            emp.calculateBonus();

            System.out.print("\nDo you want to add another employee? (Y/N): ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }
}
