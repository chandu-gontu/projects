package java8;

@FunctionalInterface
interface Arith<y>{
	y x(y a,y b);
}
public class FnDemo1 {
	public static void main(String[] args) {
		
		Arith<Integer> x1=(a,b)->a+b;
		System.out.println(x1.x(5,6));
		Arith<Double> x2=(a,b)->a-b;
		System.out.println(x2.x(5.0,6.0));
		
		

	}

}
