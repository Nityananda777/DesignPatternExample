package com.design.facade;

public class UserDetails {

	private String userName;
	private String travelDate;
	private double price;
	private String payment_Type;
	private String report_Type;
	public String getReport_Type() {
		return report_Type;
	}

	public void setReport_Type(String report_Type) {
		this.report_Type = report_Type;
	}

	public String getPayment_Type() {
		return payment_Type;
	}

	public void setPayment_Type(String payment_Type) {
		this.payment_Type = payment_Type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
