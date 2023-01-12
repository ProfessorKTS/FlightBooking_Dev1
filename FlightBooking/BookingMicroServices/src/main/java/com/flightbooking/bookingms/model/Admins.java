package com.flightbooking.bookingms.model;

public class Admins {

	String adminName;
	String adminID;
	String adminEmail;
	double adminMobile;
	
	public Admins(String adminName, String adminID, String adminEmail, double adminMobile) {
		super();
		this.adminName = adminName;
		this.adminID = adminID;
		this.adminEmail = adminEmail;
		this.adminMobile = adminMobile;
	}
	
	public Admins() {
		super();
	}
	
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public double getAdminMobile() {
		return adminMobile;
	}
	public void setAdminMobile(double adminMobile) {
		this.adminMobile = adminMobile;
	}
	
	@Override
	public String toString() {
		return "Admins [adminName=" + adminName + ", adminID=" + adminID + ", adminEmail=" + adminEmail
				+ ", adminMobile=" + adminMobile + "]";
	}
	
}
