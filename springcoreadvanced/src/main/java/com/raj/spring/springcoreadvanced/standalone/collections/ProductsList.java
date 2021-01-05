package com.raj.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class ProductsList {

	private List<String> productNames;

	public List<String> getProductNames() {
		return productNames;
	}

	@Override
	public String toString() {
		return "ProductsList [productNames=" + productNames + "]";
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

}
