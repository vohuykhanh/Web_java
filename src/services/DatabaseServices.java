package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseServices {
	public static Connection getConnection() {
		Connection conn = null;
		String loginUser= "postgres";
		String loginPassword="123";
		String loginUrl="jdbc:postgresql://localhost/one_tech";
		try {
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection(loginUrl,loginUser, loginPassword);
		}
		catch (ClassNotFoundException ex) {
			System.err.println("ClassNotFoundException: "+ ex.getMessage());
		}
		catch (SQLException ex) {
			System.err.println("SQLException: "+ ex.getMessage());
		}
		return conn;
	}
	public static void closeQuietly(Connection conn) {
		try {
			conn.close();
		}
		catch (Exception e) {
	}
}
	public static void rollbackQuietly(Connection conn) {
		try {
			conn.rollback();
		}catch (Exception e) {	
		}
	}
}
