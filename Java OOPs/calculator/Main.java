package calculator;

public class Main {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.num1= 10;
		c1.num2=20;
		c1.add();
		
	}
}

class Calculator{
	int num1;
	int num2;
	void add() {
		System.out.println("Sum = " + (num1+num2));
	}
}
