package Circle;

public class Circle {
	
	double Radius;
	String Color;
	
	Circle(String Color, double Radius){
		this.Color = Color;
		this.Radius = Radius;
	}
	
	void GetCircumference() {
		double Circumference = 2 * 3.14 * Radius;
		System.out.println("The Circumference of Circle of Color " + Color + " is " + Circumference);
	}

}
class Main{
	public static void main(String[] args) {
		Circle circle = new Circle("Red",2.5);
		circle.GetCircumference();
	}
}
