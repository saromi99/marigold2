<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="com.marigold.shoes.domain.ShoesVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

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
</style>
</head>
<body>
	<div id="container">
	<%-- ${ shoesList } 오니..... <br /> --%>
	<h1>제품 검색</h1>
		<form>
			<c:if test="${not empty shoesList}">
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
						
					<c:forEach items="${ shoesList }" var="shoes">
						<tr>
							<td>
								<c:if test="${shoes.firstCategory eq 'M'}">
									남자
								</c:if>
								<c:if test="${shoes.firstCategory eq 'W'}">
									여자
								</c:if>
								<c:if test="${shoes.firstCategory eq 'U'}">
									남녀공용
								</c:if>
								<c:if test="${shoes.firstCategory eq 'K'}">
									키즈
								</c:if>
							</td>
							<td>${ shoes.secondCategory }</td>
							<td>${ shoes.thirdCategory }</td>
							<td>${ shoes.fourthCategory }</td>
							<td>${ shoes.brand }</td>
							<td>
								<c:if test="${not empty shoes.specialDay}">
									${ shoes.specialDay }
								</c:if>
							</td>
							<td>${ shoes.color }</td>
							<td>${ shoes.material }</td>
							<td>${ shoes.price } 원</td>
							<td>
								<c:if test="${not empty shoes.heel}">
									${ shoes.heel } cm
								</c:if>
							</td>
							<td>
								<c:if test="${not empty shoes.modelId}">
									${ shoes.modelId }
								</c:if>
							</td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
			<c:if test="${empty shoesList}">
				검색 결과가 없습니다.
			</c:if>
			<br /><br />
			<a href="javascript:history.go(-1)">검색화면</a>
		</form>
	</div>
</body>
</html>