package com.design.visitor;

public class Books implements ItemElement {

	public Books(int price, String isbnNumber) {
		super();
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	private int price;
	private String isbnNumber;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);

	}

}
