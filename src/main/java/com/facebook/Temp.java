package com.facebook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/msg")
public class Temp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tempname = "Hello Vaibhav";
		System.out.println(tempname);
		request.setAttribute("data", tempname); 

		request.getRequestDispatcher("display.jsp").forward(request, response);
	}

}
