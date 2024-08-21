package com.abstraction;

public class VehicleLoan extends Loan{
	void applyLoan(String name, double amt) {
		System.out.println("Vehicle is applied by " + name);
	}
	
	void submitDocs() {
		 System.out.println("Documnts are submitted");
		 
	 }
	
	
	int getEmi() {
		return 0;
	}

}
