package com.facebook;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class userdetails extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		String val = request.getParameter("q");
		String userName = null;
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	String url = "jdbc:mysql://localhost:3306/day1"; 
    	String username = "root";
    	String password = "root";
    	
    	Connection connection = DriverManager.getConnection(url, username, password);
    	Statement stmt = connection.createStatement();
    	ResultSet rs = stmt.executeQuery("SELECT * FROM school WHERE roll_no = "+val);
    	
    	while(rs.next()) {
    	userName = 	rs.getString("name");
    	}
    
    	connection.close();
    	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("data", userName);
		request.getRequestDispatcher("Detail.jsp").forward(request, response);
	}
}
