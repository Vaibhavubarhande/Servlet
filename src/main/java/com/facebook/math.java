package com.facebook;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/math")
public class math extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int a = 10;
		int b = 50;

		String data = "Result is: " + (a + b);

		System.out.println(data);
		request.setAttribute("data", data);

		request.getRequestDispatcher("display.jsp").forward(request, response);
	}
}
