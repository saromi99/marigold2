package com.marigold.shoes.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marigold.shoes.domain.ResultVO;
import com.marigold.shoes.domain.ShoesDAO;
import com.marigold.shoes.domain.ShoesVO;
import com.marigold.shoes.domain.SimilarWordVO;
import com.marigold.shoes.domain.ThirdCategoryVO;

@Repository("shoesDAOReal")
public class ShoesDAOImpl implements ShoesDAO {
	
	@Autowired
	SqlSession session;

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
		return session.selectOne("ShoesDAO.getOne", vo);
	}

	@Override
	public List<ResultVO> getList(ShoesVO vo) {
		return session.selectList("ShoesDAO.getList", vo);
	}

	@Override
	public List<ResultVO> getCheckList(ShoesVO vo) {
		return session.selectList("ShoesDAO.getCheckList", vo);
	}

	@Override
	public List<ResultVO> getSearchList(String[] searchKeyword) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchKeyword", searchKeyword);
		
		return session.selectList("ShoesDAO.getSearchList", map);
	}

	@Override
	public List<ThirdCategoryVO> getThirdCategory(String thirdCategory) {
		return session.selectList("ShoesDAO.getThirdCategory", thirdCategory);
	}

	@Override
	public List<SimilarWordVO> getSearchListSimilar(String[] searchKeyword) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchKeyword", searchKeyword);
		
		return session.selectList("ShoesDAO.getSearchListSimilar", map);
	}

	@Override
	public List<ResultVO> getStandardWord(List<SimilarWordVO> similarWord) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> standardWordList = new ArrayList<String>();
		
		for(int i = 0; i < similarWord.size(); i += 1) {
			standardWordList.add(similarWord.get(i).getStandardWord());
		}

		map.put("standardWord", standardWordList);
		
		return session.selectList("ShoesDAO.getStandardWord", map);
	}
}
