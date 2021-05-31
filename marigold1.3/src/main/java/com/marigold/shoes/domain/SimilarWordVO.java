package com.marigold.shoes.domain;

public class SimilarWordVO {
	private String similarWord;
	private String standardWord;
	
	public SimilarWordVO() {
		super();
	}
	
	public SimilarWordVO(String similarWord, String standardWord) {
		super();
		this.similarWord = similarWord;
		this.standardWord = standardWord;
	}
	
	public String getSimilarWord() {
		return similarWord;
	}
	public void setSimilarWord(String similarWord) {
		this.similarWord = similarWord;
	}
	public String getStandardWord() {
		return standardWord;
	}
	public void setStandardWord(String standardWord) {
		this.standardWord = standardWord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((similarWord == null) ? 0 : similarWord.hashCode());
		result = prime * result + ((standardWord == null) ? 0 : standardWord.hashCode());
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
		SimilarWordVO other = (SimilarWordVO) obj;
		if (similarWord == null) {
			if (other.similarWord != null)
				return false;
		} else if (!similarWord.equals(other.similarWord))
			return false;
		if (standardWord == null) {
			if (other.standardWord != null)
				return false;
		} else if (!standardWord.equals(other.standardWord))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SimilarWordVO [similarWord=" + similarWord + ", standardWord=" + standardWord + "]";
	}

}
