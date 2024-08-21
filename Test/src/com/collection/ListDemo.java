package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo {

	public static void main(String[] args) {
		Set<Object> l=new HashSet<>();
		l.add(34);
		l.add("Ankan");
		l.add("Majid");
		l.add(3);
		l.add("Chandu");
		l.add("RajKr");
		l.add(4);
		System.out.println(l);
		
		Set<Object> r=new LinkedHashSet<>();
		r.add(34);
		r.add("Ankan");
		r.add("Majid");
		r.add(3);
		r.add("Chandu");
		r.add("RajKr");
		r.add(4);
		System.out.println(r);
		
		try {
			Set<Object> s=new TreeSet<>();
			s.add(34);
			s.add(56);
			s.add(8);
			s.add(3);
			s.add(98);
			s.add(32);
			s.add(4);
			System.out.println(s);
		} catch (java.lang.ClassCastException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Hello I am Here");

	}

}
