package org.employee;

class Employee {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, String department, int teamSize) {
        super(name, id, department);
        this.teamSize = teamSize;
    }

    void display() {
        super.display();
        System.out.println("Team Size: " + teamSize);
    }
}

class Driver {
    public static void main(String[] args) {
    	Manager m = new Manager("Shailesh", 1012, "Developer", 8);
        m.display();
    }
}
