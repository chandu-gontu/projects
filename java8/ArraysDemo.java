package java8;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
//		int a[] = { 4, 5, 7, 6, 9, 1, 8, 2, 3 };
//
//		for (int x : a)
//			System.out.println(x + " ");
//
//		Arrays.sort(a);
//
//		for (int x : a)
//			System.out.println(x + " ");
		
//		int b[]=new int[5];
//		System.out.println();
		
		List<Integer> list=Arrays.asList(5,6,4,7,3,8,9,2,1);
		System.out.println("==== wth Lambda ===");
		list.forEach(x->System.out.println(x));
		
		System.out.println("=== wthout Lambda ===");
		list.forEach(System.out::println);
		
		
		
		

	}

}
