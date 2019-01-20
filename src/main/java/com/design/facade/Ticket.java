package com.design.facade;

public class Ticket {

	private String ticketNo;
	private int price;

	public Ticket(String ticketNo, int cost) {
		this.ticketNo = ticketNo;
		this.price = cost;
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
