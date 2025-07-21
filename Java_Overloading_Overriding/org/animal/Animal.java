package org.animal;

public class Animal {
	
	void Sound() {
		System.out.println("Animal Makes a Sound.");
	}
	
	void eat(String Food) {
		System.out.println("Animal Eats " + Food);
	}
	
	void eat() {
		System.out.println("Animal Eats");
	}

}

class Dog extends Animal{
	void Sound() {
		System.out.println("Dog Barks.");
	}
	
	void eat(int quantity) {
		System.out.println("Dog Eats " + quantity + " a day.");
	}
	
}

class Driver{
	public static void main(String[] args) {
		Animal a = new Animal();
		a.Sound();
		a.eat();
		a.eat("Meat");
		
		Dog d = new Dog();
		d.Sound();
		d.eat();
		d.eat(51);
		d.eat("Pedigree");
	}
}
