package project;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		System.out.println("sum :" + s);

		int b[] = new int[5];
		System.arraycopy(a, 1, b, 2, 1);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
		
		

	}

}
