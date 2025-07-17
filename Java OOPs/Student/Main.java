package Student;

public class Main {
	
	public static void main(String[] args) {
		student c1 = new student();
		c1.Name = "Shailesh";
		c1.Roll_Number = 221475;
		c1.PrintDetails();
	}

}

class student{
	String Name;
	int Roll_Number;
	
	void PrintDetails() {
		System.out.println("Student Name : "+ Name);
		System.out.println("Roll Number : "+ Roll_Number);
	}
}
