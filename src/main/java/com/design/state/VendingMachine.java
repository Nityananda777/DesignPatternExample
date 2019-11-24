package com.design.state;

import java.util.List;

public interface VendingMachine {

	public void insertCoin(Coin coin);

	public long selectItemAndGetPrice(Item item);

	public List<Coin> refund();

	public Bucket<Item, List<Coin>> collectItemAndChange();

	public void reset();

}
