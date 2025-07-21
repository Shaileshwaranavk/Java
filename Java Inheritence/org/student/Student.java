package org.student;

class Student {
    String name;
    int rollNo;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        if (marks > 40) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Shailesh";
        s.rollNo = 100;
        s.marks = 75;
        s.display();
    }
}
