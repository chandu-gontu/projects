package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 7, 3, 7, 89, 57, 13, 9, 24, 13, 23);
//		list.stream().sorted().filter(x->x<=5).limit(8).forEach(x->System.out.println(x+ " "));
//		System.out.println();
//		
//		Optional<Integer> max=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
//		if(max.isPresent())
//			System.out.println("Max :"+max.get());
//		
//		String s="Hello";
//		Optional<String> s1=Optional.ofNullable(s);
//		if(s1.isPresent())
//			System.out.println(s1.get());
//		else
//			System.out.println("Empty . .");

//		List<Integer> list2=Arrays.asList(5,4,6,7,1,2,9,8,3);
//		list2.stream().sorted(Collections.reverseOrder()).filter(x->x<=5).map(x->x*x*x).forEach(System.out::println);
		
		List<Integer> y=list.stream().collect(Collectors.toList());
		y.forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
	
		
		
		
	}

}
