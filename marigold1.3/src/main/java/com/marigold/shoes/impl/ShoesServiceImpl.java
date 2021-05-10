package com.marigold.shoes.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public List<ShoesVO> getList(ShoesVO vo) {
		return dao.getList(vo);
	}
	
	@Override
	public String getOneCheck(ShoesVO vo) {
		
		
		return dao.getOneCheck(vo);
	}

	@Override
	public List<ShoesVO> getListCheck() {
		List<ShoesVO> list = null;

		return list;
	}

	@Override
	public List<ShoesVO> getCheckList(ShoesVO vo) {
		List<ShoesVO> list = new ArrayList<ShoesVO>();
		HashMap<String, List<ShoesVO>> map = new HashMap<String, List<ShoesVO>>();
		map.put("list", list);
		
		return dao.getCheckList(vo);
	}

}
