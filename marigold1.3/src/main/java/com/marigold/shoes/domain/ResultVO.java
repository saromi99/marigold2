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
	private int purchaseCnt;
	
	public ResultVO() {
		super();
	}
	
	public ResultVO(String firstCategory, String secondCategory, String thirdCategory, String fourthCategory,
			String brand, String specialDay, String color, String material, int price, int heel, String modelId,
			int purchaseCnt) {
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
		this.purchaseCnt = purchaseCnt;
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
	public int getPurchaseCnt() {
		return purchaseCnt;
	}
	public void setPurchaseCnt(int purchaseCnt) {
		this.purchaseCnt = purchaseCnt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((firstCategory == null) ? 0 : firstCategory.hashCode());
		result = prime * result + ((fourthCategory == null) ? 0 : fourthCategory.hashCode());
		result = prime * result + heel;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((modelId == null) ? 0 : modelId.hashCode());
		result = prime * result + price;
		result = prime * result + purchaseCnt;
		result = prime * result + ((secondCategory == null) ? 0 : secondCategory.hashCode());
		result = prime * result + ((specialDay == null) ? 0 : specialDay.hashCode());
		result = prime * result + ((thirdCategory == null) ? 0 : thirdCategory.hashCode());
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
		ResultVO other = (ResultVO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (firstCategory == null) {
			if (other.firstCategory != null)
				return false;
		} else if (!firstCategory.equals(other.firstCategory))
			return false;
		if (fourthCategory == null) {
			if (other.fourthCategory != null)
				return false;
		} else if (!fourthCategory.equals(other.fourthCategory))
			return false;
		if (heel != other.heel)
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (modelId == null) {
			if (other.modelId != null)
				return false;
		} else if (!modelId.equals(other.modelId))
			return false;
		if (price != other.price)
			return false;
		if (purchaseCnt != other.purchaseCnt)
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
		if (thirdCategory == null) {
			if (other.thirdCategory != null)
				return false;
		} else if (!thirdCategory.equals(other.thirdCategory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResultVO [firstCategory=" + firstCategory + ", secondCategory=" + secondCategory + ", thirdCategory="
				+ thirdCategory + ", fourthCategory=" + fourthCategory + ", brand=" + brand + ", specialDay="
				+ specialDay + ", color=" + color + ", material=" + material + ", price=" + price + ", heel=" + heel
				+ ", modelId=" + modelId + ", purchaseCnt=" + purchaseCnt + "]";
	}

}
