package com.marigold.shoes.domain;

public class ThirdCategoryVO {
	private String thirdCategory;
	private String thirdCategoryCon;
	private String thirdCategoryClass;
	
	public ThirdCategoryVO() {
		super();
	}

	public ThirdCategoryVO(String thirdCategory, String thirdCategoryCon, String thirdCategoryClass) {
		super();
		this.thirdCategory = thirdCategory;
		this.thirdCategoryCon = thirdCategoryCon;
		this.thirdCategoryClass = thirdCategoryClass;
	}

	public String getThirdCategory() {
		return thirdCategory;
	}
	public void setThirdCategory(String thirdCategory) {
		this.thirdCategory = thirdCategory;
	}
	public String getThirdCategoryCon() {
		return thirdCategoryCon;
	}
	public void setThirdCategoryCon(String thirdCategoryCon) {
		this.thirdCategoryCon = thirdCategoryCon;
	}
	public String getThirdCategoryClass() {
		return thirdCategoryClass;
	}
	public void setThirdCategoryClass(String thirdCategoryClass) {
		this.thirdCategoryClass = thirdCategoryClass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((thirdCategory == null) ? 0 : thirdCategory.hashCode());
		result = prime * result + ((thirdCategoryClass == null) ? 0 : thirdCategoryClass.hashCode());
		result = prime * result + ((thirdCategoryCon == null) ? 0 : thirdCategoryCon.hashCode());
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
		ThirdCategoryVO other = (ThirdCategoryVO) obj;
		if (thirdCategory == null) {
			if (other.thirdCategory != null)
				return false;
		} else if (!thirdCategory.equals(other.thirdCategory))
			return false;
		if (thirdCategoryClass == null) {
			if (other.thirdCategoryClass != null)
				return false;
		} else if (!thirdCategoryClass.equals(other.thirdCategoryClass))
			return false;
		if (thirdCategoryCon == null) {
			if (other.thirdCategoryCon != null)
				return false;
		} else if (!thirdCategoryCon.equals(other.thirdCategoryCon))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ThirdCategoryVO [thirdCategory=" + thirdCategory + ", thirdCategoryCon=" + thirdCategoryCon
				+ ", thirdCategoryClass=" + thirdCategoryClass + "]";
	}

}
