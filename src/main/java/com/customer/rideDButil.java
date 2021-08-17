package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class rideDButil extends DBConnect{
	
	private static boolean isSuccess;
	//private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
	
	public static boolean updateride(int rideid, String location, String type, String cusid){
    	
    	try {
    		
    		Connection con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update ride set location= '"+location+"', type='"+type+"' , customerid='"+cusid+"' where rideID='"+rideid+"' ";
    				
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
	
	
	 public static boolean deleteRide(String id) {
		 
		 int rideID = Integer.parseInt(id);
		 
		 try{
	    		
	    		Connection con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from ride where rideID ='"+rideID+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if (rs > 0) {
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

	
	 public static ride getRideByID(String rideid) {

			return getRide(rideid).get(0);
		}
	 
	 
	 
	 public static List<ride> getRide(String customerID){
			
			ArrayList<ride> ride = new ArrayList<>();
			
			try {
				Connection con = DBConnect.getConnection();
	    		stmt = con.createStatement();
				String sql = "select * from rokittaxi.ride where customerid='"+customerID+"' ";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {	
					
					int id = rs.getInt(1);
					String location = rs.getString(2);
					String type = rs.getString(3);
					String customerid = rs.getString(4);
					
					
					ride ride1 = new ride(id,location,type,customerid);
					ride.add(ride1);
				}
			}
			catch(Exception e) {
			
			}
			
			return ride;
			
		}
	 
	
	 public static boolean validateCreate(String password) {
			
			try {
				Connection con = DBConnect.getConnection();
	    		stmt = con.createStatement();
				String sql = "select * from rokit.driver where password = '"+password+"'";
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					isSuccess = true;
				}else {
					isSuccess = false;
				}
				
			}
			catch(Exception e){
				e.printStackTrace();	
			}
			
			return isSuccess;
		}
	 
	 public static boolean validateRide(String VehicleID) {
			
			try {
				Connection con = DBConnect.getConnection();
	    		stmt = con.createStatement();
				String sql = "select * from rokit.vehicledt where VehicleID = '"+VehicleID+"'";
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					isSuccess = true;
				}else {
					isSuccess = false;
				}
				
			}
			catch(Exception e){
				e.printStackTrace();	
			}
			
			return isSuccess;
		}
	 
	 
	 public static List<ride> ValidateRideId(int rideid){
			ArrayList<ride> ride= new ArrayList<>();
			
			try {
				Connection con = DBConnect.getConnection();
	    		stmt = con.createStatement();
				String SQL= "select * from ride where rideid='"+rideid+"' ";
				rs =stmt.executeQuery(SQL);
				
				
				if (rs.next()){
					int rideID=rs.getInt (1);
					String location=rs.getString(2);
					String type=rs.getString(3);
					String customerid=rs.getString(4);
			
					
					ride RIDE= new ride(rideID,location,type,customerid);
					ride.add(RIDE);
				}

				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			return ride;
		}

	
	 
	 } 
	
	

