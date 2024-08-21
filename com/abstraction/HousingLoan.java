package com.abstraction;

public class HousingLoan extends Loan {
	void applyLoan(String name, double amt) {
		System.out.println("Loan is applied by " + name);
	}

	void submitDocs() {
		 System.out.println("Documnts were submitted");
		 
	 }

	int getEmi() {
		return 5555;
	}
	

}
