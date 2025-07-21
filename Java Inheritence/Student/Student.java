package Student;

class Student{
	String name;
	int rollno;
	String address;
	
	Student(String name,int rollno,String address){
		this.name=name;
		this.rollno=rollno;
		this.address=address;
	}
	
		void displaydetails() {
			System.out.println("Student Name:" +name);
			System.out.println("Student RollNO:" +rollno);
			System.out.println("Address:" +address);
			
		}
}

class UnderGratuate extends Student{
			String course;
			
			UnderGratuate(String name,int rollno,String address, String course){
				super(name,rollno,address);
				this.course=course;
	
			}
			void displaydetails() {
				super.displaydetails();
				System.out.println("Course name:"+course);
			}
					
}

class Graduate extends Student{
	String major;
	
	Graduate(String name,int rollno,String address,String major){
		super(name,rollno,address);
		this.major=major;
		
	}
	void displaydetails() {
		super.displaydetails();
		System.out.println("Major:"+major);
	}
}

class Driver{
	public static void main(String[] args) {
		Graduate s1 = new Graduate("vishnu",121,"chennai","cse");
		UnderGratuate s2 = new UnderGratuate("AVK",100,"madurai","ece");
		s1.displaydetails();
		s2.displaydetails();
		
	}
}
