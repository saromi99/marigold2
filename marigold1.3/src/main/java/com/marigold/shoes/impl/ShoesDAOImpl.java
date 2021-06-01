package com.marigold.shoes.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marigold.shoes.domain.BrandVO;
import com.marigold.shoes.domain.FourthCategoryVO;
import com.marigold.shoes.domain.ResultVO;
import com.marigold.shoes.domain.ShoesDAO;
import com.marigold.shoes.domain.ShoesVO;
import com.marigold.shoes.domain.SimilarWordVO;

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
	public List<ResultVO> getCheckList(ShoesVO vo) { // 체크박스에서 체크된 여러 값들을 이용해 shoess 테이블에서 검색하는 작업
		return session.selectList("ShoesDAO.getCheckList", vo);
	}

	@Override
	public List<ResultVO> getSearchList(String[] searchKeyword) { // 표준화되지 않은 검색어를 shoess 테이블에서 검색하는 작업
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchKeyword", searchKeyword);
		
		return session.selectList("ShoesDAO.getSearchList", map);
	}

	@Override
	public List<SimilarWordVO> getSearchListSimilar(String[] searchKeyword) { // 검색창에 들어온 검색어들을 similarWord 테이블을 이용해 표준화 하는 작업
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchKeyword", searchKeyword);
		
		return session.selectList("ShoesDAO.getSearchListSimilar", map);
	}

	@Override
	public List<ResultVO> getStandardWord(List<SimilarWordVO> similarWord) { // 표준화된 검색어를 이용해 shoess 테이블에서 검색해 데이터들을 가져오는 작업
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> standardWordList = new ArrayList<String>();
		
		// 표준화된 검색어들을 standardWordList 리스트에 값을 저장해 그 값들로 shoess 테이블에서 검색
		for(int i = 0; i < similarWord.size(); i += 1) {
			standardWordList.add(similarWord.get(i).getStandardWord());
		}

		map.put("standardWord", standardWordList);
		
		return session.selectList("ShoesDAO.getStandardWord", map);
	}

	@Override
	public FourthCategoryVO getFourthCategory(String fourthCategory) {
		return session.selectOne("ShoesDAO.getFourthCategory", fourthCategory);
	}

	@Override
	public BrandVO getBrand(String brand) {
		return session.selectOne("ShoesDAO.getBrand", brand);
	}
}
