package com.marigold.shoes.domain;

import java.util.HashMap;
import java.util.List;

public interface ShoesDAO {
	public void insertShoes(ShoesVO vo);
	public void updateShoes(ShoesVO vo);
	public void deleteOneShoes(int article);
	public void deleteAll();
	public int getCount();
	
	public ShoesVO getOne(ShoesVO vo);
	public List<ResultVO> getList(ShoesVO vo);
	 
	public List<ResultVO> getCheckList(ShoesVO vo);
	public List<ResultVO> getSearchList(String[] searchKeyword);
	public List<HashMap<String, String>> getThirdCategory(String[] thirdCategory);

}
