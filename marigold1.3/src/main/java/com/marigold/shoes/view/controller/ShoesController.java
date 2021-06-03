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

import com.marigold.shoes.domain.BrandVO;
import com.marigold.shoes.domain.FourthCategoryVO;
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
		System.out.println("제품 전체 목록");
		
		List<ResultVO> shoesList = shoesService.getList(vo);
		
		// fourthCategory 와 brand 의 내용을 코드 대신 한글로 표현하기 위한 함수
		tradeCategory(shoesList, mod);
		
		return "getShoesList.jsp";
	}
	
	@RequestMapping(value="/getOne.do")
	public String getOne(ResultVO vo, Model mod) {
		System.out.println("글 상세 조회 처리");
		
		ResultVO shoes = shoesService.getOne(vo);

		FourthCategoryVO fourthCategory = shoesService.getFourthCategory(shoes.getFourthCategory());
				
		BrandVO brand = shoesService.getBrand(shoes.getBrand());

		mod.addAttribute("shoes", shoes);
		mod.addAttribute("fourthCategory", fourthCategory);
		mod.addAttribute("brand", brand);
		
		return "getOne.jsp";
	}
	
/*	
	@RequestMapping(value="/getSearchList.do")
	public String getSearchList(ShoesVO vo, HttpServletRequest request, Model mod) {
		System.out.println("검색하기");
		System.out.println(request.getParameter("searchKeyword"));
		
		String[] searchKeyword = request.getParameter("searchKeyword").split("[\\s+~!@#$%^&*(),.?\"\':;\\{\\}\\[\\]-_=|<>+\\\\]+");
		
		for(int i = 0; i < searchKeyword.length; i += 1) { System.out.println(searchKeyword[i]); }
		
		List<ResultVO> shoesList = shoesService.getSearchList(searchKeyword);
		
		mod.addAttribute("shoesList", shoesList);
		
		return "getShoesList.jsp";
	}
*/
	
	@RequestMapping(value="/getSearchListSimilar.do")
	public String getSearchListSimilar(ShoesVO vo, HttpServletRequest request, Model mod) {
		System.out.println("검색하기");
		System.out.println(request.getParameter("searchKeyword"));
		
		// 넘어온 검색어를 특수문자 또는 띄어쓰기로 나눠 searchKeyword 배열에 담기
		String[] searchKeyword = request.getParameter("searchKeyword").split("[\\s+~!@#$%^&*(),.?\"\':;\\{\\}\\[\\]-_=|<>+\\\\]+");
		System.out.println("searchKeyword의 길이 : " + searchKeyword.length);
		for(int i = 0; i < searchKeyword.length; i += 1) { System.out.print(searchKeyword[i] + " "); } System.out.println();
		
		// searchKeyword 내용을 shoess 테이블에서 먼저 검색해 shoesList에 담기 - brand 와 modelId 는 like로 검색이 가능하게 하기 위해서
		List<ResultVO> shoesList = shoesService.getSearchList(searchKeyword);
		
		// searchKeyword 내용을 similarWord 테이블에서 검색해 단어를 표준화 하기
		List<SimilarWordVO> similarWord = shoesService.getSearchListSimilar(searchKeyword);
		for(int i = 0; i < similarWord.size(); i += 1) { System.out.print(similarWord.get(i).getStandardWord() + " "); } System.out.println();
		
		// similarWord가 비어있지 않으면 단어를 표준화해서 shoesList에 추가하기
		if(!similarWord.isEmpty()) { 
			shoesList.addAll(shoesService.getStandardWord(similarWord)); 
		}
		System.out.println("shoesList의 크기 : " + shoesList.size());
		
		// fourthCategory 와 brand 의 내용을 코드 대신 한글로 표현하기 위한 함수
		tradeCategory(shoesList, mod);
		
		return "getShoesList.jsp";
	}
	
	@RequestMapping(value="/getCheckList.do")
	public String getCheckList(ShoesVO vo, HttpServletRequest request, Model mod) {
		System.out.println("체크박스 값 가져오기");
		
		// 체크박스에서 체크한 여러 값을 검색해 shoesList 리스트에 담기
		List<ResultVO> shoesList = shoesService.getCheckList(vo);
		
		// fourthCategory 와 brand 의 내용을 코드 대신 한글로 표현하기 위한 함수
		tradeCategory(shoesList, mod);
		
		return "getShoesList.jsp";
	}
	
	@RequestMapping(value="/buyShoes.do")
	public String buyShoes(ResultVO vo, HttpServletRequest request, Model mod) {
		System.out.println("DB로 구매내역 넘기기");
		int purchaseCnt = Integer.parseInt(request.getParameter("purchaseCnt"));
		
		shoesService.updateCnt(vo, purchaseCnt);
		ResultVO shoes = shoesService.getOne(vo);
		
		mod.addAttribute("shoes", shoes);
		mod.addAttribute("purchaseCnt", purchaseCnt);
		
		return "buyShoes.jsp";
	}
	
	// fourthCategory 와 brand 의 내용을 코드 대신 한글로 표현하기 위한 함수
	public void tradeCategory(List<ResultVO> shoesList, Model mod) {
		// fourthCategory 내용을 getShoesList.jsp에서 한글로 표시하기 위해
		List<FourthCategoryVO> fourthCategory = new ArrayList<FourthCategoryVO>();
		for(int i = 0; i < shoesList.size(); i += 1) { fourthCategory.add(shoesService.getFourthCategory(shoesList.get(i).getFourthCategory())); }
		
		// brand 이름을 getShoesList.jsp에서 한글로 표시하기 위해
		List<BrandVO> brand = new ArrayList<BrandVO>();
		for(int i = 0; i < shoesList.size(); i += 1) { brand.add(shoesService.getBrand(shoesList.get(i).getBrand())); }
				
		// getShoesList.jsp에서 사용하기 위해 shoesList, fourthCategory, brand를 attribute로 설정
		mod.addAttribute("shoesList", shoesList);
		mod.addAttribute("fourthCategory", fourthCategory);
		mod.addAttribute("brand", brand);
	}

}
