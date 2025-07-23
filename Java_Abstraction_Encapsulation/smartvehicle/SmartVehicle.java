package smartvehicle;

import java.util.Scanner;

abstract class SmartVehicle {
    protected String modelName;
    protected double batteryCapacity;

    public SmartVehicle(String modelName, double batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;
    }

    public abstract double calculateRange();
}

class ElectricCar extends SmartVehicle {
    public ElectricCar(String modelName, double batteryCapacity) {
        super(modelName, batteryCapacity);
    }

    @Override
    public double calculateRange() {
        return batteryCapacity * 5;
    }
}

class ElectricScooter extends SmartVehicle {
    public ElectricScooter(String modelName, double batteryCapacity) {
        super(modelName, batteryCapacity);
    }

    @Override
    public double calculateRange() {
        return batteryCapacity * 2;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (car/scooter): ");
        String type = sc.nextLine();

        System.out.print("Enter model name: ");
        String model = sc.nextLine();

        System.out.print("Enter battery capacity (kWh): ");
        double capacity = sc.nextDouble();

        SmartVehicle vehicle;
        if (type.equalsIgnoreCase("car")) {
            vehicle = new ElectricCar(model, capacity);
        } else {
            vehicle = new ElectricScooter(model, capacity);
        }

        double range = vehicle.calculateRange();
        System.out.println("Estimated range: " + range + " km");
        
        sc.close();
    }
}
