package bankaccount;

public class Main {
	
	public static void main(String[] args) {
		bank b1 = new bank();
		b1.Acc_Holder = "Shailesh";
		b1.Balance = 221475f;
		b1.CheckBalance();
	}

}

class bank{
	String Acc_Holder;
	float Balance;
	
	void CheckBalance() {
		System.out.println("Account Holder Name : "+ Acc_Holder);
		System.out.println("Balance : "+ Balance);
	}
}
