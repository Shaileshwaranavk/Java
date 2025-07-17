package book;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.Title = "Java Basics";
		b1.Author="James Gosling";
		b1.DisplayDetails();
	}

}

class Book{
	String Title;
	String Author;
	
	void DisplayDetails() {
		System.out.println("Book Name : "+Title);
		System.out.println("Author : "+Author);
	}
}