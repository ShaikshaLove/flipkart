package com.shaheensoftware.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.UUID;

import com.shaheensoftware.model.Product;

public class ProductDao {
	
	

 public String save(Product product) {
		//loading driver class
	try {
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres","postgres","shaheen");
		PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?)");
		String id=UUID.randomUUID().toString();
		pstmt.setString(1,id );
		pstmt.setString(2,product.getProductName());
		pstmt.setDouble(3,product.getProductPrice());
		pstmt.executeUpdate();
		return id;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	return null;
	 
	}
	

}
