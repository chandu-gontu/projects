package com.interfaces;

public class LoanTest{
	public static void main(String[] args) {
		Loan l;
		HousingLoan h1=new HousingLoan();
		l=h1;
		l.applyLoan("RajKr",200.00);
		l.submitDocs();
		System.out.println(l.getEmi()); 
		Surity s=h1;
		s.submitDocs2();
		VehicleLoan v1 =new VehicleLoan();
		l=v1;
		l.applyLoan("Raj",200.00);
		l.submitDocs();
		System.out.println(l.getEmi()); 
	}
	
	

}
