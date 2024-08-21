package project;

//acNo,name,balance already in Demo7
public class Demo8 extends Demo7 {

	String proof;
	String bname;

	void show() {
		deposit(3000);
		System.out.println(withdraw(1000));
		System.out.println(getBalance());
		System.out.println(acNo + " " + balance);

	}

	public static void main(String[] args) {
		Demo8 sa = new Demo8();
		sa.show();
		System.out.println(sa.withdraw(2000));
	}

}
