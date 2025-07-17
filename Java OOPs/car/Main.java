package car;

public class Main {
	
	public static void main(String[] args) {
		car c1 = new car();
		c1.Brand = "Bugatti";
		c1.Year = 2022;
		c1.DisplayInfo();
	}

}

class car{
	String Brand;
	int Year;
	
	void DisplayInfo() {
		System.out.println("Car Brand : "+Brand);
		System.out.println("Movie Rating : "+Year);
	}
}
