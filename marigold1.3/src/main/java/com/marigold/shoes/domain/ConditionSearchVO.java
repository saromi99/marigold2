package com.marigold.shoes.domain;

import java.util.Arrays;

public class ConditionSearchVO {
	private String firstCategory;
	private String secondCategory;
	private String thirdCategory;
	private String[] fourthCategory;
	private String[] brand;
	private String[] color;
	private String[] material;
	private int[] price;
	public String getFirstCategory() {
		return firstCategory;
	}
	public void setFirstCategory(String firstCategory) {
		this.firstCategory = firstCategory;
	}
	public String getSecondCategory() {
		return secondCategory;
	}
	public void setSecondCategory(String secondCategory) {
		this.secondCategory = secondCategory;
	}
	public String getThirdCategory() {
		return thirdCategory;
	}
	public void setThirdCategory(String thirdCategory) {
		this.thirdCategory = thirdCategory;
	}
	public String[] getFourthCategory() {
		return fourthCategory;
	}
	public void setFourthCategory(String[] fourthCategory) {
		this.fourthCategory = fourthCategory;
	}
	public String[] getBrand() {
		return brand;
	}
	public void setBrand(String[] brand) {
		this.brand = brand;
	}
	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	public String[] getMaterial() {
		return material;
	}
	public void setMaterial(String[] material) {
		this.material = material;
	}
	public int[] getPrice() {
		return price;
	}
	public void setPrice(int[] price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ConditionSearchVO [firstCategory=" + firstCategory + ", secondCategory=" + secondCategory
				+ ", thirdCategory=" + thirdCategory + ", fourthCategory=" + Arrays.toString(fourthCategory)
				+ ", brand=" + Arrays.toString(brand) + ", color=" + Arrays.toString(color) + ", material="
				+ Arrays.toString(material) + ", price=" + Arrays.toString(price) + "]";
	}

	
}
