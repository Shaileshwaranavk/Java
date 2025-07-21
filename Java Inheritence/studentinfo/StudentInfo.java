package studentinfo;

import java.util.Scanner;

class StudentInfo {
    void displayDetails(String name, int rollNo, int marks) {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
    	String name;
        int rollNo;
        int marks;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
        
        StudentInfo s = new StudentInfo();
        
        s.displayDetails(name, rollNo, marks);
        
        sc.close();
    }
}
