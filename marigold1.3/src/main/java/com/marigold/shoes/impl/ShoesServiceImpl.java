package com.marigold.shoes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marigold.shoes.domain.BrandVO;
import com.marigold.shoes.domain.FourthCategoryVO;
import com.marigold.shoes.domain.ResultVO;
import com.marigold.shoes.domain.ShoesDAO;
import com.marigold.shoes.domain.ShoesService;
import com.marigold.shoes.domain.ShoesVO;
import com.marigold.shoes.domain.SimilarWordVO;

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
	public ResultVO getOne(ResultVO vo) {
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
	public List<SimilarWordVO> getSearchListSimilar(String[] searchKeyword) {
		return dao.getSearchListSimilar(searchKeyword);
	}

	@Override
	public List<ResultVO> getStandardWord(List<SimilarWordVO> similarWord) {
		return dao.getStandardWord(similarWord);
	}

	@Override
	public FourthCategoryVO getFourthCategory(String fourthCategory) {
		return dao.getFourthCategory(fourthCategory);
	}

	@Override
	public BrandVO getBrand(String brand) {
		return dao.getBrand(brand);
	}

	@Override
	public List<ResultVO> buyShoes(ResultVO vo) {
		return dao.buyShoes(vo);
	}

}
