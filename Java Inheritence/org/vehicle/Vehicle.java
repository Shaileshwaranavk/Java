package org.vehicle;

public class Vehicle {
	String fuel;
	String type;
	
	Vehicle(String type, String fuel){
		this.fuel = fuel;
		this.type = type;
	}
	
	void VehicleType() {
		System.out.println("Type of Vehicle : " + type);
	}
	void fuelType() {
		System.out.println("Fuel for Vehicle : " + fuel);
	}
}

class Car extends Vehicle{
	String Model, Brand;
	
	Car(String type, String fuel, String Model, String Brand){
		super(type, fuel);
		this.Model = Model;
		this.Brand = Brand;
	}
	
	void carModel() {
		System.out.println("Model : " + Model);
	}
	
	void carBrand() {
		System.out.println("Brand : " + Brand);
	}
}

class ElectricCar extends Car{
	double Capacity;
	
	ElectricCar(String type, String fuel, String Model, String Brand, double Capacity){
		super(type, fuel, Model, Brand);
		this.Capacity = Capacity;
	}
	
	void batteryCapacity() {
		System.out.println("Battery Capacity : " + Capacity);
	}
}

class Driver{
	public static void main(String[] args) {
		ElectricCar ev = new ElectricCar("4 Wheeler", "Electricity", "Tata EV", "Tata", 500.00);
		ev.VehicleType();
		ev.fuelType();
		ev.carModel();
		ev.carBrand();
		ev.batteryCapacity();
	}
}