package com.abstraction;

public class LoanTest extends HousingLoan{
	public static void main(String[] args) {
		Loan l =new HousingLoan();
		l.applyLoan("RajKr",200.00);
		l.submitDocs();
		System.out.println(l.getEmi()); 
		
		
	    Loan s =new VehicleLoan();
		s.applyLoan("Raj",200.00);
		s.submitDocs();
		System.out.println(s.getEmi()); 
	}
	
	

}
