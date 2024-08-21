package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","chandu");
		Statement st=con.createStatement();
//		PreparedStatement pst=con.prepareStatement("insert into plan values(?,?)");
//		System.out.println("enter 3 plan records ,id ,name  ");
//		Scanner sc =new Scanner(System.in);
//		for(int i=1;i<=3;i++) {
//			pst.setInt(1, sc.nextInt());
//			pst.setString(2, sc.next());
//			pst.execute();
//		}
//		ResultSet rs=st.executeQuery("Select * from plan");
//		ResultSetMetaData rsmd=rs.getMetaData();
//		System.out.println(rsmd.getColumnCount());
//		for(int i=1;i<=rsmd.getColumnCount();i++)
//			System.out.println(rsmd.getColumnName(i)+" ");
//		System.out.println();
//		System.out.println("===============");
//		while(rs.next()) {
//			System.out.println(rs.getString(1)+" "+rs.getString(2));
//		}
		
//		PreparedStatement pst=con.prepareStatement("update plan set name=? where pid=?");
//		System.out.println("enter id for which you want to update");
//		Scanner sc=new Scanner(System.in);
//		int id=sc.nextInt();
//		String newName=sc.next();
//		pst.setString(1, newName);
//		pst.setInt(2, id);
//		pst.execute();
//		System.out.println("after update");
//		ResultSet rs=st.executeQuery("Select * from plan");
//		ResultSetMetaData rsmd=rs.getMetaData();
//	
//		for(int i=1;i<=rsmd.getColumnCount();i++)
//			System.out.print(rsmd.getColumnName(i)+" ");
//		System.out.println();
//	
//		System.out.println("===============");
//		while(rs.next()) {
//			System.out.println(rs.getString(1)+" "+rs.getString(2));

		
	
		
		
		PreparedStatement pst1=con.prepareStatement("delete from plan where pid=?");
		System.out.println("enter id to delete :");
		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
		pst1.setInt(1, x);
		pst1.execute();
		System.out.println("after dlt");
		ResultSet rs1=st.executeQuery("Select * from plan");
		ResultSetMetaData rsmd1=rs1.getMetaData();

		for(int i=1;i<=rsmd1.getColumnCount();i++)
			System.out.println(rsmd1.getColumnName(i)+" ");
	
	
		System.out.println("===============");
		while(rs1.next()) {
			System.out.println(rs1.getString(1)+" "+rs1.getString(2));
		
		}
	}

}
