package com.raj.spring.springcore.ass;

public class ShoppingCart {

	private Item item;

	@Override
	public String toString() {
		return "ShoppingCart [item=" + getItem() + "]";
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
