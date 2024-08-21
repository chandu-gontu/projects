package com.excptn;

public class Ex4 {

	public static void main(String[] args) throws DepostException{
		int x=999;
		if(x<1000)
			throw new DepostException("min amt is 1000/-");
		else
				System.out.println("Thanku");

	}

}
