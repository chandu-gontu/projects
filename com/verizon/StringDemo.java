package com.verizon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
//		String x="Chandu";
//		String y=new String("Raj Kr");
//		
//		System.out.println(x.length());
//		System.out.println(x.concat("hello"));
//		System.out.println(x==y);
//		System.out.print("enter your cmnts :");
//		Scanner sc=new Scanner(System.in);
//		String cmnts=sc.nextLine();
//		System.out.println(cmnts);
//		
//		StringBuffer sb=new StringBuffer("javatechnology78456e");
//		System.out.println(sb.capacity());
		
		String x="hyd,kol,mum,del";
		StringTokenizer st = new StringTokenizer(x,"o");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		
		
		
	}

}
