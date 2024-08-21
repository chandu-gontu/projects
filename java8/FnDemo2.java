package java8;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FnDemo2 {

	public static void main(String[] args) {
//		Consumer<Integer> x=(a)-> System.out.println("Square is "+(a*a));
//		x.accept(3);
//		
//		Consumer<Double> y=(a)-> System.out.println("10% discount is "+(a*0.10));
//		y.accept(5000.00);
		
//		try {
//			Supplier<Integer> x=()->new Random().nextInt(10, 10);
//			System.out.println(x.get());
//		} catch (java.lang.IllegalArgumentException e) {
//			
//			e.printStackTrace();
//		}
//		
		
		Function<Integer,String> f1=(s)->s.toString();
		System.out.println(f1.apply(69));
		
		
		
		
	}

}
