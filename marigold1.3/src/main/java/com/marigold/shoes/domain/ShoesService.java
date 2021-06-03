package com.marigold.shoes.domain;

import java.util.List;

public interface ShoesService {
	public void insertShoes(ShoesVO vo);
	public void updateShoes(ShoesVO vo);
	public void deleteOneShoes(int article);
	public void deleteAll();
	public int getCount();
	
	public ResultVO getOne(ResultVO vo);
	public List<ResultVO> getList(ShoesVO vo);
	
	public List<ResultVO> getCheckList(ShoesVO vo);
	public List<ResultVO> getSearchList(String[] searchKeyword);
	public List<SimilarWordVO> getSearchListSimilar(String[] searchKeyword);
	public List<ResultVO> getStandardWord(List<SimilarWordVO> similarWord);
	public FourthCategoryVO getFourthCategory(String fourthCategory);
	public BrandVO getBrand(String brand);
	public void updateCnt(ResultVO vo, int purchaseCnt);

}
