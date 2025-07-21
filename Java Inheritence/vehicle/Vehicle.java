package vehicle;

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Bike extends Vehicle {
    void drive() {
        System.out.println("Riding a bike");
    }
}

class Driver {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.drive();
    }
}
