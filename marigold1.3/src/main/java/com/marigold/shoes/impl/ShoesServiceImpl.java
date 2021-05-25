package com.marigold.shoes.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marigold.shoes.domain.ResultVO;
import com.marigold.shoes.domain.ShoesDAO;
import com.marigold.shoes.domain.ShoesService;
import com.marigold.shoes.domain.ShoesVO;

@Service("shoesServiceReal")
public class ShoesServiceImpl implements ShoesService {
	
	@Autowired
	ShoesDAO dao;

	@Override
	public void insertShoes(ShoesVO vo) {
		
	}

	@Override
	public void updateShoes(ShoesVO vo) {
		
	}

	@Override
	public void deleteOneShoes(int article) {
		
	}

	@Override
	public void deleteAll() {
		
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public ShoesVO getOne(ShoesVO vo) {
		return dao.getOne(vo);
	}

	@Override
	public List<ResultVO> getList(ShoesVO vo) {
		return dao.getList(vo);
	}
	
	@Override
	public List<ResultVO> getCheckList(ShoesVO vo) {
		return dao.getCheckList(vo);
	}

	@Override
	public List<ResultVO> getSearchList(String[] searchKeyword) {
		return dao.getSearchList(searchKeyword);
	}

	@Override
	public List<HashMap<String, String>> getThirdCategory(String[] thirdCategory) {
		return dao.getThirdCategory(thirdCategory);
	}

}
