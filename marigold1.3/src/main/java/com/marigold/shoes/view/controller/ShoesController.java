package com.marigold.shoes.view.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.marigold.shoes.domain.ResultVO;
import com.marigold.shoes.domain.ShoesService;
import com.marigold.shoes.domain.ShoesVO;
import com.marigold.shoes.domain.SimilarWordVO;


@Controller
@SessionAttributes("shoes")
public class ShoesController {
	
	@Autowired
	private ShoesService shoesService;
	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		conditionMap.put("작성자", "WRITER");
		
		return conditionMap;
	}

	@RequestMapping(value="/insertShoes.do")
	public String insertBoard(ShoesVO vo) throws IOException {
		System.out.println("글 등록 처리");
		shoesService.insertShoes(vo);
		return "getList.do";
	}
	
	@RequestMapping(value="/deleteShoes.do")
	public String deleteOneShoes(int article) {
		System.out.println("글 삭제 처리");
		shoesService.deleteOneShoes(article);
		return "getList.do";
	}
	
	@RequestMapping(value="/updateShoes.do")
	public String updateShoes(@ModelAttribute("shoes")ShoesVO vo) {
		System.out.println("글 수정 처리");
		shoesService.updateShoes(vo);
		return "getList.do";
	}
	
	@RequestMapping(value="/getList.do")
	public String getList(ShoesVO vo, Model mod) {
		System.out.println("제품 검색 목록 처리");
		List<ResultVO> shoesList = shoesService.getList(vo);
		mod.addAttribute("shoesList", shoesList);
		
		return "getShoesList.jsp";
	}
	
	@RequestMapping(value="/getOne.do")
	public String getOne(ResultVO vo, Model mod) {
		System.out.println("글 상세 조회 처리");
		
		ResultVO shoes = shoesService.getOne(vo);
		
		mod.addAttribute("shoes", shoes);
		
		return "getOne.jsp";
	}
	
	@RequestMapping(value="/getSearchList.do")
	public String getSearchList(ShoesVO vo, HttpServletRequest request, Model mod) {
		System.out.println("검색 값 가져오기");
		System.out.println(request.getParameter("searchKeyword"));
		
		String[] searchKeyword = request.getParameter("searchKeyword").split("[\\s+~!@#$%^&*(),.?\"\':;\\{\\}\\[\\]-_=|<>+\\\\]+");
		
		for(int i = 0; i < searchKeyword.length; i += 1) { System.out.println(searchKeyword[i]); }
		
		List<ResultVO> shoesList = shoesService.getSearchList(searchKeyword);
		
		mod.addAttribute("shoesList", shoesList);
		
		return "getShoesList.jsp";
	}
	
	@RequestMapping(value="/getSearchListSimilar.do")
	public String getSearchListSimilar(ShoesVO vo, HttpServletRequest request, Model mod) {
		System.out.println("검색 값 가져오기");
		System.out.println(request.getParameter("searchKeyword"));
		
		String[] searchKeyword = request.getParameter("searchKeyword").split("[\\s+~!@#$%^&*(),.?\"\':;\\{\\}\\[\\]-_=|<>+\\\\]+");
		
		System.out.println("searchKeyword의 길이 : " + searchKeyword.length);
		
		for(int i = 0; i < searchKeyword.length; i += 1) { System.out.println("searchKeyword[" + i + "] : " + searchKeyword[i]); }
		
		List<ResultVO> shoesList = shoesService.getSearchList(searchKeyword);
		
		List<SimilarWordVO> similarWord = shoesService.getSearchListSimilar(searchKeyword);
		for(int i = 0; i < similarWord.size(); i += 1) { System.out.println("getStandardWord()의 " + i + " 번째 : " + similarWord.get(i).getStandardWord()); }
		
		if(!similarWord.isEmpty()) {
			shoesList.addAll(shoesService.getStandardWord(similarWord));
		}
		System.out.println("shoesList의 크기 : " + shoesList.size());
		mod.addAttribute("shoesList", shoesList);
		
		return "getShoesList.jsp";
	}
	
	@RequestMapping(value="/getCheckList.do")
	public String getCheckList(ShoesVO vo, HttpServletRequest request, Model mod) {
		System.out.println("체크박스 값 가져오기");
		
		List<ResultVO> shoesList = shoesService.getCheckList(vo);
		
		mod.addAttribute("shoesList", shoesList);
		
		return "getShoesList.jsp";
	}

}
