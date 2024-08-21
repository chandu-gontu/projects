package com.polymorphism;

public class Mload {
	void area(int x) {
		System.out.println("area of square :"+(x*x));
	}
	// Compile time polymorphism . .
	void area(int l,int b) {
		System.out.println("area of ractangle :"+(l*b));
	}
	void area(double y) {
		System.out.println("area of square :"+(3.14*y*y));
	}
	public static void main(String[] args) {
		Mload m=new Mload();
		m.area(4);
		m.area(4,8);
		m.area(4.00);
		
	}

}
