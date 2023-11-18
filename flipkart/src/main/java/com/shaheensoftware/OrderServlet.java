package com.shaheensoftware;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class OrderServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	
	// GET /flipkart/order
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		  PrintWriter pw=res.getWriter();
		pw.append("Welcome to your order");
	}

}
