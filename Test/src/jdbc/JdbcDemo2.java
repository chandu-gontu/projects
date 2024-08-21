package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","chandu");
		System.out.println("connection successful");
		Statement st=con.createStatement();
//		st.execute("insert into plan values(101,'Chandu')");
//		st.execute("insert into plan values(102,'RajKr')");
//		st.execute("insert into plan values(103,'Sanjay')");
		
		ResultSet rs=st.executeQuery("select * from plan");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
		
	
		
	}

}
