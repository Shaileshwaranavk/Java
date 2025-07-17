package pen;

public class Main {
	
	public static void main(String[] args) {
		pen p1 = new pen();
		p1.Brand = "Parker";
		p1.Color = "Blue";
		p1.Write();
	}

}

class pen{
	String Brand;
	String Color;
	
	void Write() {
		System.out.println("Writing with "+ Color + " pen of brand " + Brand + ".");
	}
}
