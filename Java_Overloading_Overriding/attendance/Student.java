package attendance;

import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String section;

    Student(String name, int rollNumber, String section) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.section = section;
    }

    void display() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(section);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rollNumber = sc.nextInt();
        sc.nextLine();
        String section = sc.nextLine();

        Student s = new Student(name, rollNumber, section);
        s.display();
    }
}
