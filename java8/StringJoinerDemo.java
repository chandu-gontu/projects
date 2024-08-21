package java8;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner x = new StringJoiner(",");
		x.add("Rahul");
		x.add("Rajkr");
		x.add("Sanjay");
		x.add("Heroic");
		System.out.println(x);
		System.out.println(x.length());
		StringJoiner y = new StringJoiner("-");
		y.add("Java");
		y.add("Python");
		System.out.println(x.merge(y));
		
				
		
		
	

	}

}
