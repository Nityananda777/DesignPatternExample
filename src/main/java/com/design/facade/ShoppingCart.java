package com.design.facade;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Ticket> items;

	public ShoppingCart() {
		this.items = new ArrayList<Ticket>();
	}

	public void addItem(Ticket item) {
		this.items.add(item);
	}

	public void removeItem(Ticket item) {
		this.items.remove(item);
	}
	public void pay(Payment paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
	private int calculateTotal() {
		int sum = 0;
		for (Ticket item : items) {
			sum += item.getPrice();
		}
		return sum;
	}
}
