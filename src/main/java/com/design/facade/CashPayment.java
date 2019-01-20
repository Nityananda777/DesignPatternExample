package com.design.facade;

public class CashPayment implements Payment {

	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Cash Payment  " + amount + " is done ");
		return true;
	}

}
