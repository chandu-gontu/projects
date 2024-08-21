package com.interfaces;

public class VehicleLoan implements Loan,Surity{
	public void applyLoan(String name, double amt) {
		System.out.println("Vehicle is applied by " + name);
	}
	
	public void submitDocs() {
		 System.out.println("Documnts are submitted");
		 
	 }

	public int getEmi() {
		return 0;
	}
	
	public void submitDocs2() {
		System.out.println("Documnts are submitted");
		
	}
	

}
