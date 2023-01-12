package com.flightbooking.bookingms.model;

public class Users {

	String userName;
	String userID;
	String userEmail;
	double userMobile;
	
	public Users(String userName, String userID, String userEmail, double userMobile) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
	}
	
	public Users() {
		super();
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public double getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(double userMobile) {
		this.userMobile = userMobile;
	}
	@Override
	public String toString() {
		return "Users [userName=" + userName + ", userID=" + userID + ", userEmail=" + userEmail + ", userMobile="
				+ userMobile + "]";
	}
	
	
}
