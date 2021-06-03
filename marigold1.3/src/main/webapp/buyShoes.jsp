<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#container{
		margin: 0 auto;
	}
	body {
		margin: 0 auto;
		width: 90%;
	}
	a{
		display: block;
		text-align: center;
	}
</style>
</head>
<body>
	<div id="container">
		<h1>구매가 완료되었습니다.</h1>
		구매품목 : ${ shoes.modelId } <br />
		구매수량 : ${ purchaseCnt } <br />
		<br />
		<a href="./index.jsp">검색화면</a>
	</div>
</body>
</html>