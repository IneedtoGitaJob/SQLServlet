import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*  Andreas hinsch:   
Course: CNT 4714 – Spring 2022 – Project Four 
Assignment title:  A Three-Tier Distributed Web-Based Application 
Date:  April 24, 2022 
*/ 
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1l;
	
	@Override
   protected void doPost(HttpServletRequest req,  HttpServletResponse resp) throws ServletException, IOException{
	   
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("root") && password.equals("cgs2545")) 
		{
			resp.sendRedirect("root-Home.jsp");
		}
		else 
		{
			if(username.equals("client") && password.equals("client")) 
			{
				resp.sendRedirect("client-Home.jsp");
			}
			 	else 
			 	{
				resp.sendRedirect("index.jsp"); 
			 	}
		}
		
   }
	
	
	@Override
	   protected void doGet(HttpServletRequest req,  HttpServletResponse resp) throws ServletException, IOException
	{

	   }
	
}