package project;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter len,bre of rect ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		if(l>0 && b>0)
		{
		int a = l * b;
		System.out.println("Area : " + a);
		}
		else
			System.out.println("Sorry , not possible this time !");
	}

}
