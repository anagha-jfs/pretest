package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		// Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully");
			// Get the connection.
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			//System.out.println("conection established");
			// create the statement
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from employees");
			while (resultset.next()) {
				int employeeid = resultset.getInt("employee_id");
				String firstname = resultset.getString("first_name");
				System.out.println(employeeid + "," + firstname);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
