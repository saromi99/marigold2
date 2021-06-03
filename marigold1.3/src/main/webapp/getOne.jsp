<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function fnCalCount(type)  {
		const resultElement = document.getElementById('purchaseCnt');

		let number = resultElement.value;

		if(type === 'p') number = parseInt(number) + 1;
		if(type === 'm' && parseInt(number) > 0) number = parseInt(number) - 1;

		resultElement.value = number;
	}
	
	function purchaseShoes(){
		buyShoes.submit();
	}
</script>
<style>
	#container{
		margin: 0 auto;
	}
	table, td{
		text-align: center;
	}
	table{
		margin: 0 auto;
		border-collapse: collapse;
		border: solid 1px black;
		width: 90%;
	}
	th{
		border-bottom: solid 1px black;
	}
	th, td{
		border-left: solid 1px gray;
		border-right: solid 1px gray;
	}
	#purchaseCnt{
		text-align: center;
	}
	a{
		display: block;
		text-align: center;
	}
</style>
</head>
<body>
	<h1>상세보기 페이지</h1>
	<div id="container">
		<form name="buyShoes" action="buyShoes.do">
			<c:if test="${ not empty shoes }">
				<table>
					<tr>
						<th>첫 번째 카테고리</th>
						<th>두 번째 카테고리</th>
						<th>세 번째 카테고리</th>
						<th>네 번째 카테고리</th>
						<th>브랜드</th>
						<th>상황별 추천</th>
						<th>색</th>
						<th>소재</th>
						<th>가격</th>
						<th>굽</th>
						<th>모델ID</th>
						<th>구매수량</th>
					</tr>
					
					<tr>
						<td>
							<c:if test="${ shoes.firstCategory eq 'M' }">
								남자
							</c:if>
							<c:if test="${ shoes.firstCategory eq 'W' }">
								여자
							</c:if>
							<c:if test="${ shoes.firstCategory eq 'U' }">
								남녀공용
							</c:if>
							<c:if test="${ shoes.firstCategory eq 'K' }">
								키즈
							</c:if>
						</td>
						
						<td>
							<c:if test="${ shoes.secondCategory eq 'S' }">
								슈즈
							</c:if>
							<c:if test="${ shoes.secondCategory eq 'C' }">
								의류
							</c:if>
							<c:if test="${ shoes.secondCategory eq 'B' }">
								가방
							</c:if>
	 						<c:if test="${ shoes.secondCategory eq 'A' }">
								악세서리
							</c:if>
						</td>
						<td>
							<c:if test="${ shoes.thirdCategory eq '1' }">
								운동화
							</c:if>
							<c:if test="${ shoes.thirdCategory eq '2' }">
								스포츠
							</c:if>
							<c:if test="${ shoes.thirdCategory eq '3' }">
								구두
							</c:if>
							<c:if test="${ shoes.thirdCategory eq '4' }">
								샌들
							</c:if>
							<c:if test="${ shoes.thirdCategory eq '5' }">
								캐주얼
							</c:if>
							<c:if test="${ shoes.thirdCategory eq '6' }">
								부츠
							</c:if>
						</td>
						
						<td>${ fourthCategory.fourthCategoryCon }</td>
						<td>${ brand.brandCon }</td>
						<td>
							<c:if test="${ not empty shoes.specialDay }">
								${ shoes.specialDay }
							</c:if>
						</td>
						<td>${ shoes.color }</td>
						<td>${ shoes.material }</td>
						<td>${ shoes.price } 원</td>
						<td>
							<c:if test="${ not empty shoes.heel }">
								${ shoes.heel } cm
							</c:if>
						</td>
						<td>
							<c:if test="${ not empty shoes.modelId }">
								${ shoes.modelId }
								<input type="text" value="${ shoes.modelId }" id="modelId" name="modelId" hidden="hidden" />
							</c:if>
						</td>
						<td class="quantityCount">
							<button type ="button" onclick="fnCalCount('m');">-</button>
        					<input type="text" id="purchaseCnt" name="purchaseCnt" value="0" readonly="readonly" size="2" />
        					<button type="button" onclick="fnCalCount('p');">+</button>
        				</td>
					</tr>
				</table>
				<br />
				<a href="javascript:purchaseShoes();">구매</a>
			</c:if>
			<br />
			<a href="./index.jsp">검색화면</a>
		</form>
	</div>
</body>
</html>