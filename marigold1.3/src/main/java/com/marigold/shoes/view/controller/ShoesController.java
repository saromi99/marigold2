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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.marigold.shoes.domain.ConditionSearchVO;
import com.marigold.shoes.domain.ShoesService;
import com.marigold.shoes.domain.ShoesVO;


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
	
	@RequestMapping(value="/getOne.do")
	public String getOne(ShoesVO vo, Model mod) {
		System.out.println("글 상세 조회 처리");
		ShoesVO shoes = shoesService.getOne(vo);
		mod.addAttribute("shoes", shoes);
		return "getOne.jsp";
	}
	
	@RequestMapping(value="/getCheckList.do")
	public String getCheckValue(ShoesVO vo, HttpServletRequest request, Model mod) {
		System.out.println("체크박스 값 가져오기");
		System.out.println(vo);
		
		List<ShoesVO> checkShoes = shoesService.getCheckList(vo);
		mod.addAttribute("checkShoes", checkShoes);
		
		return "getList.do";
	}
/*	public String getCheckValue(ShoesVO vo, HttpServletRequest request, Model mod) {
		System.out.println("체크박스 값 가져오기");
		
		List<ShoesVO> checkShoes = new ArrayList<ShoesVO>();
		
		String firstCategory = request.getParameter("firstCategory");
		String secondCategory = request.getParameter("secondCategory");
		String thirdCategory = request.getParameter("thirdCategory");
		String[] fourthCategory = request.getParameterValues("fourthCategory");
		String[] brand = request.getParameterValues("brand");
		String[] color = request.getParameterValues("color");
		String[] material = request.getParameterValues("material");
		String[] price = request.getParameterValues("price");
		
		String article = firstCategory + secondCategory + thirdCategory;
		
		for(int i = 0; i < fourthCategory.length; i++) {
			article += fourthCategory[i];
			for(int j = 0; j < brand.length; j++) {
				article += brand[j];
				System.out.println(article);
				vo.setArticle(article);
				checkShoes.set((i * j) + j, shoesService.getOne(vo));
//				checkShoes = shoesService.getCheckList(vo);
				article = article.substring(0, 5);
			}
			article = article.substring(0, 3);
			System.out.println("잘되고 있나???");
		}
		mod.addAttribute("checkShoes", checkShoes);
		System.out.println(checkShoes);
		return "getList.do";
	}  */
/*	
	@RequestMapping(value="/getCheck.do")
	public String getCheck(ShoesVO vo, Model mod) {
		System.out.println("체크박스 값 가져오기");
		List<ShoesVO> shoes = shoesService.getList(vo);
		mod.addAttribute("shoes", shoes);
		return "getShoesList.jsp";
	}
*/	
	@RequestMapping(value="/getList.do")
	public String getList(ShoesVO vo, Model mod) {
		System.out.println("제품 검색 목록 처리");
		List<ShoesVO> shoesList = shoesService.getList(vo);
		mod.addAttribute("shoesList", shoesList);
		
		return "getShoesList.jsp";
	}
	
	@RequestMapping(value="/dataTransform.do")
	@ResponseBody
	public List<ShoesVO> dataTransform(ShoesVO vo){
//		vo.setSearchCondition("TITLE");
//		vo.setSearchKeyword("");
		
		List<ShoesVO> boardList = shoesService.getList(vo);
		return boardList;
	}
/*	
	@RequestMapping("/checkFirstCategoryList")
	public @ResponseBody List<ShoesVO> checkFirstCategoryList() {
		ShoesVO result = shoesService.getOne(null);
		List<ShoesVO> foreachTest = shoesService.getList(result);
		return result;
	}
	
	@RequestMapping(value="/dataTransformLastData.do")
	@ResponseBody
	public ShoesVO dataTransformLastData(ShoesVO vo){
		return shoesService.getOne(vo);
	}
	
	@RequestMapping(value="/dataTransformXml.do")
	@ResponseBody
	public BoardTbListVO dataTransformXml(ShoesVO vo){
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<ShoesVO> list = shoesService.getList(vo);
		
		BoardTbListVO boardList = new BoardTbListVO();
		boardList.setBoardList(list);
		return boardList;
	}
 */
}
