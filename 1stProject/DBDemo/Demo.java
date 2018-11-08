package DBDemo;


import java.sql.Connection;
import java.sql.DriverManager;

class Demo {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			System.out.print("Database is connected !");
			conn.close();
		} catch (Exception e) {
			System.out.print("Do not connect to DB - Error:" + e);
		}
	}
}