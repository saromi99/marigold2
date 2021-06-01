package com.marigold.shoes.domain;

public class FourthCategoryVO {
	private String fourthCategory;
	private String fourthCategoryCon;
	private String fourthCategoryClass;
	private String fourthCategorySim;
	
	public FourthCategoryVO() {
		super();
	}

	public FourthCategoryVO(String fourthCategory, String fourthCategoryCon, String fourthCategoryClass,
			String fourthCategorySim) {
		super();
		this.fourthCategory = fourthCategory;
		this.fourthCategoryCon = fourthCategoryCon;
		this.fourthCategoryClass = fourthCategoryClass;
		this.fourthCategorySim = fourthCategorySim;
	}

	public String getFourthCategory() {
		return fourthCategory;
	}
	public void setFourthCategory(String fourthCategory) {
		this.fourthCategory = fourthCategory;
	}
	public String getFourthCategoryCon() {
		return fourthCategoryCon;
	}
	public void setFourthCategoryCon(String fourthCategoryCon) {
		this.fourthCategoryCon = fourthCategoryCon;
	}
	public String getFourthCategoryClass() {
		return fourthCategoryClass;
	}
	public void setFourthCategoryClass(String fourthCategoryClass) {
		this.fourthCategoryClass = fourthCategoryClass;
	}
	public String getFourthCategorySim() {
		return fourthCategorySim;
	}
	public void setFourthCategorySim(String fourthCategorySim) {
		this.fourthCategorySim = fourthCategorySim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fourthCategory == null) ? 0 : fourthCategory.hashCode());
		result = prime * result + ((fourthCategoryClass == null) ? 0 : fourthCategoryClass.hashCode());
		result = prime * result + ((fourthCategoryCon == null) ? 0 : fourthCategoryCon.hashCode());
		result = prime * result + ((fourthCategorySim == null) ? 0 : fourthCategorySim.hashCode());
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
		FourthCategoryVO other = (FourthCategoryVO) obj;
		if (fourthCategory == null) {
			if (other.fourthCategory != null)
				return false;
		} else if (!fourthCategory.equals(other.fourthCategory))
			return false;
		if (fourthCategoryClass == null) {
			if (other.fourthCategoryClass != null)
				return false;
		} else if (!fourthCategoryClass.equals(other.fourthCategoryClass))
			return false;
		if (fourthCategoryCon == null) {
			if (other.fourthCategoryCon != null)
				return false;
		} else if (!fourthCategoryCon.equals(other.fourthCategoryCon))
			return false;
		if (fourthCategorySim == null) {
			if (other.fourthCategorySim != null)
				return false;
		} else if (!fourthCategorySim.equals(other.fourthCategorySim))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FourthCategoryVO [fourthCategory=" + fourthCategory + ", fourthCategoryCon=" + fourthCategoryCon
				+ ", fourthCategoryClass=" + fourthCategoryClass + ", fourthCategorySim=" + fourthCategorySim + "]";
	}
}
