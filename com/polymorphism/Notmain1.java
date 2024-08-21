package com.polymorphism;

public class Notmain1 extends Notmain{
	void sq(int x) {
		System.out.println("cube is "+(x*x*x));
	}

	public static void main(String[] args) {
		Main d=new Main();
		d.sq(4);
		

	}

}
