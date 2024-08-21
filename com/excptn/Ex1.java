package com.excptn;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=0;
		int x[]= {3,5,6};
		
		try {
			System.out.println(x[4]);
			int c=a/b;
			System.out.println(c);
			
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
