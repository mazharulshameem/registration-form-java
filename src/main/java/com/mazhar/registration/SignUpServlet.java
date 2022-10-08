package com.mazhar.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user_name = request.getParameter("name");
		String user_mail = request.getParameter("email");
		String user_pwrod = request.getParameter("pass");
		String uphone = request.getParameter("contact");
		RequestDispatcher  dispatcher = null;
		Connection con = null;
		
//		PrintWriter out = response.getWriter();
//		out.print(name);
//		out.print(email);
//		out.print(password);
//		out.print(phone);
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");	
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db? useSSl = false","root","r$4e#3w@" );
		PreparedStatement pst = con.prepareStatement("insert into users (user_name, user_mail, user_pwrod, uphone) values(?,?,?,?)");
	    pst.setString(1, user_name);
	    pst.setString(2, user_mail);
	    pst.setString(3, user_pwrod);
	    pst.setString(4, uphone);
	    int rowCount = pst.executeUpdate();
	    dispatcher = request.getRequestDispatcher("registration.jsp");
	    
	      if(rowCount >0) {
	    	  request.setAttribute("status","success");
	    	  
	        }else {
	        	request.setAttribute("status","failed");
	        }
	      dispatcher.forward(request, response);
	    
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
			con. close();
			}catch(SQLException e){
				e.printStackTrace();
			  
			}
		}
	
	}

}
