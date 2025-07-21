package org.bank;

public class Bank {
	String BankName;
	
	public Bank(String Name) {
		this.BankName = Name;
	}
	
	public void CreateAccount(String Name) {
		System.out.println("Creating Account for : " + BankName);
	}
	
	public void CreateAccount(String Name, String Type) {
		System.out.println("Creating Account for " + Name + " of " + Type + "Type.");
	}
	
	public void showInterest() {
		System.out.println("Savings Account Interest Rate is 4%");
	}

}

class SavingsAccount extends Bank{
	public SavingsAccount(String Name) {
		super(Name);
	}
	
	public void showInterest() {
		System.out.println("Savings Account Interest Rate is 6%");
	}
}

class CurrentAccount extends Bank{
	public CurrentAccount(String Name) {
		super(Name);
	}
	
	public void showInterest() {
		System.out.println("Savings Account Interest Rate is 3%");
	}
}

class Driver{
	public static void main(String[] args) {
		Bank b = new Bank("XYZ Bank");
		b.CreateAccount("Shailesh");
		b.CreateAccount("Shaileshwaran", "SavingsAccount");
		b.showInterest();
		
		SavingsAccount sa = new SavingsAccount("XYZ Bank");
		sa.showInterest();
		
		CurrentAccount ca = new CurrentAccount("XYZ Bank");
		ca.showInterest();
	}
}