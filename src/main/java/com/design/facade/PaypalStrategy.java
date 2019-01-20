package com.design.facade;

public class PaypalStrategy implements Payment {

	private String emailId;
	private String password;

	public PaypalStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}

	@Override
	public boolean pay(double amount) {
		System.out.println(amount + " paid using Paypal.");
		return false;
	}

}