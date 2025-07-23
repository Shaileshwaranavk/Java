package healthprofile;

import java.util.*;

public class HealthProfile {
	private double height, weight;
	
	HealthProfile(double height, double weight){
		this.height = height;
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		if(height > 0.0) {
			this.height = height;
		}
		else {
			System.out.println("Enter the Correct Height Value in Metres.");
		}
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if(weight > 0.0) {
			this.weight = weight;
		}
		else {
			System.out.println("Enter the Correct Weight Value in Kg.");
		}
	}
	
	public double BMICalculator() {
		
		return weight/(height*height);
	}
}

class Driver{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Height (in Metre) : ");
		double height = sc.nextDouble();
		System.out.print("Enter the Weight (in Kg) : ");
		double weight = sc.nextDouble();
		
		HealthProfile user = new HealthProfile(height, weight);
		
		user.setHeight(height);
		user.setWeight(weight);
		
		System.out.println("Height of the User : " + user.getHeight() + " metres.");
		System.out.println("Weight of the User : " + user.getWeight() + " Kilograms.");
		
		System.out.println("BMI of the User is : " + user.BMICalculator());
	}
}
