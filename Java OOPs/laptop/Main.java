package laptop;

public class Main {
	
	public static void main(String[] args) {
		laptop l1 = new laptop();
		l1.Brand = "Dell";
		l1.RAM = "12 GB";
		l1.ShowConfigurations();
	}

}

class laptop{
	String Brand;
	String RAM;
	
	void ShowConfigurations() {
		System.out.println("Laptop Brand : "+Brand);
		System.out.println("Laptop RAM : "+RAM);
	}
}
