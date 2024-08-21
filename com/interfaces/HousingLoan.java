package com.interfaces;

public class HousingLoan implements Loan,Surity{
	public void applyLoan(String name, double amt) {
		System.out.println("Loan is applied by " + name);
	}

	public void submitDocs() {
		 System.out.println("Documnts were submitted");
		 
	 }

	
	public void submitDocs2(){
		
	}

	@Override
	public int getEmi() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
