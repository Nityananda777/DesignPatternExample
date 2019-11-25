package com.design.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<ItemElement> iteamList = new ArrayList<ItemElement>();
		iteamList.add(new Books(30, "ISBN3424234"));
		iteamList.add(new MobilePhone(40, "ISBN3424235"));
		iteamList.add(new Furniture(40, "ISBN3424235"));

		System.out.println(calculateTotal(iteamList));
	}

	private static int calculateTotal(List<ItemElement> iteamList) {
		int sum = 0;
		ShoppingCartVisitor vis = new ShoppingCartVisitorImpl();
		for (ItemElement iteam : iteamList) {
			sum = iteam.accept(vis);
		}
		return sum;
	}

}
