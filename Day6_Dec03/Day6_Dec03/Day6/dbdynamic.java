package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbdynamic {
	
	int getcount(String name,int order) throws ClassNotFoundException, Exception{
		
		
		

//		Register db class
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;servername=DELL-PC\\SQLEXPRESS;databaseName=Selenium;IntegratedSecurity=true");
		
		if(conn!=null){
			System.out.println("db connected");
			
		}else{
			System.out.println("db not connected");
		}
		
		Statement stm = conn.createStatement();
		
		ResultSet rs = stm.executeQuery("select count(*) from employee  where Name ='" + name +"' and Id='"+ order + "'");
		
		String count = null;
		while(rs.next()){
			
			count = rs.getString(1);
			
			
		}
		
		
	
//		close connection
		conn.close();
		return Integer.parseInt(count);
		
		
		
		
		
	}
	
	
	

}
