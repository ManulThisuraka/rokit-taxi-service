package com.customer;

public class ride {
	
	private int id;
	private String location; 
	private String type;
	private String customerid;
	
	public ride(int id, String location, String type, String customerid) {
		super();
		this.id = id;
		this.location = location;
		this.type = type;
		this.customerid = customerid;
	}
	
	
	public int getId() {
		return id;
	}
	public String getLocation() {
		return location;
	}
	public String getType() {
		return type;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	} 
	
	
}
