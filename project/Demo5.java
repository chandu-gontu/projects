package project;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" choose oprtn , 2 inputs , +,-,*,/");
		Scanner sc=new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		switch(ch)
		{ case '+' : {System.out.println("sum="+(a+b));
		break;
		}
		
		 case '-' : {System.out.println("diff="+(a-b));
			break;
			}
		 case '*' : {System.out.println("mul="+(a*b));
			break;
			}
		 case '/' : {System.out.println("div="+(a/b));
			break;
			}
		 default :
			 System.out.println("wrong operator");
						
		
		}

	}

}
