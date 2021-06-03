<%@page import="com.marigold.shoes.domain.BrandVO"%>
<%@page import="com.marigold.shoes.domain.FourthCategoryVO"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="com.marigold.shoes.domain.ShoesVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 검색 목록</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<style>
	#container{
		margin: 0 auto;
		width: 90%;
	}
	table, td{
		text-align: center;
	}
	table{
		margin: 0 auto;
		border-collapse: collapse;
		border: solid 1px black;
		width: 100%;
	}
	th{
		border-bottom: solid 1px black;
	}
	th, td{
		border-left: solid 1px gray;
		border-right: solid 1px gray;
	}
	a{
		display: block;
		text-align: center;
	}
</style>
</head>
<body>
	<div id="container">
	<h1>제품 검색</h1>
		<form>
			<c:if test="${ not empty shoesList }">
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
					</tr>
					<c:forEach items="${ shoesList }" var="shoes" varStatus="status">
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
							
							<td>${ fourthCategory[status.index].fourthCategoryCon }</td>
							<td>${ brand[status.index].brandCon }</td>

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
									<a href="getOne.do?modelId=${ shoes.modelId }">
										${ shoes.modelId }
									</a>
								</c:if>
							</td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
			<c:if test="${ empty shoesList }">
				검색 결과가 없습니다.
			</c:if>
			<br /><br />
			<a href="./index.jsp">검색화면</a>
		</form>
	</div>
</body>
</html>