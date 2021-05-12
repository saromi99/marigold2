package com.marigold.shoes.domain;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ShoesVO {
	private String firstCategory;
	private String secondCategory;
	private String[] thirdCategory;
	private String[] fourthCategory;
	private String[] brand;
	private String specialDay;
	private String[] color;
	private String[] material;
	private int[] price;
	private int heel;
	private String modelId;
	
	@XmlTransient
	private String searchKeyword;
	
	public ShoesVO() {
		super();
	}

	public ShoesVO(String firstCategory, String secondCategory, String[] thirdCategory, String[] fourthCategory,
			String[] brand) {
		super();
		this.firstCategory = firstCategory;
		this.secondCategory = secondCategory;
		this.thirdCategory = thirdCategory;
		this.fourthCategory = fourthCategory;
		this.brand = brand;
	}

	public ShoesVO(String firstCategory, String secondCategory, String[] thirdCategory, String[] fourthCategory,
			String[] brand, String specialDay, String[] color, String[] material, int[] price, int heel,
			String modelId) {
		super();
		this.firstCategory = firstCategory;
		this.secondCategory = secondCategory;
		this.thirdCategory = thirdCategory;
		this.fourthCategory = fourthCategory;
		this.brand = brand;
		this.specialDay = specialDay;
		this.color = color;
		this.material = material;
		this.price = price;
		this.heel = heel;
		this.modelId = modelId;
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

	public String[] getThirdCategory() {
		return thirdCategory;
	}

	public void setThirdCategory(String[] thirdCategory) {
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

	public String getSpecialDay() {
		return specialDay;
	}

	public void setSpecialDay(String specialDay) {
		this.specialDay = specialDay;
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
	
	
	@JsonIgnore
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(brand);
		result = prime * result + Arrays.hashCode(color);
		result = prime * result + ((firstCategory == null) ? 0 : firstCategory.hashCode());
		result = prime * result + Arrays.hashCode(fourthCategory);
		result = prime * result + heel;
		result = prime * result + Arrays.hashCode(material);
		result = prime * result + ((modelId == null) ? 0 : modelId.hashCode());
		result = prime * result + Arrays.hashCode(price);
		result = prime * result + ((secondCategory == null) ? 0 : secondCategory.hashCode());
		result = prime * result + ((specialDay == null) ? 0 : specialDay.hashCode());
		result = prime * result + Arrays.hashCode(thirdCategory);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoesVO other = (ShoesVO) obj;
		if (!Arrays.equals(brand, other.brand))
			return false;
		if (!Arrays.equals(color, other.color))
			return false;
		if (firstCategory == null) {
			if (other.firstCategory != null)
				return false;
		} else if (!firstCategory.equals(other.firstCategory))
			return false;
		if (!Arrays.equals(fourthCategory, other.fourthCategory))
			return false;
		if (heel != other.heel)
			return false;
		if (!Arrays.equals(material, other.material))
			return false;
		if (modelId == null) {
			if (other.modelId != null)
				return false;
		} else if (!modelId.equals(other.modelId))
			return false;
		if (!Arrays.equals(price, other.price))
			return false;
		if (secondCategory == null) {
			if (other.secondCategory != null)
				return false;
		} else if (!secondCategory.equals(other.secondCategory))
			return false;
		if (specialDay == null) {
			if (other.specialDay != null)
				return false;
		} else if (!specialDay.equals(other.specialDay))
			return false;
		if (!Arrays.equals(thirdCategory, other.thirdCategory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShoesVO [firstCategory=" + firstCategory + ", secondCategory=" + secondCategory + ", thirdCategory="
				+ Arrays.toString(thirdCategory) + ", fourthCategory=" + Arrays.toString(fourthCategory) + ", brand="
				+ Arrays.toString(brand) + ", specialDay=" + specialDay + ", color=" + Arrays.toString(color)
				+ ", material=" + Arrays.toString(material) + ", price=" + Arrays.toString(price) + ", heel=" + heel
				+ ", modelId=" + modelId + "]";
	}

}
