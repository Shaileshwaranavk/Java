package movie;

public class Main {
	
	public static void main(String[] args) {
		Movie M1 = new Movie();
		M1.Title = "The Karate Kid";
		M1.Rating = 4.55;
		M1.ShowDetails();
	}

}

class Movie{
	String Title;
	Double Rating;
	
	void ShowDetails() {
		System.out.println("Movie Name : "+Title);
		System.out.println("Movie Rating : "+Rating);
	}
}
