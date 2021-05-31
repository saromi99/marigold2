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
	public List<ThirdCategoryVO> getThirdCategory(String thirdCategory);
	public List<SimilarWordVO> getSearchListSimilar(String[] searchKeyword);
	public List<ResultVO> getStandardWord(List<SimilarWordVO> similarWord);

}
