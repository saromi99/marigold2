package com.marigold.shoes.domain;

public class BrandVO {
	private String brand;
	private String brandCon;
	
	public BrandVO() {
		super();
	}
	public BrandVO(String brand, String brandCon) {
		super();
		this.brand = brand;
		this.brandCon = brandCon;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrandCon() {
		return brandCon;
	}
	public void setBrandCon(String brandCon) {
		this.brandCon = brandCon;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((brandCon == null) ? 0 : brandCon.hashCode());
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
		BrandVO other = (BrandVO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (brandCon == null) {
			if (other.brandCon != null)
				return false;
		} else if (!brandCon.equals(other.brandCon))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "BrandVO [brand=" + brand + ", brandCon=" + brandCon + "]";
	}
	
}
