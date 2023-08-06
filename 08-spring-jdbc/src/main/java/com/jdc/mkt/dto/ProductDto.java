package com.jdc.mkt.dto;

public class ProductDto extends Product {

	public void setCategoryId(int id) {
		if (this.getCategory() == null) {
			this.setCategory(new Category());
		}
		this.getCategory().setId(id);
	}

	public void setCategoryName(String categoryName) {
		if (this.getCategory() == null) {
			this.setCategory(new Category());
		}
		this.getCategory().setName(categoryName);
	}
}
