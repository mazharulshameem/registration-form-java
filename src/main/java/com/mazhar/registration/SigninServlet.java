package com.mazhar.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/signin")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String user_mail = request.getParameter("username");
		String user_pwrod = request.getParameter("password");
		RequestDispatcher dispatcher = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db? useSSl = false","root","r$4e#3w@");
			PreparedStatement pst = con.prepareStatement("select * from  users where user_mail =? and user_pwrod =?");
			
			pst.setString(1, user_mail);
			pst.setString(2, user_pwrod);
			HttpSession session = request.getSession();
			
			ResultSet  rs =pst.executeQuery();
			   if(rs.next()) {
		      session.setAttribute("name", rs.getString("user_name"));
		      dispatcher = request.getRequestDispatcher("index.jsp");
		      
			}else {
				request.setAttribute("status","failed");
				dispatcher =request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
