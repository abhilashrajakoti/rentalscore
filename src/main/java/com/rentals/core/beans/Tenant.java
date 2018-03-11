package com.rentals.core.beans;

public class Tenant {
	private long id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String aadhaarno;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAadhaarno() {
		return aadhaarno;
	}
	public void setAadhaarno(String aadhaarno) {
		this.aadhaarno = aadhaarno;
	}
	public long getId() {
		return id;
	}
	
	

}
