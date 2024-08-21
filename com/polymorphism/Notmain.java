package com.polymorphism;

public class Notmain extends Main{
	
	void sq(int x) {
		System.out.println("perimeter is "+(4*x));
	}
	
	public static void main(String[] args) {
		
		Main n = new Main();
		n.sq(4);
	}

}
