package Shape;

import java.util.*;

public class Shape {
	double Length;
	double Breadth;
	
	Shape(double Length, double Breadth){
		this.Length = Length;
		this.Breadth = Breadth;
	}
	
	void DisplayShape(){
		if(Length == Breadth) {
			System.out.println("The Shape is a Square!!");
		}
		else {
			System.out.println("The Shape is a Rectangle!!");
		}
	}

}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Length : ");
		double Length = sc.nextDouble();
		
		System.out.print("Enter the Breadth : ");
		double Breadth = sc.nextDouble();
		
		Shape shape = new Shape(Length, Breadth);
		shape.DisplayShape();
		
		sc.close();
	}
}
