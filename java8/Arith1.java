package java8;

interface Ari{
	int op(int a,int b);
}

public class Arith1 {

	public static void main(String[] args) {
		
		Ari arith=(a,b)->a*a+b*b;
		System.out.println(arith.op(3, 4));
		Ari x=(a,b)->a*a*a-b*b*b+10;
		System.out.println(x.op(4,3));
	}

}
