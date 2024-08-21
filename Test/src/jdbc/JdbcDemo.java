package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","chandu");
		System.out.println("connection successful");
		Statement st=con.createStatement();
		st.execute("create table plan(pid number primary key,name varchar(20))");
		System.out.println("Table Created");
		
	
		
	}

}
