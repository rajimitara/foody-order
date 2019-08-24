package com.example.orderService.Model;

public class Customer {
	
	private String customerId;
	private String address ;
	private long contact;
	
	
	
	public Customer(String customerId, String address, long contact) {
		//super();
		this.customerId = customerId;
		this.address = address;
		this.contact = contact;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
}
