package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class customerDButil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static boolean validate(String username, String password) {
		
		try {
			Connection con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public static Customer getCustomerByPsw(String password) {

		return getCustomer(password).get(0);
	}
	
	public static List<Customer> getCustomer(String password) {
		
		ArrayList<Customer> customer = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from rokittaxi.customer where password='"+password+"' ";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String address = rs.getString(4);
				String phone = rs.getString(5);
				String username = rs.getString(6);
				String psw = rs.getString(7);
				
				Customer cus = new Customer(id,name,email,address,phone,username,psw);
				customer.add(cus);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return customer;	
	}
	
	
/*	
	
	public static List<Customer> viewCustomer() {
			
			ArrayList<Customer> customer = new ArrayList<>();
			
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from customer ";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String address = rs.getString(4);
					String phone = rs.getString(5);
					String username = rs.getString(6);
					String password = rs.getString(7);
					
					Customer cus = new Customer(id,name,email,address,phone,username,password);
					customer.add(cus);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
			return customer;	
		}



*/


    
    public static boolean insertcustomer(String name, String email,String address, String phone, String username, String password) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into rokittaxi.customer values (0,'"+name+"','"+email+"','"+address+"','"+phone+"','"+username+"','"+password+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
    
    public static boolean bookride(String location, String type, String customerid){
    	
    	boolean isSuccess = false;
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "insert into rokittaxi.ride values (0,'"+location+"','"+type+"','"+customerid+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
    
    
    
    
    public static boolean updatecustomer(String id, String name, String email,String address, String phone, String username, String password) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update customer set name='"+name+"',email='"+email+"',address='"+address+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
    				+ "where id='"+id+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
 
    /*
    public static List<Customer> getCustomerDetails(String id) {
    	
    	int intID = Integer.parseInt(id);
    	
    	ArrayList<Customer> cus = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from customer where customerID='"+intID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int Id = rs.getInt(1);
    			String name = rs.getString(2);
    			String email = rs.getString(3);
    			String address = rs.getString(4);
    			String phone = rs.getString(5);
    			String username = rs.getString(6);
    			String password = rs.getString(7);
    			
    			Customer c = new Customer(Id,name,email,address,phone,username,password);
    			cus.add(c);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return cus;	
    }
    
    */
    
    
    public static boolean deleteCustomer(String id) {
    	
    	int convId = Integer.parseInt(id);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from customer where id='"+convId+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }

    
 

}
