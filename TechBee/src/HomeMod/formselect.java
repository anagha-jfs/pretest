package HomeMod;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formselect")
public class formselect extends HttpServlet {
	@Override
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	String ValidateCustomerId = request.getParameter("Username");
	 	String ValidatePassword = request.getParameter("Password");
	 	try {
	 		Class.forName("oracle.jdbc.driver.OracleDriver");
	 		//System.out.println("Driver loaded successfully!");
	 		//Get the connection
	 		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
	 		//System.out.println("Connection Established!");
	 		Statement statement = connection.createStatement();
	 		int flag=0;
	 		ResultSet resultSet = statement.executeQuery("select * from LOGIN");
	 		while(resultSet.next()) 
	 		{
				String CustomerId = resultSet.getString("USERNAME");
				String Password = resultSet.getString("PASS_WORD");
				if(ValidateCustomerId.equals(CustomerId))
				{
					if(ValidatePassword.equals(Password))
					{
						flag=1;
						break;
					}
				}
			}
	 		
	 		if(flag==1) {
	 		//	System.out.println("NO OF ROWS INSERTED : " + noOfRowsInserted);
	 		RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.html");
	 			requestDispatcher.forward(request, response);
	 		}
	 		else {
	 			//System.out.println("No rows inserted!");
	 			RequestDispatcher requestDispatcher = request.getRequestDispatcher("error.html");
	 			requestDispatcher.forward(request, response);
	 		}
	 	} catch (ClassNotFoundException | SQLException e) {
	 		//System.out.println(e);
	 		RequestDispatcher requestDispatcher = request.getRequestDispatcher("error.html");
	 		requestDispatcher.forward(request, response);
	 	}	   
}
}
