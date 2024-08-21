package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableStmnts {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","chandu");
		CallableStatement cst=con.prepareCall("{ CALL product(?,?,?)");
		System.out.println("Enter a number :");
		System.out.println("Enter another number :");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int b=sc1.nextInt();
		cst.setInt(1, a);
		cst.setInt(2, b);
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		System.out.println("Result from db is :"+cst.getInt(3));
		
	}
	

}
