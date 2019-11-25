package com.design.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
	int price = 0;

	@Override
	public int visit(ItemElement itemElement) {
		if (itemElement instanceof Books) {
			Books books = (Books) itemElement;
			if (books.getPrice() < 200) {
				price = price + 20;
			}
		} else if (itemElement instanceof Furniture) {
			Furniture furn = (Furniture) itemElement;
			if (furn.getPrice() < 300) {
				price = price + 50;
			}

		} else if (itemElement instanceof MobilePhone)
		{
			MobilePhone mob = (MobilePhone) itemElement;
			if (mob.getPrice() < 400) {
				price = price + 30;
			}
		}
		return price;
	}
}
