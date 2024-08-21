package com.excptn;

public class Ex2 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int x[]= {3,5,6};
		
		try {try {
			int c=a/b;
			System.out.println(c);
			
			
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}System.out.println(x[4]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
