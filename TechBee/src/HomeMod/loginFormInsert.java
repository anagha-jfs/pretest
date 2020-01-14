package HomeMod;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginFormInsert")
public class loginFormInsert extends HttpServlet {
	Connection connection = null;

	@Override
	public void init() throws ServletException {
		try {
			System.out.println("INIT INVOKED");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("Driver loaded successfully!");
			// Get the connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			// System.out.println("Connection Established!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		insertDetails(Username, Password);
	}

	public void insertDetails(String Username, String Password) {
		// Get ojdbc14.jar
		// Load the driver
		try {
			// Create the statement
			Statement statement = connection.createStatement();
			// Execute the query
			String query = "insert into login values( '" + Username + "', '" + Password + "')";
			System.out.println(query);
			int noOfRowsInserted = statement.executeUpdate(query);
			if (noOfRowsInserted == 1) {
				System.out.println("NO OF ROWS INSERTED : " + noOfRowsInserted);
			} else {
				System.out.println("No rows inserted!");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
