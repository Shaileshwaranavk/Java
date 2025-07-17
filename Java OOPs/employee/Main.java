package employee;


public class Main {
	
	public static void main(String[] args) {
		employee e1 = new employee();
		e1.Name = "Shailesh";
		e1.Salary = 20000.0f;
		e1.DisplayInfo();
	}

}

class employee{
	String Name;
	float Salary;
	
	void DisplayInfo() {
		System.out.println("Employee Name : "+ Name);
		System.out.println("Salary : "+ Salary);
	}
}
