import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletRoot")
public class ServletRoot extends HttpServlet {
	
	private static final long serialVersionUID = 1l;
	
	
	
	
	/*  Andreas hinsch:   
	Course: CNT 4714 – Spring 2022 – Project Four 
	Assignment title:  A Three-Tier Distributed Web-Based Application 
	Date:  April 24, 2022 
	*/ 
	@Override
   protected void doPost(HttpServletRequest req,  HttpServletResponse resp) throws ServletException, IOException{

		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "cgs2545");
			Statement statement = connection.createStatement();
			statement.executeUpdate("use project4;");
			
			if(req.getParameter("instructions").contains("select")) {
				
			ResultSet myResult = statement.executeQuery(req.getParameter("instructions"));
			ResultSetMetaData meta = myResult.getMetaData();
			
			int cols = meta.getColumnCount();
			
			
			//Create Table
			PrintWriter write = resp.getWriter(); 
			
			
			
            write.println("<table border=1 width=50% height=50%><tr>");
            
            for(int x = 0; x < cols; x++) 
            {	
            	write.println("<th>"+meta.getColumnName(x + 1) +"</th>"); 
            }
            
            write.println("</tr>");
            
            while (myResult.next()) 
            {  
            	write.println("<tr>");
                for(int x = 0; x < cols; x++) 
                {	
                	write.println("<td>"+myResult.getObject(x + 1) +"</td>"); 
                }
                write.println("</tr>");
                  
            }  
            write.println("</table>");  

			}
			else {
				int rows = statement.executeUpdate(req.getParameter("instructions"));
				PrintWriter write = resp.getWriter();
				write.println("<p>Successful update "+rows+" affected</p>");  
				
			}
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
   }
	
	
	@Override
	   protected void doGet(HttpServletRequest req,  HttpServletResponse resp) throws ServletException, IOException{

	   }
	
}