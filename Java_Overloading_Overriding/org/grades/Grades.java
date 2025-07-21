package org.grades;

public class Grades {
	String Name;
	int Roll_Number;
	
	Grades(String Name, int Roll_Number){
		this.Name = Name;
		this.Roll_Number = Roll_Number;
	}
	
	void calculateGrade(int totalMarks) {
		if(totalMarks<=100) {
			if(totalMarks >= 90) {
				System.out.println("A+");
			}
			else if(totalMarks >= 80) {
				System.out.println("A");
			}
			else if(totalMarks >= 70) {
				System.out.println("B+");
			}
			else if(totalMarks >= 60) {
				System.out.println("B");
			}
			else {
				System.out.println("C");
			}
		}
	}
	
	void calculateGrade(int Mark1, int Mark2, int Mark3) {
		double average = (Mark1+Mark2+Mark3)/3;
		System.out.println("Average Marks of Given Three Subjects is : " + average);
	}
	
	void calculateGrade(double gpa) {
		if(gpa<=10.0) {
			if(gpa>=9.0) {
				System.out.println("A+");
			}
			else if(gpa>=8.0) {
				System.out.println("A");
			}
			else if(gpa>=7.0) {
				System.out.println("B+");
			}
			else if(gpa>=6.0) {
				System.out.println("B");
			}
			else {
				System.out.println("C");
			}
		}
	}
}


class Driver{
	public static void main(String[] args) {
		Grades g1 = new Grades("Shailesh", 100);
		g1.calculateGrade(90);
		g1.calculateGrade(78, 85, 90);
		g1.calculateGrade(8.74);
	}
}