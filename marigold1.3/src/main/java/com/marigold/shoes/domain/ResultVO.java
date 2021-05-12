package com.marigold.shoes.domain;

public class ResultVO {
	private String firstCategory;
	private String secondCategory;
	private String thirdCategory;
	private String fourthCategory;
	private String brand;
	private String specialDay;
	private String color;
	private String material;
	private int price;
	private int heel;
	private String modelId;
	
	public ResultVO() {
	}
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
	public String getFourthCategory() {
		return fourthCategory;
	}
	public void setFourthCategory(String fourthCategory) {
		this.fourthCategory = fourthCategory;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSpecialDay() {
		return specialDay;
	}
	public void setSpecialDay(String specialDay) {
		this.specialDay = specialDay;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHeel() {
		return heel;
	}
	public void setHeel(int heel) {
		this.heel = heel;
	}
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	
	@Override
	public String toString() {
		return "ResultVO [firstCategory=" + firstCategory + ", secondCategory=" + secondCategory + ", thirdCategory="
				+ thirdCategory + ", fourthCategory=" + fourthCategory + ", brand=" + brand + ", specialDay="
				+ specialDay + ", color=" + color + ", material=" + material + ", price=" + price + ", heel=" + heel
				+ ", modelId=" + modelId + "]";
	}
	
	
}
