package com.shaheensoftware;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomePage extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,  HttpServletResponse res) throws IOException {
	 PrintWriter pw = res.getWriter();
	 
	 	String welcomeContent="<html>\n"
	 			+ "<head>\n"
	 			+ "<meta charset=\"UTF-8\">\n"
	 			+ "<title>Shaheen Software</title>\n"
	 			+ "</head>\n"
	 			+ "<body>\n"
	 			+ "	<h1>Welcome to Shaheen Software</h1>\n"
	 			+ "	<br>\n"
	 			+ "	<a href=\"./product\">Register Product</a>\n"
	 			+ "	\n"
	 			+ "\n"
	 			+ "</body>\n"
	 			+ "</html>";
	 
	  pw.append(welcomeContent);
	}
	

}
