package com.marigold.shoes.domain;

import java.util.List;

public interface ShoesDAO {
	public void insertShoes(ShoesVO vo);
	public void updateShoes(ShoesVO vo);
	public void deleteOneShoes(int article);
	public void deleteAll();
	public int getCount();
	
	public ShoesVO getOne(ShoesVO vo);
	public List<ShoesVO> getList(ShoesVO vo);
	 
	public List<ShoesVO> getCheckList(ShoesVO vo);
	
	public String getOneCheck(ShoesVO vo);
	public List<ShoesVO> getListCheck();
}
