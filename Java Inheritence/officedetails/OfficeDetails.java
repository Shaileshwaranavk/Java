package officedetails;

public class OfficeDetails {
	String Company_Name;
	
	OfficeDetails(String Name){
		this.Company_Name = Name;
	}
	
	void CompanyName() {
		System.out.println("Company Name : " + Company_Name);
	}
}

class Employee extends OfficeDetails{
	String Name;
	int Id;
	
	Employee(String Name, String Ename, int id){
		super(Name);
		this.Name = Ename;
		Id = id;
	}
	
	void EmployeeName() {
		System.out.println("Employee Name : " + Name);
	}
	
	void EmployeeId() {
		System.out.println("Employee Id : " + Id);
	}
}

class Driver{
	public static void main(String[] args) {
		Employee e1 = new Employee("TCS", "Shailesh", 156);
		e1.CompanyName();
		e1.EmployeeName();
		e1.EmployeeId();
	}
}