package mobilephone;

public class Main {
	
	public static void main(String[] args) {
		MobilePhone c1 = new MobilePhone();
		c1.Brand = "Vivo";
		c1.Price = 20999;
		c1.ShowSpecs();
	}

}

class MobilePhone{
	String Brand;
	int Price;
	
	void ShowSpecs() {
		System.out.println("Mobile Brand : "+Brand);
		System.out.println("Price : "+ Price);
	}
}
