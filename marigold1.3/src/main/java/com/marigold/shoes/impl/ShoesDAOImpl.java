package com.marigold.shoes.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marigold.shoes.domain.ShoesDAO;
import com.marigold.shoes.domain.ShoesVO;

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
	public ShoesVO getOne(ShoesVO vo) {
		return session.selectOne("ShoesDAO.getOne", vo);
	}

	@Override
	public List<ShoesVO> getList(ShoesVO vo) {
		return session.selectList("ShoesDAO.getList", vo);
	}

	@Override
	public String getOneCheck(ShoesVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> getListCheck() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoesVO> getCheckList(ShoesVO vo) {
		return session.selectList("ShoesDAO.getCheckList", vo);
	}

}
