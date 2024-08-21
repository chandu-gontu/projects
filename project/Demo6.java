package project;

public class Demo6 {

	public static void main(String[] args) {
		Demo7 acc = new Demo7();
		acc.acNo = 101;
		acc.name = "Ram";
		acc.balance = 10000.00;
		System.out.println(acc);
		System.out.println(acc.acNo + " " + acc.name + " " + acc.balance);

		Demo7 acc2 = new Demo7();
		System.out.println(acc2);
		System.out.println(acc2.acNo + " " + acc2.name + " " + acc2.balance);

		Demo7 acc3 = new Demo7(103, "RajKr",899);
		System.out.println(acc3);
		System.out.println(acc3.acNo + " " + acc3.name + " " + acc3.balance);

	}

}
