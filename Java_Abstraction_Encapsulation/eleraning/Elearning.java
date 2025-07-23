package eleraning;

import java.util.Scanner;

interface Evaluate {
    void calculategrade();
}

public class Elearning implements Evaluate {
    private String Name;
    private int Roll_Number;
    private double Mark1, Mark2, Mark3;

    Elearning(String Name, int Roll_Number, double Mark1, double Mark2, double Mark3) {
        this.Name = Name;
        this.Roll_Number = Roll_Number;
        this.Mark1 = Mark1;
        this.Mark2 = Mark2;
        this.Mark3 = Mark3;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setRollNumber(int Roll_Number) {
        this.Roll_Number = Roll_Number;
    }

    public int getRollNumber() {
        return Roll_Number;
    }

    public void setMark1(double Mark1) {
        this.Mark1 = Mark1;
    }

    public double getMark1() {
        return Mark1;
    }

    public void setMark2(double Mark2) {
        this.Mark2 = Mark2;
    }

    public double getMark2() {
        return Mark2;
    }

    public void setMark3(double Mark3) {
        this.Mark3 = Mark3;
    }

    public double getMark3() {
        return Mark3;
    }

    public void calculategrade() {
        double average = (Mark1 + Mark2 + Mark3) / 3.0;
        if (average <= 100) {
            if (average >= 90) {
                System.out.println("A+");
            } else if (average >= 80) {
                System.out.println("A");
            } else if (average >= 70) {
                System.out.println("B+");
            } else if (average >= 60) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } else {
            System.out.println("Invalid Marks");
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Mark 1: ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter Mark 2: ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter Mark 3: ");
        double mark3 = sc.nextDouble();

        Elearning el = new Elearning(name, rollNumber, mark1, mark2, mark3);

        System.out.print("The Overall Grade of " + el.getName() + " of Roll Number " + el.getRollNumber() + " is ");
        el.calculategrade();

        sc.close();
    }
}
