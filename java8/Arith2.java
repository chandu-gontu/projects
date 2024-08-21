package java8;

interface Ar<x>{
	x op(x a,x b);
}

public class Arith2 {

	public static void main(String[] args) {
		
		Ar<Integer> abc=(a,b)->a*a+b;
		System.out.println(abc.op(5,6));
		
		Ar<Double> xyz=(a,b)->a*a+b;
		System.out.println(xyz.op(5.0,6.0));
		
	}

}
