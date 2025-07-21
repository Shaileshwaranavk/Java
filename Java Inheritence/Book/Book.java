package Book;

public class Book {
	String title;
	String author;
	int price;
	
	Book(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
			
	}
	void diplaydetails() {
     	System.out.println("Title of Book :"+title);
		System.out.println("Author of Book :"+author);
		System.out.println("Price of BOok :"+price);
	}
}
	class EBook extends Book{
		int filesize;
		EBook(String title,String author,int price, int filesize){
			super(title,author,price);
			this.filesize=filesize;
			
		}
		void displaydetails() {
			super.diplaydetails();
			System.out.println("File size of Book :"+filesize);
		}
	}

	class drive{
		public static void main(String[] args) {
			EBook b1 = new EBook ("Comic","AVK",1200,120);
			b1.displaydetails();
			
		}
	}
	


