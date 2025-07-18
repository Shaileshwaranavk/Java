package Camera;

public class Camera {
	String Model;
	double Resolution;
	int Price;
	
	Camera(String Model, double Resolution,	int Price){
		this.Model = Model;
		this.Resolution=Resolution;
		this.Price=Price;
	}
	
	void DiscountedPrice(double Percent) {
		double DiscountPrice = Price-(Price*(Percent/100));
		System.out.println("Camera Model : " + Model);
		System.out.println("Resolution : " + Resolution);
		System.out.println("Original Price : " + Price);
		System.out.println("Discounted Price : " + DiscountPrice);
	}

}

class Main{
	public static void main(String[] args) {
		Camera camera = new Camera("Nikon", 5.0, 20000);
		camera.DiscountedPrice(20);
	}
}
