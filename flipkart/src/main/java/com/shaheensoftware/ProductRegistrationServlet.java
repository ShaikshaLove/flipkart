package com.shaheensoftware;

import java.io.IOException;
import java.io.PrintWriter;

import com.shaheensoftware.model.Product;
import com.shaheensoftware.service.ProductService;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductRegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private ProductService productService;
	
	public void init() {
		productService=new ProductService();
	}
	
	
	// GET /flipkart/product
	@Override
	protected void 	doGet(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			PrintWriter pw = res.getWriter();
			String html="<!DOCTYPE html>\n"
					+ "<html>\n"
					+ "<head>\n"
					+ "<meta charset=\"UTF-8\">\n"
					+ "<title>Insert title here</title>\n"
					+ "</head>\n"
					+ "<body>\n"
					+ "	\n"
					+ "	<form action=\"./product\" method=\"POST\" >\n"
					+ "			Product Name : <input type=\"text\" name=\"productName\"/>\n"
					+ "	        Proce : <input type=\"text\" name=\"productPrice\"/>\n"
					+ "	        <input type=\"submit\"/>\n"
					+ "	</form>\n"
					+ "</body>\n"
					+ "</html>";
			
			pw.append(html);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	// POST /flipkart/product
	@Override
	protected void 	doPost(HttpServletRequest req, HttpServletResponse res) {
		// Reading client request parameters
		String productName = req.getParameter("productName");
		Double productPrice = Double.parseDouble(req.getParameter("productPrice"));
		
		// constructing object
		Product product = new Product(productName, productPrice);
				
		
		System.out.println(product);
		
		// save product Product Service 
		String id = productService.saveProduct(product);
		
		
		// send success response
		
		try {
			PrintWriter pw = res.getWriter();
			pw.append("Successfully saved into database with id "+id);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
