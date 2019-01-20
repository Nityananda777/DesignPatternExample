package com.design.facade;

public class CreditCardStrategy implements Payment {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		this.name = nm;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.dateOfExpiry = expiryDate;
	}

	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid with credit/debit card");
		return false;
	}

}
