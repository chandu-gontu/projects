package project;

public class Demo7 {
	int acNo;
	String name;
	double balance;

	// default constructor
	Demo7() {
		acNo = 999;
		name = "Error";
		balance = 1000.00;
	}

	public Demo7(int acNo, double balance) {
		super();
		this.acNo = acNo;
		this.balance = balance;
	}

	// parameterised constructor
	Demo7(int acNo, String name, double balance) {
		this.acNo = acNo;
		this.name = name;
		this.balance = balance;
	}

	void deposit(int amt) {
		balance += amt;
	}

	double withdraw(int amt) {
		balance -= amt;
		return balance;
	}

	double getBalance() {
		return balance;

	}

}
