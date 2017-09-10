package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		Register db class
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;servername=DELL-PC\\SQLEXPRESS;databaseName=Selenium;IntegratedSecurity=true");
		
		if(conn!=null){
			System.out.println("db connected");
			
		}else{
			System.out.println("db not connected");
		}
		
		Statement stm = conn.createStatement();
		
		ResultSet rs = stm.executeQuery("select * from employee ");
		
		
		while(rs.next()){
			
			System.out.println(rs.getString(1));
			
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("Place"));
			System.out.println(rs.getString(1) + "--" +rs.getString("Name") + "--" + rs.getString("Place"));
	
			System.out.println("-------------------");
		}
		
		
		
//		close connection
		conn.close();
		
		
		
	}

}
